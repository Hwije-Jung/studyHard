package quiz.appliance;

public class KimchiRefrigerator extends Refrigerator{
  public KimchiRefrigerator(String refrigeratorType){
    super(refrigeratorType);
  }
  @Override
  public void mePrint() {
    System.out.println(super.refrigeratorType+"입니다.");
  }
}
