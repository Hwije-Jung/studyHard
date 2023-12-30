package javaStudy.day7_classModel;

public class Application {
  public static void main(String[] args) {
    Account account1 = new Account();
    account1.deposit(50000);

    Account account2 = new Account("12333456","신세계","1234");
  }
}
