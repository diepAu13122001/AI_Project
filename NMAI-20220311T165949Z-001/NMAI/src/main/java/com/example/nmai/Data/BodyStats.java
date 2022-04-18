package com.example.nmai.Data;

import java.util.*;

public class BodyStats {
    private int height;
    private int age;
    private double weight;
    private int dayOfPeriod;
    private Date timeForPeriod;
    private double caloriesNeedForDay;
    private int amountOfWaterNeed;

    public BodyStats() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getDayOfPeriod() {
        return dayOfPeriod;
    }

    public void setDayOfPeriod(int dayOfPeriod) {
        this.dayOfPeriod = dayOfPeriod;
    }

    public Date getTimeForPeriod() {
        return timeForPeriod;
    }

    public void setTimeForPeriod(Date timeForPeriod) {
        this.timeForPeriod = timeForPeriod;
    }

    public double getCaloriesNeedForDay() {
        return caloriesNeedForDay;
    }

    public void setCaloriesNeedForDay(double caloriesNeedForDay) {
        this.caloriesNeedForDay = caloriesNeedForDay;
    }

    public int getAmountOfWaterNeed() {
        return amountOfWaterNeed;
    }

    public void setAmountOfWaterNeed(int amountOfWaterNeed) {
        this.amountOfWaterNeed = amountOfWaterNeed;
    }

    public double calculateBMI() {

        return 0;
    }

    public String BMIStats() {
        return "";
    }
}
