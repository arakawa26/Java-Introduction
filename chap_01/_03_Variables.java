package chap_01;

import java.sql.SQLOutput;

public class _03_Variables {
    public static void main(String[] args) {
        String a = "김희진"; //문자열형 변수 선언&대입 = 큰따옴표
        int b = 15; //정수형 변수 선언&대입
        double c = 90.5; //실수형 변수 선언&대입
        char d = 'A'; // 캐릭터형 변수 선언&대입 = 작은따옴표

        System.out.println( a + "님 안녕하세요");
        System.out.println( a + "님 " + b + "시에 배송이 완료되었습니다");
        System.out.println(a + "님의 평균 점수는 " + c + "점 입니다.");
        System.out.println(a + "님의 학점은 " + d + "입니다");

        c = 81.7; //이미 선언된 변수에 새롭게 대입
        d = 'B'; //이미 선언된 변수에 새롭게 대입
        System.out.println(a + "님의 평균 점수는 " + c + "점 입니다.");
        System.out.println(a + "님의 학점은 " + d + "입니다");

        boolean e = true;
        System.out.println("이번시험에 합격했을까요? " + e);

        double haha = 3.14;
        float rara = 3.14F; //실수형인데 소수점 자릿수 제한적. 이걸로 대입할때 숫자뒤에 F 써줘야함

        System.out.println(haha);
        System.out.println(rara);

        haha = 3.14123456789;
        rara = 3.14123456789F; //3.14123456 까지만 표현됨

        System.out.println(haha);
        System.out.println(rara);

        int i = 1000000000; // int형의 한계 = 21억
        long k = 10000000000l; // int형보다 더 표현 가능한 정수형. 숫자뒤에 l 붙인다

        System.out.println(i);
        System.out.println(k);

        i = 1_000_000_000;
        k = 1_000_000_000_0l; // 정수형 대입시 숫자사이에 언더바 껴도 출력 변화x (걍 보기 편하기용)

        System.out.println(i);
        System.out.println(k);
    }
}
