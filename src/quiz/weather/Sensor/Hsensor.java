package quiz.weather.Sensor;

import java.util.Scanner;

public class Hsensor implements Sensor{
  Scanner sc = new Scanner(System.in);
  int humi;

  @Override
  public int get() {
    this.humi = sc.nextInt();
    return humi;
  }
}
