package javaStudy.stream.section3;

import java.util.ArrayList;
import java.util.List;

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


  }
}
