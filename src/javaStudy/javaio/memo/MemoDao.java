package javaStudy.javaio.memo;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class MemoDao {
  static Scanner sc = new Scanner(System.in);
  List<Memo> memoList = new ArrayList<>();

  private static volatile MemoDao instance;

  private MemoDao() {
    // 초기화 코드
  }

  public static MemoDao getInstance() {  //싱글톤
    if (instance == null) {
      synchronized (MemoDao.class) {
        if (instance == null) {
          instance = new MemoDao();
        }
      }
    }
    return instance;
  }

  public int getseq(){  // 현재 메모들의 고유번호 최대값 +1 반환
    int maxNum=0;
    if(memoList.isEmpty()){
      return 1;
    }
    for(Memo memo : memoList){
      maxNum = memo.getNo();
    }
    return maxNum+1;
  }

  public void add (){
    System.out.println("★★작성자, 내용, 입력하세요★★");
    int no = getseq();
    System.out.println("==작성자 입력==");
    String writer = sc.nextLine();
    System.out.println("==내용을 입력하세요. 'exit'를 입력하면 종료합니다.==");

    StringBuilder contentBuilder = new StringBuilder();
    String line;
    while (true) {
      line = sc.nextLine();
      if (line.equals("exit")) break;
      contentBuilder.append(line).append("\\n");
    }
    String content = contentBuilder.toString();
    String date = getDate();
    System.out.println("==중요도 입력 (a~d)==");
    String priority = sc.nextLine();

    Memo memo = new Memo(no,writer,content,date,priority);
    memoList.add(memo); // 리스트에 추가
  }

  public void save(){ // 저장
    try{
      BufferedWriter bw = new BufferedWriter(new FileWriter("memo.dat",false));

      for(Memo me : memoList) {
        StringBuilder sb = new StringBuilder();

        sb.append(me.getNo()).append(",");
        sb.append(me.getWriter()).append(",\"");
        sb.append(me.getContent()).append("\",");
        sb.append(me.getDate()).append(",");
        sb.append(me.getPriority());

        String str = sb.toString();

        bw.write(str, 0, str.length());  // 첫 번째 문자열 쓰기
        bw.newLine();  // 새로운 라인 추가
        bw.flush();  // 버퍼 비우기
      }
      bw.close();
      System.out.println("==저장하였습니다.==");
    }catch(IOException io){
      io.printStackTrace();
    }

  }

  public String getDate() {  // 현재 날짜 반환
    LocalDate currentDate = LocalDate.now();

    // 날짜를 특정 포맷으로 문자열로 변환
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String day = currentDate.format(formatter);
    return day;
  }

  public void getMemo(int num){  // 특정 메모 읽기
    for (Memo memo: memoList) {
      if(memo.getNo() == num){
        System.out.print("\n메모번호 : ");
        System.out.println(memo.getNo());
        System.out.print("내용 : ****** \n");

        String content = memo.getContent();

        String[] arr = content.split("\\\\n"); // 저장될때 \\n 으로 저장됨
        arr[0] = arr[0].replace("\"","");
//        System.out.println(arr[arr.length-1]);
        for (int i = 0; i <arr.length-1; i++) {
          System.out.println(arr[i]);
        }
        System.out.println("******");

        System.out.print("날짜 : ");
        System.out.println(memo.getDate());
        System.out.print("중요도 : ");
        System.out.println(memo.getPriority());
        System.out.println();
        break;
      }
    }
  }

  public void part(int sNo){   // 메모의 content 일부만 보여주기
    int count = 0;  // 4단어까지 나오게 카운트 그 뒤는 .... 표시
    for(Memo memo: memoList){
      if(memo.getNo() == sNo){
        String contentStr = memo.getContent();
        StringTokenizer st = new StringTokenizer(contentStr, "\\n ");

        while(st.hasMoreTokens()){
          if(count++ == 4) {
            System.out.print("....");
            break;
          }
          System.out.print(" " +st.nextToken());
        }
      }
    }
  }

  public void list(){  // 메모 리스트
    System.out.println("======================================================");
    for(Memo memo : memoList){
      System.out.print(memo.getNo()+" "+memo.getWriter()+" ");
      part(memo.getNo());
      System.out.println(" \t"+memo.getDate()+" \t"+memo.getPriority());
    }
    System.out.println("======================================================");
  }

  public void delete(){  // 메모 삭제
    list();
    System.out.println("==삭제할 번호 입력하세요==");
    int deleteNum = Integer.parseInt(sc.nextLine());
    memoList.removeIf(memo -> memo.getNo() == deleteNum);
    System.out.println("==삭제 되었습니다.==");
  }

  public void load(){  // 현재 파일에 저장된 메모 ArrayList에 넣기
    try{
      BufferedReader br = new BufferedReader(new FileReader("memo.dat"));

      String str;

      // 파일에서 한 줄씩 읽어와 출력
      while (true) {
        str = br.readLine();  // 한 줄을 읽어와 변수에 저장
        if (str == null) break;  // 파일의 끝에 도달하면 루프를 종료

        String[] arr = str.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)",-1);

        Memo memo = new Memo(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4]);
        memoList.add(memo);
      }

      br.close();

    }catch (FileNotFoundException e){  // 파일없으면 잡아낼 필요없다.
      e.printStackTrace();
    }catch (IOException io){
      io.printStackTrace();
    }

  }



}
