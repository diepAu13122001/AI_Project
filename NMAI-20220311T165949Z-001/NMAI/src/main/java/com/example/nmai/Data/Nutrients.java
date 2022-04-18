package com.example.nmai.Data;

public class Nutrients {
    private double calories;
    private double caloriesPercentage;
    private double protein;
    private double proteinPercentage;
    private double totalFat;
    private double fatPercentage;
    private double saturatedFat;
    private double saturatedFatPercentage;
    private double carbs;
    private double barbsPercentage;
    private double sugar;
    private double sugarPercentage;
    private double cholesterol;
    private double cholesterolPercentage;
    private double sodium;
    private double sodiumPercentage;
    private double vitaminB1;
    private double vitaminB1Percentage;
    private double fiber;
    private double fiberPercentage;
    private double vitaminB3;
    private double vitaminB3Percentage;
    private double vitaminB2;
    private double vitaminB2Percentage;
    private double iron;
    private double ironPercentage;
    private double calcium;
    private double calciumPercentage;

    // for visualize menu item Nutrition (by id)
    public Nutrients(double calories, double caloriesPercentage, double protein, double proteinPercentage, double totalFat, double fatPercentage, double saturatedFat, double saturatedFatPercentage, double carbs, double barbsPercentage, double sugar, double sugarPercentage, double cholesterol, double cholesterolPercentage, double sodium, double sodiumPercentage, double vitaminB1, double vitaminB1Percentage, double fiber, double fiberPercentage, double vitaminB3, double vitaminB3Percentage, double vitaminB2, double vitaminB2Percentage, double iron, double ironPercentage, double calcium, double calciumPercentage) {
        this.calories = calories;
        this.caloriesPercentage = caloriesPercentage;
        this.protein = protein;
        this.proteinPercentage = proteinPercentage;
        this.totalFat = totalFat;
        this.fatPercentage = fatPercentage;
        this.saturatedFat = saturatedFat;
        this.saturatedFatPercentage = saturatedFatPercentage;
        this.carbs = carbs;
        this.barbsPercentage = barbsPercentage;
        this.sugar = sugar;
        this.sugarPercentage = sugarPercentage;
        this.cholesterol = cholesterol;
        this.cholesterolPercentage = cholesterolPercentage;
        this.sodium = sodium;
        this.sodiumPercentage = sodiumPercentage;
        this.vitaminB1 = vitaminB1;
        this.vitaminB1Percentage = vitaminB1Percentage;
        this.fiber = fiber;
        this.fiberPercentage = fiberPercentage;
        this.vitaminB3 = vitaminB3;
        this.vitaminB3Percentage = vitaminB3Percentage;
        this.vitaminB2 = vitaminB2;
        this.vitaminB2Percentage = vitaminB2Percentage;
        this.iron = iron;
        this.ironPercentage = ironPercentage;
        this.calcium = calcium;
        this.calciumPercentage = calciumPercentage;
    }

    // for daily recipes recommend
    public Nutrients(double calories, double protein, double totalFat, double carbs) {
        this.calories = calories;
        this.protein = protein;
        this.totalFat = totalFat;
        this.carbs = carbs;
    }

    public Nutrients (){

    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getCaloriesPercentage() {
        return caloriesPercentage;
    }

    public void setCaloriesPercentage(double caloriesPercentage) {
        this.caloriesPercentage = caloriesPercentage;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getProteinPercentage() {
        return proteinPercentage;
    }

    public void setProteinPercentage(double proteinPercentage) {
        this.proteinPercentage = proteinPercentage;
    }

    public double getTotalFat() {
        return totalFat;
    }

    public void setTotalFat(double totalFat) {
        this.totalFat = totalFat;
    }

    public double getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(double fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    public double getSaturatedFat() {
        return saturatedFat;
    }

    public void setSaturatedFat(double saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    public double getSaturatedFatPercentage() {
        return saturatedFatPercentage;
    }

    public void setSaturatedFatPercentage(double saturatedFatPercentage) {
        this.saturatedFatPercentage = saturatedFatPercentage;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public double getBarbsPercentage() {
        return barbsPercentage;
    }

    public void setBarbsPercentage(double barbsPercentage) {
        this.barbsPercentage = barbsPercentage;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getSugarPercentage() {
        return sugarPercentage;
    }

    public void setSugarPercentage(double sugarPercentage) {
        this.sugarPercentage = sugarPercentage;
    }

    public double getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(double cholesterol) {
        this.cholesterol = cholesterol;
    }

    public double getCholesterolPercentage() {
        return cholesterolPercentage;
    }

    public void setCholesterolPercentage(double cholesterolPercentage) {
        this.cholesterolPercentage = cholesterolPercentage;
    }

    public double getSodium() {
        return sodium;
    }

    public void setSodium(double sodium) {
        this.sodium = sodium;
    }

    public double getSodiumPercentage() {
        return sodiumPercentage;
    }

    public void setSodiumPercentage(double sodiumPercentage) {
        this.sodiumPercentage = sodiumPercentage;
    }

    public double getVitaminB1() {
        return vitaminB1;
    }

    public void setVitaminB1(double vitaminB1) {
        this.vitaminB1 = vitaminB1;
    }

    public double getVitaminB1Percentage() {
        return vitaminB1Percentage;
    }

    public void setVitaminB1Percentage(double vitaminB1Percentage) {
        this.vitaminB1Percentage = vitaminB1Percentage;
    }

    public double getFiber() {
        return fiber;
    }

    public void setFiber(double fiber) {
        this.fiber = fiber;
    }

    public double getFiberPercentage() {
        return fiberPercentage;
    }

    public void setFiberPercentage(double fiberPercentage) {
        this.fiberPercentage = fiberPercentage;
    }

    public double getVitaminB3() {
        return vitaminB3;
    }

    public void setVitaminB3(double vitaminB3) {
        this.vitaminB3 = vitaminB3;
    }

    public double getVitaminB3Percentage() {
        return vitaminB3Percentage;
    }

    public void setVitaminB3Percentage(double vitaminB3Percentage) {
        this.vitaminB3Percentage = vitaminB3Percentage;
    }

    public double getVitaminB2() {
        return vitaminB2;
    }

    public void setVitaminB2(double vitaminB2) {
        this.vitaminB2 = vitaminB2;
    }

    public double getVitaminB2Percentage() {
        return vitaminB2Percentage;
    }

    public void setVitaminB2Percentage(double vitaminB2Percentage) {
        this.vitaminB2Percentage = vitaminB2Percentage;
    }

    public double getIron() {
        return iron;
    }

    public void setIron(double iron) {
        this.iron = iron;
    }

    public double getIronPercentage() {
        return ironPercentage;
    }

    public void setIronPercentage(double ironPercentage) {
        this.ironPercentage = ironPercentage;
    }

    public double getCalcium() {
        return calcium;
    }

    public void setCalcium(double calcium) {
        this.calcium = calcium;
    }

    public double getCalciumPercentage() {
        return calciumPercentage;
    }

    public void setCalciumPercentage(double calciumPercentage) {
        this.calciumPercentage = calciumPercentage;
    }

    @Override
    public String toString() {
        return "Nutrients{" +
                "calories=" + calories +
                ", protein=" + protein +
                ", totalFat=" + totalFat +
                ", carbs=" + carbs +
                '}';
    }

    public String toStringAll() {
        return "Nutrients{" +
                "calories=" + calories +
                ", caloriesPercentage=" + caloriesPercentage +
                ", protein=" + protein +
                ", proteinPercentage=" + proteinPercentage +
                ", totalFat=" + totalFat +
                ", fatPercentage=" + fatPercentage +
                ", saturatedFat=" + saturatedFat +
                ", saturatedFatPercentage=" + saturatedFatPercentage +
                ", carbs=" + carbs +
                ", barbsPercentage=" + barbsPercentage +
                ", sugar=" + sugar +
                ", sugarPercentage=" + sugarPercentage +
                ", cholesterol=" + cholesterol +
                ", cholesterolPercentage=" + cholesterolPercentage +
                ", sodium=" + sodium +
                ", sodiumPercentage=" + sodiumPercentage +
                ", vitaminB1=" + vitaminB1 +
                ", vitaminB1Percentage=" + vitaminB1Percentage +
                ", fiber=" + fiber +
                ", fiberPercentage=" + fiberPercentage +
                ", vitaminB3=" + vitaminB3 +
                ", vitaminB3Percentage=" + vitaminB3Percentage +
                ", vitaminB2=" + vitaminB2 +
                ", vitaminB2Percentage=" + vitaminB2Percentage +
                ", iron=" + iron +
                ", ironPercentage=" + ironPercentage +
                ", calcium=" + calcium +
                ", calciumPercentage=" + calciumPercentage +
                '}';
    }
}
