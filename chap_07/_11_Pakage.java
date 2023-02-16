package chap_07; // pakage 에 속한 class 에선 이거를 무조건 선언해야함

import java.util.Random;

public class _11_Pakage {
    public static void main(String[] args) {
        // 패키지 (랜덤 클래스)
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt()); // int 의 범위 내에서 정수형 값 반환
        System.out.println("랜덤 정수(범위) : " + random.nextInt(10)); // 0 '이상' 10 '미만' 의 정수 반환
        System.out.println("랜덤 실수 : " + random.nextDouble()); // 0.0 이상 1.0 미만의 실수 반환
        System.out.println("랜덤 참거짓값 : " + random.nextBoolean()); // 참/거짓 중 하나 반환

        // 그 외에 다양한 class들은 구글검색을 통해 알아보자
    }
}
