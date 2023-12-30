package javaStudy.day2;

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
