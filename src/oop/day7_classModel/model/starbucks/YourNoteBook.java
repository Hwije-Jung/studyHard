package oop.day7_classModel.model.starbucks;

public class YourNoteBook {
  private Wifi internet;

  public YourNoteBook(Wifi wifi){
    this.internet = wifi;
  }

  void openBrowser(){
    this.internet.connectionInternet();
  }

  void openKakaTalk(){
    this.internet.connectionInternet();
  }
}
