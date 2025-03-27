import java.util.Scanner;

class Farmer{
    int pa;
    float td;
    static float ri;
    float si;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal Amount");
        pa=sc.nextInt();
        System.out.println("Enter time duration");
        td=sc.nextFloat();
        ri=2.0F;
    }
    void compute(){
        si=(pa*ri*td)/100F;
    }
    void disp(){
        System.out.println("Simple Interest is "+si);
    }
}

public class StaticVariableAdv {
    public static void main(String[] args) {
        Farmer fd=new Farmer();
        fd.input();
        fd.compute();
        fd.disp();
        Farmer f1=new Farmer();
        f1.input();
        f1.compute();
        f1.disp();

    }
}
