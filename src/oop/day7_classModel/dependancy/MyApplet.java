package oop.day7_classModel.dependancy;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {
//  init();
//  public void start();
  public void print(Graphics graphics){ // 의존관계
    // print메소드 통해서 참조값을 호출했다.
    graphics.drawString("Hello Applet",10,20);
  }
}
