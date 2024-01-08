package javaStudy.collection.generic;

public class MyClass2 <T>{
  static <T>void swap(T[] array, int index1, int index2){
    //static이라 메서드에도 <T>를 해줬다.
    T temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;

  }

  public static void main(String[] args) {
    Integer[] intArray = {1,2,3,4,5};
    System.out.println("====Before swap====");
    for(Integer number : intArray){
      System.out.print(number + "");
    }
    System.out.println();
    swap(intArray,1,3);

    System.out.println("====Before swap====");
    for(Integer number : intArray){
      System.out.print(number + "");
    }

  }
}
