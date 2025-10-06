package type;

public class Reference {
    //래퍼런스 타입 = 참조 타입
    //변수 선언시 null 로 선언
    //해당 변수가 선언시 JVM 의 Runtime Data Area에 Stack memory에 heap영역에 참조값에 위치가 저장 ex)x0001 힙영역에 x0001위치에 참조해서 값을 찾음
    //실제로는 물리는 주소는 아니고 HashCode() 16진수로 변환된 값
    //기본타입이 아닌 모든 타입 class,interface,enum,Collection,String 등등

    static ClassReference reference2;


    public static void main(String[] args) {
        // new 생성자로 인스턴스화 시킨 경우
        ClassReference reference = new ClassReference();
        System.out.println("참조 변수 reference가 가리키는 객체: " + reference);
        reference.printAge(); // <-- 클래스에 메서드 선언 후 실행

        // 10Line 선언만 하고 초기화 하지않음
        System.out.println("초기화 하지않고 선언만 reference2 "+reference2);

//        reference2.printAge(); // <-- 클래스 선언 후 인스턴스화를 시키지않고 참조해서 사용하면, NPE(null point exception)
    }

}
