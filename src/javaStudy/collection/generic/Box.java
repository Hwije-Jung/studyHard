package javaStudy.collection.generic;

import javaStudy.day1.test.A;

import java.util.ArrayList;
import java.util.List;

public class Box <T>{

  private List<T> items;

  public Box() {
     items = new ArrayList<>();
  }

  public void addItem(T item){
    items.add(item);
  }
  public T getItem(){
    if(!items.isEmpty()){
      return items.get(0);
    }
    return null;
  }

  public boolean isempty(){
    return items.isEmpty();
  }
}
