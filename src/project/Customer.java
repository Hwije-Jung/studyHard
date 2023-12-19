package project;

import java.util.ArrayList;

public class Customer {
  private String customerName;
  private String customerTel;
  private ArrayList<Book> bookCart = new ArrayList<Book>();

  public ArrayList<Book> getBookCart() {
    return bookCart;
  }

  public void addBookCart(Book book){
    this.bookCart.add(book);
  }
  public void printCartList(){
    for (Book book: bookCart) {
      book.bookPrint();
    }
  }

  public void printCustomerInform(){
    System.out.println("이름: "+customerName);
    System.out.println("전화번호: "+customerTel);
  }

  public Customer(String customerName, String customerTel) {
    this.customerName = customerName;
    this.customerTel = customerTel;
  }
}
