package javaStudy.stream.section3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionEx {
  public static void main(String[] args) {
    List<Member> memberList = Arrays.asList(
            new Member(1, "홍길동", "F"),
            new Member(2, "홍삼동", "M"),
            new Member(3, "김길동", "M"),
            new Member(4, "손지나", "F"),
            new Member(5, "윤성렬", "M"));

    // 남자회원 "M" 따로 menList에 저장하고 출력

    List<Member> menList1 = memberList.stream()
            .filter(member -> member.getGender().equals("M")).toList();

    List<Member> menList2 = memberList.stream()
            .filter(member -> member.getGender().equals("M")).collect(Collectors.toList());

    System.out.println(menList1 + " " + menList2);

    //회원정보 리스트에서 이름만 추출하여 출력하세요
    memberList.stream().forEach(member -> System.out.println(member.getName()));

    //회원의 회원번호를 키로 회원이름을 값으로 하여 Map생성
    // 넘버가 키가되도록 매핑
    Map<Integer, String> map = memberList.stream()
            .collect(Collectors.toMap(Member::getNo, Member::getName));
    System.out.println(map);

    //"M" "F" 키로 설정하여 List<Member>
    Map<String, List<Member>> genderGroupmap
            = memberList.stream().collect(Collectors.groupingBy(Member::getGender));

    System.out.println("====남성회원리스트====");
    List<Member> maleMemberList = genderGroupmap.get("M");
    maleMemberList.stream().forEach(member -> System.out.println(member.getName()));

    System.out.println("====여성회원리스트====");
    List<Member> femaleMemberList = genderGroupmap.get("F");
    femaleMemberList.stream().forEach(member -> System.out.println(member.getName()));

    System.out.printf("%010d",231);
  }
}
