package quiz.bank;

public class KBBank implements Bank {

  @Override
  public void withDraw(int price) {
    System.out.println("KB은행만의 인출 로직..."+price+" 원을 인출한다.");
  }

  @Override
  public void deposit(int price) {
    System.out.println("KB은행만의 입금 로직..."+price+" 원을 입금한다.");

  }

  @Override
  public String findDormancyAccount(String custId) {
    return Bank.super.findDormancyAccount(custId);
  }
}
