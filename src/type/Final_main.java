package type;

public class Final_main {
    public static void main(String[] args) {
        Final_ex final_ex = new Final_ex();
//        final_ex.pi = 10; 인스턴스화 해도 변경 안됨
        final_ex.call();
    }
}
