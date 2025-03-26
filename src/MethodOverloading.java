class calc{
    public int add(int a,int b){
        int result=a+b;
        return result;
    }
    public int add(int a,int b,int c){
        int result=a+b+c;
        return result;
    }
    public double add(double a,double b,double c){
        double result=a+b+c;
        return result;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

        calc obj=new calc();
        int res1=obj.add(10,20);
        int res2=obj.add(10,20,30);
        double result=obj.add(1.2,3,1.1);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(result);
    }
}
