package oop;

public class Student {
    public String name ;
    public String major;


    public Student(){} // default constructor

    public Student(String name, String major){
        this.name = name;
        this.major = major;
    }

//    public Student(String name){
//        this.name = name;
//    }
//
//    public  Student(String major){
//        this.major = major;
//    }

    public void study(){
        int studyE = 0;
        studyE++;
        System.out.println("학습능력이 1+ 상승했습니다.");
    }

    public String eat(String food){

        return food+"맛지게 냠냠";
    }
}
