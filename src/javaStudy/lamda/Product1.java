package javaStudy.lamda;

class Product1 { // 상품 클래스
  private String name;
  private double price;

  public Product1(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Product1{" +
            "name='" + name + '\'' +
            ", price=" + price +
            '}';
  }
}
