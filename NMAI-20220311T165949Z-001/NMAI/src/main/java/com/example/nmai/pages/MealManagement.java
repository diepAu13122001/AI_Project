package com.example.nmai.pages;

import com.example.nmai.Data.DailyRecipes;
import com.example.nmai.Data.MealPlan;
import com.example.nmai.Data.Nutrients;
import com.example.nmai.Data.Recipe;
import okhttp3.*;

import java.io.IOException;
import java.util.ArrayList;

public class MealManagement {
    private static MealManagement instance;

    public static MealManagement getInstance() {
        if (instance == null) {
            instance = new MealManagement();
        }
        return instance;
    }

    // tim thuc don theo số calo trong ngày
    public Object[] recipesByCaloriesForDay(int calories) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/mealplans/generate?targetCalories=" + calories + "&timeFrame=day")
                .get()
                .addHeader("x-rapidapi-host", "spoonacular-recipe-food-nutrition-v1.p.rapidapi.com")
                .addHeader("x-rapidapi-key", "24c7aefa92msh65d245d3e2bf9d2p1359acjsn201d3a869065")
                .build();
        Response response = client.newCall(request).execute();
        assert response.body() != null;

        String result = response.body().string().split("meals")[1];
        String[] res = result.replaceAll(" :: ", "`").replaceAll(", ", "~").replaceAll("[\"\\{\\[\\}\\]]", " ").replaceAll(" : ", "  ").
                replaceAll(", ", "  ").replaceAll(" :", "  ").split("nutrients");
        ArrayList<Recipe> recipeList = new ArrayList<>();
        Nutrients nutrients = new Nutrients();
        ArrayList<String> tmpList = new ArrayList<>();

        // recipes
        for (String e : res[0].replaceAll("  ", "   ").replaceAll("`", " :: ").replaceAll("~", ", ").split("   ")) {
            String tmp = e.trim();
            if (!tmp.equals("") && !tmp.equals("id") && !tmp.equals("imageType") && !tmp.equals("title") && !tmp.equals("readyInMinutes") && !tmp.equals("servings") && !tmp.equals("sourceUrl")) {
                tmpList.add(tmp);
            }
        }
        for (int i = 0; i < tmpList.size(); i++) {

            if (i % 6 == 0 && i + 5 < tmpList.size()) {
                Recipe recipe = new Recipe(tmpList.get(i), tmpList.get(i + 1), tmpList.get(i + 2), Integer.parseInt(tmpList.get(i + 3)), Integer.parseInt(tmpList.get(i + 4)), tmpList.get(i + 5));
                recipeList.add(recipe);
            }
        }

        // nutrients
        ArrayList<Double> dataList = new ArrayList<>();
        for (String e : res[1].replaceAll("  ", "   ").split("   ")) {
            String tmp = e.trim();
            if (!tmp.equals("") && !tmp.equals("calories") && !tmp.equals("protein") && !tmp.equals("fat") && !tmp.equals("carbohydrates")) {
                dataList.add(Double.parseDouble(tmp));
            }
        }

        nutrients.setCalories(dataList.get(0));
        nutrients.setProtein(dataList.get(1));
        nutrients.setTotalFat(dataList.get(2));
        nutrients.setCarbs(dataList.get(3));

        Object[] resList = {recipeList, nutrients};
        return resList;
    }

    // tim thuc don theo số calo trong tuan
    public MealPlan recipesByCaloriesForWeek(int calories) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/mealplans/generate?targetCalories=" + calories + "&timeFrame=week")
                .get()
                .addHeader("x-rapidapi-host", "spoonacular-recipe-food-nutrition-v1.p.rapidapi.com")
                .addHeader("x-rapidapi-key", "24c7aefa92msh65d245d3e2bf9d2p1359acjsn201d3a869065")
                .build();
        Response response = client.newCall(request).execute();
        assert response.body() != null;

        String result = response.body().string().replaceAll(", ", "~");
        result = result.replaceAll("[\"\\{\\[\\}\\]]", " ").replaceAll("\\\\", "  ").replaceAll(" : ", "  ").
                replaceAll(",", "  ").replaceAll(" :", "  ");
        MealPlan mealPlan = new MealPlan();
        ArrayList<String> res = new ArrayList<>();
        for (String s : result.replaceAll("~", ", ").replaceAll("  ", "    ").replaceAll("   ", "    ").split("    ")) {
            res.add(s.trim());
//            System.out.println(s.trim());
        }
        String mealPlanId = res.get(2);
        boolean isPublished = Boolean.parseBoolean(res.get(4));
        ArrayList<String> temp = new ArrayList<>();
        for (String s : new ArrayList<>(res.subList(res.indexOf("items") + 1, res.size()))) {
            if (!s.equals("") && !s.equals("day") && !s.equals("mealPlanId") && !s.equals("slot") && !s.equals("position") && !s.equals("type") && !s.equals("value")
                    && !s.equals("id") && !s.equals("imageType") && !s.equals("title")) {
                temp.add(s);
            }
        }

        ArrayList<DailyRecipes> dailyRecipesList = new ArrayList<>();
        for (int i = 0; i < temp.size(); i++) {
            if (i % 8 == 0 && i + 7 < temp.size()) {
                DailyRecipes dailyRecipes = new DailyRecipes();
                dailyRecipes.setNumOfDay(Integer.parseInt(temp.get(i)));
                dailyRecipes.setMealPlanId(Integer.parseInt(temp.get(i + 1)));
                dailyRecipes.setSlot(Integer.parseInt(temp.get(i + 2)));
                dailyRecipes.setPosition(Integer.parseInt(temp.get(i + 3)));
                dailyRecipes.setType(temp.get(i + 4));
                dailyRecipes.setValues(new Recipe(temp.get(i + 5), temp.get(i + 6), temp.get(i + 7)));
                dailyRecipesList.add(dailyRecipes);
            }
        }
        mealPlan.setMealPlanId(mealPlanId);
        mealPlan.setPublishAsPublic(isPublished);
        mealPlan.setDailyRecipesList(dailyRecipesList);

        return mealPlan;
    }

    public ArrayList<String> getProductNutritionById(String id) throws IOException {
        ArrayList<String> result = new ArrayList<>();
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/food/products/365750/nutritionWidget")
                .get()
                .addHeader("accept", "text/html")
                .addHeader("x-rapidapi-host", "spoonacular-recipe-food-nutrition-v1.p.rapidapi.com")
                .addHeader("x-rapidapi-key", "24c7aefa92msh65d245d3e2bf9d2p1359acjsn201d3a869065")
                .build();
        Response response = client.newCall(request).execute();
        assert response.body() != null;
        for (String s : response.body().string().split("><")) {
            result.add(s);
            System.out.println();
        }
        return result;
    }

}
