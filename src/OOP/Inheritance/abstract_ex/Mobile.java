package OOP.Inheritance.abstract_ex;

abstract public class Mobile {
    private String brand;
    // 추상 메서드
    public abstract void abstractCall(String brand);
    //일반 메서드 선언
    public void dfaultCall(String brand){
        System.out.println("일반 적인 메서드 사용 "+brand+" "+brand);
    }// Getter
    public String getBrand(){
        return brand;
    }// Setter
    public void setBrand(String brand){
        this.brand = brand;
    }

}
