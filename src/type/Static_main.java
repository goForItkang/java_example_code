package type;

public class Static_main {
    public static void main(String[] args) {
        Static_ex.text = "static text!!!";
        Static_ex.call(); // 객체를 인스턴스화 하지 않아도 클래스 이름으로 접근 가능
        // 일반적으로 스택에 저장되어서 객체 주소를 저장되어있는 방식이 아닌 힙에 참조 하는것이 아닌 static 는 Class Area 저장되어 있다.
        Static_ex ex = new Static_ex(); // 인스턴스화
//      ex.text = "인스턴화 시킨 변수";// 인스턴화 해서 heap 영역에 접근을 하고 있어서 경고 문구 뜸 가능은 하나 가독성을 망친다.
    }
}
