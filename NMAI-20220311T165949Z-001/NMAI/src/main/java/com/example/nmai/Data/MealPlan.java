package com.example.nmai.Data;

import java.util.ArrayList;

public class MealPlan {
    private String mealPlanId;
    private boolean publishAsPublic;
    private ArrayList<DailyRecipes> dailyRecipesList;

    public MealPlan(String mealPlanId, boolean publishAsPublic, ArrayList<DailyRecipes> dailyRecipesList) {
        this.mealPlanId = mealPlanId;
        this.publishAsPublic = publishAsPublic;
        this.dailyRecipesList = dailyRecipesList;
    }

    public MealPlan() {

    }

    public String getMealPlanId() {
        return mealPlanId;
    }

    public void setMealPlanId(String mealPlanId) {
        this.mealPlanId = mealPlanId;
    }

    public boolean isPublishAsPublic() {
        return publishAsPublic;
    }

    public void setPublishAsPublic(boolean publishAsPublic) {
        this.publishAsPublic = publishAsPublic;
    }

    public ArrayList<DailyRecipes> getDailyRecipesList() {
        return dailyRecipesList;
    }

    public void setDailyRecipesList(ArrayList<DailyRecipes> dailyRecipesList) {
        this.dailyRecipesList = dailyRecipesList;
    }

    @Override
    public String toString() {
        return "MealPlan{" +
                "mealPlanId='" + mealPlanId + '\'' +
                ", publishAsPublic=" + publishAsPublic +
                ", dailyRecipesList=" + dailyRecipesList.toString() +
                '}';
    }
}
