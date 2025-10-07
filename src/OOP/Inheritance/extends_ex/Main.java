package OOP.Inheritance.extends_ex;

public class Main {
    public static void main(String[] args) {
        // 부모 Mobile 생성
        System.out.println("=========== 부모 ============");
        Mobile mobile = new Mobile();
        mobile.setBrand("Samsung"); //부모 브랜드에 추가
        mobile.call();  // 부모 call

        System.out.println(mobile.getBrand());

        System.out.println("=========== 자식 ============");
        Apple apple = new Apple("Apple","MacBook"); // 부모의 브랜드에 apple 들어감
        apple.call(); // 자식 call
        apple.setBrand("Apple");
        System.out.println(apple.getBrand());
        apple.soundSiri();
    }
}
