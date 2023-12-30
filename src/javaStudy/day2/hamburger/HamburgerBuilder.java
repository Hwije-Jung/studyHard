package javaStudy.day2.hamburger;

public class HamburgerBuilder {

    private  final int bun;
    private final int patty;
    private final int cheese;
    private final int tomato;
    private final int bacon;

    public static class Builder{
        //필수
        private final int bun;
        private final int patty;

        //선택
        private int cheese = 0;
        private int tomato = 0;
        private int bacon = 0;

        public Builder(int bun, int patty){
            this.bun = bun;
            this.patty = patty;
        }
        public Builder cheese(int val){
            cheese = val;
            return this;
        }

        public Builder tomato(int val){
            tomato = tomato;
            return this;
        }

        public Builder bacon(int val){
            bacon = val;
            return this;
        }

        public HamburgerBuilder build(){
            return new HamburgerBuilder(this);
        }


    }

    private HamburgerBuilder(Builder builder){
        bun = builder.bun;
        patty = builder.patty;
        cheese = builder.cheese;
        tomato = builder.tomato;
        bacon = builder.bacon;
    }

    public void print(){
        System.out.println(this.bun+this.bacon+this.cheese);
    }
}
