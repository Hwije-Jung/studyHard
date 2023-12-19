package oop.day4.inher.family;

public class SubFather extends GrandFather{
  private String familyName;
  private String houseAddress;
  private String job = "프로그래머";

  SubFather(String familyName, String houseAddress){
    this. familyName = familyName;
    this. houseAddress = houseAddress;
  }

  public void printFather(){
    System.out.println("나는 아버지 입니다. 나는 할아버지로부터 상속받습니다.");
  }

  public String getFamilyName() {
    return familyName;
  }

  public String getHouseAddress() {
    return houseAddress;
  }

  public String getJob() {
    return job;
  }
}
