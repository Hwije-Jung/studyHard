package javaStudy.day2.hamburger;
// JavaBean패턴 : Setter 메소드를 사용한 패턴
public class HambergerBean {
    //필수
    private int bun;
    private int patty;
    //선택
    private int cheese;
    private int tomato;
    private int bacon;

    public void setBun(int bun) {
        this.bun = bun;
    }

    public void setPatty(int patty) {
        this.patty = patty;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public void setBacon(int bacon) {
        this.bacon = bacon;
    }

    public HambergerBean(){

    }


}
