class autopromo{
    public void show(Byte n){
        System.out.println("Byte "+n);
    }
    public void show(Short  n){
        System.out.println("Short "+n);
    }
    public void show(char n){
        System.out.println("char "+n);
    }
    public void show(int n) {
        System.out.println("int " + n);
    }
}
public class AutomaticPromotion {
    public static void main(String[] args) {

//        Byte Range: -128 to 127
//        Short Range: -32768 to 32767
//        Int Range: -2147483648 to 2147483647


        autopromo ap=new autopromo();
        Byte b=120;
        ap.show(b);
        char ch='a';
        ap.show(ch);
        ap.show(128);

    }
}
