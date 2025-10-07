package OOP.Inheritance.abstract_ex;

public class Apple extends Mobile{
    private String model;
    //부모의 추상 클래스 선언으로

    public Apple(String brand,String model) {
        this.model = model;
    }
    @Override
    public void abstractCall(String brand) {
        System.out.println("자식에서 작성된 brand: "+brand);
    }
    @Override
    public void dfaultCall(String brand){
        System.out.println(model+"Apple Class call");
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

}
