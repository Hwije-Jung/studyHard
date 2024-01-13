package javaStudy.stream;

public class Student implements Comparable<Student>{
  private String name;
  private Integer score;


  public String getName() {
    return name;
  }

  public Integer getScore() {
    return score;
  }

  public Student(String name, Integer score) {
    this.name = name;
    this.score = score;
  }
@Override
  public int compareTo(Student o){
    return Integer.compare(score, o.score);
  }

}
