package OOP.polymorphism;

public class Apple implements Mobile{
    private String model;
    private String brand;

    public Apple(String brand,String model) {
        this.model = model;
        this.brand = brand;
    }
    @Override
    public void call(String brand) {
        System.out.println(brand+"Apple call");
    }

    @Override
    public void sms(String text) {
        System.out.println(this.brand+"Apple sms: "+text);
    }
}
