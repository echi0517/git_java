package method.ex;
public class MethodEx2Ref {

    public static void main(String[] args) {
        String message = "Hello, world!";
//        for (int i = 0; i < 3; i++) {
//            System.out.println(message);
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(message);
//        }
//        for (int i = 0; i < 7; i++) {
//            System.out.println(message);
//        }
        printMsg(3,message);
        printMsg(5,message);
        printMsg(7,message);
    }

    public static void printMsg( int b, String msg) {
        for (int i = 0; i < b; i++) {
            System.out.println(msg);
        }
    }
}