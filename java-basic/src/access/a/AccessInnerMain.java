package access.a;

public class AccessInnerMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();


        // public 패키지
        data.publicField = 1;
        data.publicMethod();


        //default 패키지
        data.defaultField = 2;
        data.defaultMethod();

        // private 패키지
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();

    }
}
