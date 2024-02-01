package javaStudy.javaio.memo;



public class Memo {
  private int no;
  private String writer;
  private String content;
  private  String date;
  private String priority;

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getDate() {
    return date;
  }

  public void setData(String data) {
    this.date = data;
  }

  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public Memo(int no, String writer, String content, String date, String priority) {
    this.no = no;
    this.writer = writer;
    this.content = content;
    this.date = date;
    this.priority = priority;
  }
}

