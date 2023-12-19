package oop.day2;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    // - (private 접근 제한자로 설정)
    private List<Item> items = new ArrayList<Item>();


    public void additem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) { // iter 치셈
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.println("Item : "+item.name());
            System.out.println(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }

}
