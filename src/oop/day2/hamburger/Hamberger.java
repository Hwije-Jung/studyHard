package oop.day2.hamburger;
// 점층적 생성자 패턴z
public class Hamberger {
    //필수
    private int bun;
    private int patty;
    //선택
    private int cheese;
    private int tomato;
    private int bacon;

    public Hamberger(){}

    public Hamberger(int bun,int patty,int cheese,int tomato, int bacon){
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.tomato = tomato;
        this.bacon = bacon;
    }
    public Hamberger(int bun,int patty,int cheese,int tomato){
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.tomato = tomato;

    }
    public Hamberger(int bun,int patty,int cheese){
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;

    }
}
