package oop;

public class PersonMain {
    public static void main(String[] args) {
//        Person per = new Person("정휘제",28,"창원시","01065732265");
//        per.personInfomation();

        Person per = new Person.Builder("정휘제",28,"창원시","016573").build();
    }
}
