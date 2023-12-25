package quiz.weather.Sensor;

import java.util.Scanner;

public class Tsensor implements Sensor{
  Scanner sc = new Scanner(System.in);
  int themo;

  @Override
  public int get() {
    themo = sc.nextInt();
    return themo;
  }
}
