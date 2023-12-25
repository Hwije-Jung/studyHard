package quiz.weather.Sensor;

import java.util.Scanner;

public class Rsensor implements Sensor{
  Scanner sc = new Scanner(System.in);
  int rain;

  public Rsensor(){}

  @Override
  public int get() {
    rain = sc.nextInt();
    return rain;
  }
}
