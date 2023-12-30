package javaStudy.day3;

public class AddObject {
  //단계

  private  Object a;
  private  Object b;
  private int integerResult;
  private double doubleResult;

  AddObject(){}
  AddObject(int a, int b){
    this.a =(Integer)a;
    this.b = (Integer)b;
    adder(a,b);
  }
  AddObject(double a, double b){
    this.a =(Double) a;
    this.b =(Double) b;
    adder(a,b);
  }
  AddObject(int a , double b){
    this.a =(Integer)a;
    this.b =(Double)b;
    adder(a,b);
  }

  public void adder(Integer number1, Integer number2){
    if((number1 instanceof Integer)&&(number2 instanceof Integer)){
      int result = number1.intValue() + number2.intValue();
      System.out.printf("\n%d",result);
    }
  }
  public void adder(Double number1, Double number2){
    if((number1 instanceof Double)&&(number2 instanceof Double)){
      double result = number1.doubleValue() + number2.doubleValue();
      System.out.printf("\n %.2f",result);
    }
  }
  public void adder(Integer number1, Double number2){
    if((number1 instanceof Integer)&&(number2 instanceof Double)){
      double result = (double)number1.intValue() + number2.doubleValue();
      System.out.printf("\n %.2f",result);
    }
  }



       /* if((number1 instanceof Integer)&&(number2 instanceof Integer)){

        }
            else if((number1 instanceof Double) && (number2 instanceof  Double)){}
                else if((number1 instanceof Integer) && (number2 instanceof Double)){}
                   else{}

    }  */


     /* public void adder(int a, int b){
        int result = a + b;
          System.out.println(result);
      }
      public void adder(double a, double b){
        double result = a + b;
          System.out.println(result);
      }
      public void adder(int a, double b){
        double result = a + b;
          System.out.println(result);
      }
*/

}
