package oop.day7_classModel.model;

public class Person {
//  private Phone phone; //연관관계
//
//  Person(Phone phone){
//    this.phone = phone;
//  }
//  public void createMessage(){//연관관계
//    String message="안녕 반가워. 오늘 몇시에 만날까?";
//    String to = "내사랑";
////    폰의 문자 전송기능 호출 this.phone
//    this.phone.sendMessage(to,message);
//  }
  //생성자 인젝션
        //세터(메소드) 인젝션

  public void sendMessage(Phone phone){
    String to = "나의 벗";
    String message = "보고싶다.";
    //전달받은 매개변수를통해
    phone.sendMessage(to,message);
  }
}