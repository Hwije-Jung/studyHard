package javaStudy.stream.section3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilteringEx {
  public static void main(String[] args) {

    //1. List<String> 컬렉션 AraayList namelist 생성하세요
    List<String> nameList = new ArrayList<>();


    //2. namelist에 이름을 추가해주세요. 같은 이름을 두번 넣어주세요.
    nameList.add("정휘제");
    nameList.add("서유미");
    nameList.add("이한강");
    nameList.add("이수연");
    nameList.add("정휘제");


    //3. 중복 요소 제거 해 봅시다.
    nameList.stream().distinct().forEach(System.out::println);

    //4. "정"으로 시작하는 요소만 필터링
    Stream<String> jungganae = nameList.stream().filter(name -> name.startsWith("정"));

    //중복요소를 제거하고, "정으로 시작하는 요소만 필터링 하여 lastnamelist로 저장하세요
    Stream<String> lastnameList = nameList.stream().filter(name -> name.startsWith("정")).distinct();

    //lastnameList를 출력하세요.
    lastnameList.forEach(System.out::println);

  }
}
