package oop.day8_interface_1.interface_4;

public class DriveMain {
  public static void main(String[] args) {
    Driver driver = new Driver();

    Bus bus = new Bus();
    Taxi taxi = new Taxi();

    driver.drive(bus);
    //자동타입변환(promotion) --> 오버라이딩메소드호출 --> 다형성
    driver.drive(taxi);

    ride(taxi);
    ride(bus);


  }
//인터페이스 매개변수를 갖는 메소드
  public static void ride(Vehicle vehicle){

    if(vehicle instanceof Bus){
      Bus bus = (Bus)vehicle;
      bus.checkFare();
    }

    else if (vehicle instanceof Bus bus) bus.checkFare();
    vehicle.run();
  }
}
