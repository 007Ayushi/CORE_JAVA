 class Demo{
    static void disp(){
        System.out.println("static method disp()");
    }
    void disp1(){
        System.out.println("non static method disp1()");
    }
}
public class StaticNonStaticMethod {
    public static void main(String[] args) {
        Demo.disp();
        Demo d=new Demo();
        d.disp1();

    }
}
