package OOP.polymorphism;

public interface Mobile {
    // 인터페이스 인터페이스는 추상적인 개념으로 필드를 선언 못하고,
    // 메서드를 접근제어자로는 public 과 default 만 가능하다
    // 구현체는 무조건 오버라이딩을 해야야한다. 이로써 추상적인개념으로 메서드 선언만하고 implements 를 사용해서 구현체 작성을 한다.
    // 인테페이스는 객체 생성이 불가능하다.
    public void call(String brand);
    public void sms(String text);
}
