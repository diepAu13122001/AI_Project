package com.example.nmai.Data;

import java.util.ArrayList;

public class DailyRecipes {

    private int numOfDay;
    private int mealPlanId;
    private int slot; // buoi an
    private int position;
    private String type;
    private Recipe values;

    public DailyRecipes(int numOfDay, int mealPlanId, int slot, int position, String type, Recipe values) {
        this.numOfDay = numOfDay;
        this.mealPlanId = mealPlanId;
        this.slot = slot;
        this.position = position;
        this.type = type;
        this.values = values;
    }

    public DailyRecipes() {

    }

    public int getNumOfDay() {
        return numOfDay;
    }

    public void setNumOfDay(int numOfDay) {
        this.numOfDay = numOfDay;
    }

    public int getMealPlanId() {
        return mealPlanId;
    }

    public void setMealPlanId(int mealPlanId) {
        this.mealPlanId = mealPlanId;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Recipe getValues() {
        return values;
    }

    public void setValues(Recipe values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "DailyRecipes{" +
                "numOfDay=" + numOfDay +
                ", mealPlanId=" + mealPlanId +
                ", slot=" + slot +
                ", position=" + position +
                ", type='" + type + '\'' +
                ", values=" + values.toStringForMealPlan() +
                '}';
    }
}
