package com.example.nmai.Data;

public class Recipe {
    private String id;
    private String imageType;
    private String tittle;
    private int readyInMinutes;
    private int servings;
    private String sourceURL;

    public Recipe(String id, String imageType, String tittle, int readyInMinutes, int servings, String sourceURL) {
        this.id = id;
        this.imageType = imageType;
        this.tittle = tittle;
        this.readyInMinutes = readyInMinutes;
        this.servings = servings;
        this.sourceURL = sourceURL;
    }

    public Recipe() {

    }

    // for meal plan
    public Recipe(String id, String imageType, String tittle) {
        this.id = id;
        this.imageType = imageType;
        this.tittle = tittle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getReadyInMinutes() {
        return readyInMinutes;
    }

    public void setReadyInMinutes(int readyInMinutes) {
        this.readyInMinutes = readyInMinutes;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public String getSourceURL() {
        return sourceURL;
    }

    public void setSourceURL(String sourceURL) {
        this.sourceURL = sourceURL;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id='" + id + '\'' +
                ", imageType='" + imageType + '\'' +
                ", tittle='" + tittle + '\'' +
                ", readyInMinutes=" + readyInMinutes +
                ", servings=" + servings +
                ", sourceURL='" + sourceURL + '\'' +
                '}';
    }

    public String toStringForMealPlan() {
        return "Recipe{" +
                "id='" + id + '\'' +
                ", imageType='" + imageType + '\'' +
                ", tittle='" + tittle + '\'';
    }
}
