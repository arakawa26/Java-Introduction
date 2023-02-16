package chap_07;

import chap_07.Camera.Camera;

import java.sql.SQLOutput;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본자료형 ( int, float, double, ling, boolean, .... )
        // 기본자료형의 경우 변수 선언시 고유한 기본값이 들어가있음
        // 메소드를 가지지 않음
        // 소문자로 시작

        int[] i = new int[3];
        System.out.println(i[0]); // 0

        double[] d = new double[3];
        System.out.println(d[0]); // 0.0

        // 참조 자료형 ( String, Camera, FactoruCam, SpeedCam, ... )
        // c프로그래밍에서 배웠던 포인터랑 비슷한 느낌 (객체를 가리킴)
        // 참조 자료형의 경우 변수 선언시 기본값x (null)
        // 메소드를 가질수도 있음
        // 대문자로 시작

        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0]); // null

        ///////////////////////////////

        // 기본자료형의 경우
        int a = 10;
        int b = 20;

        b = a;
        System.out.println(a); // 10
        System.out.println(b); // 10

        b = 30;
        System.out.println(a); // 10
        System.out.println(b); // 30

        System.out.println();

        // 참조 자료형의 경우
        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "camera1";
        c2.name = "camera2";
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2=c1; // 이때 c2가 가리키는게 c1이 가리키던 객체로 바뀜
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2.name = "고장난 카메라"; // 현재 c1과 c2가 동시에 가리키고 있는 객체의 이름이 바뀜
        System.out.println(c1.name);
        System.out.println(c2.name);

        changeName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2 = null; // c2가 아무것도 안가리키게 됨
    }

    public static void changeName(Camera camera) {
        camera.name = "잘못된 카메라";
    }
}
