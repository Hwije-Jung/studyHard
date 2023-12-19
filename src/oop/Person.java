package oop;

public class Person {

    private final String name;

    private final int age;
    private final String address;
    private final String tel;

    public static class Builder{
        private final String name;

        private final int age ;
        private final String address ;
        private final String tel ;

        public Builder(String name, int age, String address, String tel){
            this.name = name;
            this.age = age;
            this.address = address;
            this.tel = tel;
        }


//        public Builder age (int val){
//            age = val;
//            return this;
//        }
//
//        public Builder address(String val){
//            address = val;
//            return this;
//        }
//
//        public Builder tel(String val){
//            tel = val;
//            return this;
//        }

        public Person build(){
            return new Person(this);
        }

    }



    private Person(Builder builder){
        name = builder.name;
        age = builder.age;
        address = builder.address;
        tel = builder.tel;
    }


//    String name;
//    int age;
//    String address;
//    String tel;
//
//    Person (String name, int age, String address, String tel){
//        this.name = name;
//        this.age=age;
//        this.address = address;
//        this.tel = tel;
//    }
//
//    public void personInfomation(){
//        System.out.println(this.name+"의 나이는 "+this.age+"살이고 주소는 "+this.address+"이며 전화번호는 "+this.tel );
//    }


}
