package oop.day5;
import java.util.List;
/*
주문은 '출고상태 변경하기' , '배송지 정보 변경하기', '주문취소하기','결제완료하기'
*/
public class Order {
           private  List<OrderLine> orderLines;
           private ShippingInfo shippingInfo;
           private Money totalAmounts;

           private OrderState state;

           public Order(List<OrderLine> orderLines, ShippingInfo shippingInfo){
               setOrderLines(orderLines);
               setShippingInfo(shippingInfo);
           }

    private void setShippingInfo(ShippingInfo shippingInfo) {
               if(shippingInfo == null)
                   throw new IllegalArgumentException("no ShippingInfo");
               this.shippingInfo = shippingInfo;
    }

    private void setOrderLines(List<OrderLine> orderLines){
                verifyAtLestOneorMoreOrderLines(orderLines);
                this.orderLines = orderLines;
                calculateTotalAmounts();
           }

    private void verifyAtLestOneorMoreOrderLines(List<OrderLine> orderLines) {
               if(orderLines == null || orderLines.isEmpty()){
                   throw new IllegalArgumentException("no OrderLine");
               }
    }

    private void calculateTotalAmounts() {
               int sum = orderLines.stream().mapToInt(x->x.getAmounts()).sum();
               this.totalAmounts = new Money(sum);
    }

    public void changeShipped(ShippingInfo shippingInfo){
               verifyNotYetShipped();
               setShippingInfo(shippingInfo);
    }

    private void verifyNotYetShipped() {
               if(state != OrderState.PAYMENT_WAITING && state != OrderState.PREPARING )
                   throw new IllegalArgumentException("aleady shipped");
    }

    public void changeShippingInfo(ShipingInfo newShipping){}
           public void cancel(){
               verifyNotYetShipped();
               this.state = OrderState.CANCELED;
           }
           public void completePayment(){}
}
