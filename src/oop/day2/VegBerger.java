package oop.day2;

import oop.NutritionFacts;

public class VegBerger extends Burger {

    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 10.5f;
    }
}
