package oop.day7_classModel.model.starbucks;

public class Main {
  public static void main(String[] args) {
    Wifi internet = new Wifi();
    
//    MyNoteBook myNoteBook =  new MyNoteBook(internet);
    YourNoteBook yourNoteBook = new YourNoteBook(internet);
//    myNoteBook.openBrowser();
    yourNoteBook.openKakaTalk();
  }
}
