package javaStudy.day4.inher;

public class ParentCat extends Object{ // Object 상속 생략
  private String breed;
  public void eat(){
    System.out.println("냠냠 먹이를 먹다.");
  }

  ParentCat(){}

  ParentCat(String breed){
    this.breed = breed;
  }

  public String getBreed() {
    return breed;
  }
}
