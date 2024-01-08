package javaStudy.collection.generic;

public class Pair1<T> {
  private T first;
  private T second;

  public Pair1(T first, T second) {
    this.first = first;
    this.second = second;
  }
  public void swap(){
    T temp = first;
    first = second;
    second = temp;
  }

  public T getFirst() {return first;}

  public T getSecond() {return second;}


  public static void main(String[] args) {
    Pair1<Integer> intPair = new Pair1(1,2);
    System.out.println(intPair.getFirst()+", "+intPair.getSecond());
  }

}
