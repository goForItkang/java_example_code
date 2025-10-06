package OOP.Encapsulation;

public class Encapsulation {
    // 갭슐화
    // 외부에서 접근을 하지 못하게 하거나 특정 기능으로 접근만 가능하게 하게 함
    // getter,setter
    //외부에 접근을 막는 접근 제어자
    // private, protected, public , default 등 이 있다
    // private 같은 클래스 내부에서만 접근 가능
    // protected 상속 받은 클래스 및 같은 패키지 내부에 접근 가능
    // default 같은 패키지 내부에 접근 가능
    // public 어디서 접근 가능


    public static void main(String[] args) {
        Person person = new Person();
        person.setName("yohan");
        person.setAge(25); // setter 예시 다른 클래스에서 집적 접근해서 수정을 하는게 아니고 method를 사용해서 나이를 등록

        person.agePlusOne(); // 2026 년에는 제가 한 살을 더 먹겠죠~
        System.out.println(person.getAge());
        System.out.println(person.getName()); // getter를 사용해서 필드를 집적 접근하는것 막음

//        person.age = 10;  private 로 접근 제어자를 제한를 둠 (X)


    }
}
