package OOP.Encapsulation;

public class Person {
    private String name;
    private int age;
    void printDefaultPerson(){
        System.out.println("name = " + name + " age = " + age);
        // 같은 클래스 내부에서 만 접근가능
    }
    public void printPublicPerson(){
        System.out.println("name = " + name + " age = " + age);
        // 전부 접근 가능
    }
    protected void printProtectedPerson(){
        System.out.println("name = " + name + " age = " + age);
        // 상속된 클래스 및 같은 패키지 내부에서 접근 가능
    }
    public int agePlusOne(){
        return age + 1;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

}
