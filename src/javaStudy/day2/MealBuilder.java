package javaStudy.day2;

public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.additem(new VegBerger());
        meal.additem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.additem(new ChickenBurger());
        meal.additem(new Pepsi());
        return meal;
    }
}
