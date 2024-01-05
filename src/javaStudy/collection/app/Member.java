package javaStudy.collection.app;

public class Member implements Comparable<Member>{
  public String name;
  public Integer age;
  public Member(String name, Integer age){
    this.name = name;
    this.age = age;
  }
  public int hashCode(){
    return name.hashCode() + age;
  }

  public boolean equals(Object o){
    if(o instanceof Member m){
      return m.name.equals(name) && (m.age == age);
    }else {
      return false;
    }
  }

//  @Override
//  public int compareTo(Object o) {
//    return 0;
//  }

 //오름차순 정렬하고 싶다.
  // 기준점 제시
  @Override
  public int compareTo(Member o) {
    if(age<o.age) return  -1; //주어진것보다 작으면
    else if(age == o.age) return 0; // 같으면
    else return 1;
  }



}
