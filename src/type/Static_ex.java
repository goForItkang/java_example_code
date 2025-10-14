package type;

public  class Static_ex {
    // static 정적 이라는 어원으로
    static String text = "Static text";
    String text2 = "no Static";
    public static void  call(){
        System.out.println(text);
//        System.out.println(text2); static 메서드 안에 static 변수만 올 수 있다 .
    }
// 일반 메서드에 static 변수나 메서르르 가질 수 있음
    public void normalCall(String text){
        System.out.println("Static filedCall"+text);
        System.out.println("noStatic filedCall"+text2);
    }

}
