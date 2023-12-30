package javaStudy.day4.inher;

public class BabyCat extends ParentCat{
  private String color;
  public void meow(){

    System.out.println("난 냐옹이다옹!");
  }

  public BabyCat(){}

  BabyCat(String color){
    super("샴고양이"); // 나의 부모 생성자
    this.color = color;

  }
  public void printInfo(){
    super.getBreed();
    System.out.println(color);
  }
}
