package oop.day7_classModel;


public class Account {
  private int balance=0;
  private String accountNumber;
  private String name;
  private String passsword;
  Account(){

  }
  Account(String accountNumber,String name, String password){
    this.accountNumber = accountNumber;
    this.name = name;
    this.passsword = password;
  }

  public String getPasssword() {
    return passsword;
  }

  public void setPasssword(String passsword) {
    this.passsword = passsword;
  }

  public int deposit(int money){
    System.out.println("고객님이 입금하신 금액은 "+money+"입니다.");
    this.balance += money;
    System.out.println("잔고는"+this.balance);
    return this.balance;
  }

}
