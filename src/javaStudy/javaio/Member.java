package javaStudy.javaio;

import java.io.Serializable;

public class Member implements Serializable { // 이거 구현한객체만 직렬화 가능
  private static final long serialVersionUID = 10000000L;
  String name;
   Integer age;

  Member(String name, Integer age){
    this.name = name;
    this.age = age;
  }
}
