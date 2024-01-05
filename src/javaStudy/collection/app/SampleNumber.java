package javaStudy.collection.app;

public class SampleNumber implements Comparable<SampleNumber>{

  int first = 1;
  int second = 2;
  int third = 3;

  @Override
  public String toString() {
    return "SampleNumber{" +
            "[first=" + first +
            ", [second[=" + second +
            ", [third]=" + third +
            '}';
  }

  @Override
  public int compareTo(SampleNumber o) {
    int result = Integer.compare(first,o.first);
    if(result == 0){
      result = Integer.compare(second,o.second);
      if(result == 0){
        result = Integer.compare(third,o.third);
      }
    }
    return result;
  }

  public SampleNumber(int first, int second, int third) {
    this.first = first;
    this.second = second;
    this.third = third;
  }
}
