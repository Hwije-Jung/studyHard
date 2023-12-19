package oop.day2.hamburger;

public class HandBurgerHouse {
    public static void main(String[] args) {

        //점층적 생성자 패턴
//        // 모든 재료가 있는 햄버거
//        Hamberger hamberger1 = new Hamberger(2, 2, 2, 2);
//        // 빵, 패티, 치즈 ,토마토
//
//        Hamberger hamberger2 = new Hamberger(1, 1, 1, 1);
//        // 빵과 패티와 치즈 햄버거
//        Hamberger hamberger3 = new Hamberger(1, 1, 1, 1);
//
        //2. JavaBean 패턴을 이용하여 햄버거 만들기
        HambergerBean hambergerBean1 = new HambergerBean();
        //  빵과 패티 치즈만 있는 햄버거 만들어 주세요
        hambergerBean1.setBun(1);
        hambergerBean1.setPatty(1);
        hambergerBean1.setPatty(2);

        //빵과 패티2개 토마토2개 햄버거  넣어줘요
        hambergerBean1.setBun(1);
        hambergerBean1.setPatty(2);
        hambergerBean1.setTomato(2);
        //객체 생성 일관성(객체 생성 부분과 값을 설정되는 부분이 물리적으로 분리되었기 때문에)
        // , 불변성 문제 생길 수 있다. , 필수매개변수 없이 다 선택적이게 됐다.
        // setter 웬만하면 쓰지마라, 실수로 초기값 세팅안될수도있고
        //

        HamburgerBuilder hamburgerBuilder = new HamburgerBuilder.Builder(2,2).cheese(2).build();

        hamburgerBuilder.print();
    }
}
