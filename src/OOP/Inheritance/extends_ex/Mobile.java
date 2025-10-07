package OOP.Inheritance.extends_ex;

public class Mobile {
    private String brand;

    public void call(){
        System.out.println(brand+"Mobile call");
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
}
