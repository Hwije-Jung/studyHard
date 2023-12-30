package javaStudy.day7_classModel.model.starbucks;

public class MyNoteBook {
  private Wifi internet;

private MyNoteBook(Wifi wifi){
//    this.internet = wifi;
//    this.internet = new Wifi(); // 부품 생성
    // 마이놑북클래스 여기서만 , 다른데사용할 수 없다.

  }

  void openBrowser(){
    this.internet.connectionInternet();
  }

}
