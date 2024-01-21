package static2;


import static static2.DecoData.*;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출");
        DecoData decoData = new DecoData();
        decoData.instanceCall();

        System.out.println("2. 인스턴스 호출");
        DecoData decoData2 = new DecoData();
        decoData2.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        staticCall2(decoData);


        // 추가
        // 인스턴스를 통한 접근

        DecoData data3 = new DecoData();
        data3.staticCall(); //권장 X!

        staticCall();

    }
}