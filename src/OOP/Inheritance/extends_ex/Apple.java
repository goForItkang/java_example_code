package OOP.Inheritance.extends_ex;

public class Apple extends Mobile{
    private String mainBrand; // 메인 브랜드
    // Apple 생성자 부모에 있는 브랜드와 mainBrand 기종
    public Apple(String brand,String mainBrand) {
        // 1. 부모 클래스 로 부터 setBrand 메서드를 사용해서 부모 필드 brand 필드를 초기화 합니다.
        setBrand(brand);
        // 2. Apple 클래스에 자신의 mainBrand를 최기화
        this.mainBrand = mainBrand;
    }
    @Override
    public void call(){
        System.out.println(mainBrand+"Apple Class call");
    }
    public void soundSiri(){
        System.out.println("Siri sound");
    }
    public String getMainBrand(){
        return mainBrand;
    }
}
