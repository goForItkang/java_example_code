package OOP.Inheritance.abstract_ex;

public class Main {
    public static void main(String[] args) {
//      Mobile mobile = new Mobile() // 추상 클래스는 객체 선안됨
        Apple apple = new Apple("Apple","iPad");
        apple.abstractCall("추상 메서드 apple");
        apple.dfaultCall("일반 메서드 apple");

    }
}
