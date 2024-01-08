package javaStudy.collection.generic;

public class Pair<T, U> {
  private T t;
  private U u;

  public void method (T a , U b){
    T temp = (T)b;
    b = (U)a;
    a = (T)b;
  }

  public Pair(T t, U u) {
    this.t = t;
    this.u = u;
  }

  public T getT() {
    return t;
  }

  public U getU() {
    return u;
  }
}
