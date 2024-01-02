package javaStudy.collection.list;

public class StudentMain {
  public static void main(String[] args) {
    StudentDao dao = new StudentDao();

    dao.getStudentList();
    dao.studentExamInsert();
    dao.studentRecordPrint();
    dao.studentUpdate();
    dao.studentPrintAll();
    dao.studentPickPrint();
  }
}
