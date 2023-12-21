package oop.day5;

import java.util.List;

/*
주문은 '출고상태 변경하기' , '배송지 정보 변경하기', '주문취소하기','결제완료하기'
*/
public class Order {
  private List<OrderLine> orderLines; // 주문 상품??
  private ShippingInfo shippingInfo;  // 주소지 정보
  private Money totalAmounts;         // Money타입의 토탈 값

  private OrderState state;           // 상태 정보

  public Order(List<OrderLine> orderLines, ShippingInfo shippingInfo) {
    // 주문할때 배송지 정보를 반드시 지정해야한다.
    setOrderLines(orderLines);
    setShippingInfo(shippingInfo);
  }


  private void setShippingInfo(ShippingInfo shippingInfo) {
    if (shippingInfo == null)
      throw new IllegalArgumentException("no ShippingInfo"); // shippingInfo null인지 검사
    this.shippingInfo = shippingInfo; // 검사 후 shippingInfo 필드 초기화
  }

  private void setOrderLines(List<OrderLine> orderLines) {
    verifyAtLestOneorMoreOrderLines(orderLines); // 생성자에서 OrderLines 받으면 비어있는지 검사
    this.orderLines = orderLines; // orderLines 필드 초기화
    calculateTotalAmounts();      // 받은 orderLines의 가격 토탈
  }

  private void verifyAtLestOneorMoreOrderLines(List<OrderLine> orderLines) { //받은 OrderLine null이거나 Empty인지 검사
    if (orderLines == null || orderLines.isEmpty()) {
      throw new IllegalArgumentException("no OrderLine");
    }
  }

  private void calculateTotalAmounts() {
    int sum = orderLines.stream().mapToInt(x -> x.getAmounts()).sum();
    //orderLine 객체의 getAmounts메소드(amounts)값 리턴 으로 토탈 값 구하기
    this.totalAmounts = new Money(sum);
    //Money 객체에 sum 넣어서 생성
  }

  public void changeShipped(ShippingInfo shippingInfo) {
    verifyNotYetShipped(); //상태검사
    setShippingInfo(shippingInfo);
  }

  private void verifyNotYetShipped() {
    if (state != OrderState.PAYMENT_WAITING && state != OrderState.PREPARING) // OrderState가 결제대기, 준비중 이 아닐때
      throw new IllegalArgumentException("aleady shipped"); // 이면 "이미 배송"
  }

//  public void changeShippingInfo(ShipingInfo newShipping) {
//  }

  public void cancel() {
    verifyNotYetShipped();
    this.state = OrderState.CANCELED;
  }

  public void completePayment() {
  }
}
