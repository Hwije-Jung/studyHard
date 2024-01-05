package javaStudy.collection.app;

import java.util.TreeSet;

public class CompareableMember {
  public static void main(String[] args) {
    TreeSet<Member> members = new TreeSet<>();
    //객체 저장
    members.add(new Member("김진염", 22));
    members.add(new Member("김진아", 21));
    members.add(new Member("김소영", 21));
    members.add(new Member("박소영", 25));

    // implements 안해주면 member는 기준이없어서 에러남
    // overriding 안해주면 김진염 22 만나옴
    for (Member m : members) {
      System.out.println(m.name + " " + m.age);
    }
  }
}
