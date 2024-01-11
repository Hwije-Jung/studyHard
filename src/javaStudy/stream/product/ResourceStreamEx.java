package javaStudy.stream.product;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//배열로부터 스트림 얻기 : java.util.Arrays 클래스를 이용하면 다양한 종류의
//배열로부터 스트림을 얻어 낼 수 있다.
public class ResourceStreamEx {

  public static int total;

  public static void main(String[] args) throws Exception {
    //1.
    String[] strings = {"초코파이", "몽쉘통통", "에이스", "홈런볼"};
    //strings 스트림 객체를 얻어, strings의 각 요소값을 출력하세요.
    Stream<String> st = Arrays.stream(strings);
    st.forEach(System.out::println);

    //2. Integer 스트림 객체 얻기
    int[] scores = {90, 80, 77, 80, 65, 98};

    //Integer 스트림 객체를 얻어, scores의 각 요소값의 총합과 평균과 해당 요소의 개수를 출력하세요
    IntStream scoreStream = Arrays.stream(scores);
    int sum = scoreStream.sum();
    IntStream scoreStream1 = Arrays.stream(scores);
    double avg = scoreStream1.average().getAsDouble();
    IntStream scoreStream2 = Arrays.stream(scores);
    long count = scoreStream2.count();

    System.out.println(sum + " " + avg + " " + count);

    //3. 숫자 범위로부터 스트림 얻기 (IntStream 또는 LongStream의 정적메소드 range(), rangedClosed())
    IntStream stream = IntStream.range(1, 100);
    IntStream stream1 = IntStream.rangeClosed(1, 100);
    stream.forEach(number -> total += number);

    System.out.println("총합: " + total); // 1~99까지더해짐

    StringBuilder sb = new StringBuilder();
    int row = 3;
    int column = 5;
    IntStream.range(0, column).forEach(s -> sb.append("*"));
    IntStream.range(0, row).forEach(i -> System.out.println(sb));

    //4. 파일로부터 스트림 얻기
    //java.nio.file.Files의 line() 이용하면, 텍스트 파일의 행 단위 스트림을 얻을 수 있다.
    Path path = Paths.get(ResourceStreamEx.class.getResource("productlist.txt").toURI());
    Stream<String> filestream = Files.lines(path, Charset.defaultCharset());
    filestream.forEach(line -> System.out.println(line));
    filestream.close();
  }
}
