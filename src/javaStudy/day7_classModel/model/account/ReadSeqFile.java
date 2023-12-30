package javaStudy.day7_classModel.model.account;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ReadSeqFile extends Frame implements ActionListener {
  private TextField account, name, balance;
  private Button next, done;

  private DataInputStream input;
  //필드 입력되는 account, name, balance의 스트링객체를 담는 객체

  ReadSeqFile() {
    super("고객 파일을 읽겠습니다.");
    try {
      input = new DataInputStream(new FileInputStream("client.doc"));
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e1) {
      System.err.println(e1.toString());
      System.exit(1);
      e1.printStackTrace();
    }

    setSize(250, 150);
    setLayout(new GridLayout(4, 2)); //4행2열
    account = new TextField();
    account.setEditable(false);
    add(account);
    add(new Label("이름"));
    name = new TextField(20);
    name.setEditable(false);
    add(name);

    //balance Frame에 붙이기
    add(new Label("잔고"));
    balance = new TextField(20);
    balance.setEditable(false);
    add(balance);

    next = new Button("출력");
    next.addActionListener(this);
    add(done);
    setVisible(true);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // 오버라이딩해야돼
    if (e.getSource() == next) readRecord();
    else closeFile();
    // 데이터를 한 레코드씩 읽는 메소드

  }

  private void closeFile() {
    try {
      input.close();
      System.exit(0);
    } catch (IOException io) {
      System.err.println(io.toString());
      System.exit(1);
    }

  }

  public void readRecord() {
    String accountNumber;
    double balance;
    String nameDate;

    try{
      accountNumber = input.readUTF();
      nameDate = input.readUTF();
      balance = input.readDouble();

      this.account.setText(String.valueOf(accountNumber));
      this.name.setText(nameDate);
      this.balance.setText(String.valueOf(balance));

    }catch (EOFException e1){
      closeFile();
    }catch (IOException e2){
      System.err.println(e2.toString());
    }catch (Exception e3){
      System.err.println(e3.toString());
    }
  }

  public static void main(String[] args) {
    new ReadSeqFile();
  }
}
