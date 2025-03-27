public class staticMainMethodExecution {
    static int age;
    static {
        age=20;
        System.out.println("static block execution");
    }
    static void disp(){
        System.out.println("static method disp()");
    }
    public static void main(String[] args) {
        System.out.println("main method");
      disp();


    }
}
