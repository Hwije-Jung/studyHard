package javanet;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
  public static void main(String[] args) {
    try {
      InetAddress local = InetAddress.getLocalHost();
      System.out.println("내 컴퓨터 IP 주소: " + local.getHostAddress());

      InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
      // DNS(Domain Name System)
      // ip 다 기억하지 못하기 때문에
      for(InetAddress remote : iaArr) {
        System.out.println("www.naver.com IP 주소: " + remote.getHostAddress());
      }
    } catch(UnknownHostException e) {
      e.printStackTrace();
    }
  }
}