package quiz.weather;

import quiz.weather.Sensor.Hsensor;
import quiz.weather.Sensor.Rsensor;
import quiz.weather.Sensor.Sensor;
import quiz.weather.Sensor.Tsensor;
import quiz.weather.actor.Broker;

public class MySensorBroker {
  public static void main(String[] args) {


    Sensor[] sa = new Sensor[3];
    System.out.println("습도, 강수량, 온도 입력:");
    sa[0] = new Hsensor();
    sa[1] = new Rsensor();
    sa[2] = new Tsensor();

    Broker broker = new Broker(sa[0].get(),sa[1].get(),sa[2].get());
    broker.cast();
    broker.operatingState();

  }
}
