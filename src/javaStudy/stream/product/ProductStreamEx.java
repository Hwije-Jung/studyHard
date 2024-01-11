package javaStudy.stream.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductStreamEx {
  public static void main(String[] args) {
    //1. 외부반복자 fori를 이용하여 Product를 생성할 때
    // 제품번호=>i, 상품명 => "상품명"+i , "shinsegae",
    // 가격 random()메소드로 책정하여 10개 생성하여 리스트컬렉션
    // productList에 저장합니다

    List<Product> productList = new ArrayList<>();
    Random random = new Random();

    for (int i = 0;  i < 10; i++) {
      productList.add(new Product(i,"상품명"+i,"shinsegae",(int)(Math.random() * 10000)+1));
    }


    //2. 객체 스트림을 통하여 productList의 상품정보를 출력합니다.
    productList.stream().forEach(System.out::println);
  }
}
