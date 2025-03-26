class Test{
    int a=2;
    String name;
}

public class InstanceLocalVariable {
    public static void main(String[] args) {
        int num=9;

        Test obj1=new Test();
        Test obj2=new Test();

        obj1.name="Ayushi";
        obj1.a=10;
        System.out.println(obj1.a);//10
        System.out.println(obj1.name);//Ayushi

        System.out.println(obj2.a);//2
        System.out.println(obj2.name);//null
    }

}
