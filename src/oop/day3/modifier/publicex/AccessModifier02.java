package oop.day3.modifier.publicex;

public class AccessModifier02 extends Dog1{
  public static void main(String[] args) {
    Dog1 dogObj1 = new Dog1();
    dogObj1.bread = "포메";
    dogObj1.color = "흰색";
    dogObj1.age = 5;
    Animal animal = new Animal();
    animal.name = "푸바우";
    System.out.println(animal.getName());
    animal.color="갈색";
    animal.getColor();
//  animal.point();

    System.out.println(dogObj1.bread+" "+dogObj1.color+" "+dogObj1.age);
  }
}
