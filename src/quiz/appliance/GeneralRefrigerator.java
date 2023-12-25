package quiz.appliance;

public class GeneralRefrigerator extends Refrigerator{

  public GeneralRefrigerator(String refrigerator){
    super(refrigerator);
  }
  @Override
  public void mePrint() {
    System.out.println(super.refrigeratorType+"입니다.");
  }
}
