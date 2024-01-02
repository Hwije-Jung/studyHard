package javaStudy.collection.list;

public class Student {
  private int stuno;
  private String name;
  private int kor;
  private int eng;
  private int math;
  private int arr[] = new int[3];

  public int[] getArr() {
    return arr;
  }

  public void setArr(int[] arr) {
    this.arr = arr;
  }

  public Student(int stuno, String name) {
    this.stuno = stuno;
    this.name = name;
  }

  public int getStuno() {
    return stuno;
  }

  public void setStuno(int stuno) {
    this.stuno = stuno;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getKor() {
    return kor;
  }

  public void setKor(int kor) {
    this.kor = kor;
  }

  public int getEng() {
    return eng;
  }

  public void setEng(int eng) {
    this.eng = eng;
  }

  public int getMath() {
    return math;
  }

  public void setMath(int math) {
    this.math = math;
  }
}
