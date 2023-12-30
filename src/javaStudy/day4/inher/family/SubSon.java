package javaStudy.day4.inher.family;

public class SubSon extends SubFather{

  SubSon (String familyName, String houseAddress){
    super(familyName, houseAddress);
  }
  public void printSon(){
    System.out.println("나는 아들입니다.");
    System.out.println("나는 아버지로부터 상속받습니다.");
  }

  public void printFatherJob(){
    System.out.println("나의 아버지 직업은 "+super.getJob());
  }

  public void printAddress(){
    System.out.println("나의 집은 "+super.getHouseAddress());
  }

  public void printFamilyName(){
    System.out.println("우리집 이름은 "+super.getFamilyName());
  }
}
