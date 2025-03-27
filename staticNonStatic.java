class demo1{
    static int a;
    static  int b;

    int m;
    int n;

    static {
        a=10;
        b=20;
        System.out.println("static block");
    }

    {
        m=100;
        n=200;
        System.out.println("Non Static Block");
    }

    static void disp(){
        System.out.println("value of static var"+a);
        System.out.println("value of static var"+b);
    }

    void disp2(){
        System.out.println("value of instance var"+m);
        System.out.println("value of instance var"+n);
    }
}
public class staticNonStatic {
    public static void main(String[] args) {
        demo1 d=new demo1();
        demo1.disp();//static method
        d.disp2();//non static method

    }
}
