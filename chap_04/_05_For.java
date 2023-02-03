package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 for

        for (int i = 0; i < 10; i++) { // i = 0~9 까지 총 10회 반복
            System.out.println("안녕하세요. 나코입니다. " + i);
        }

        // 짝수만 출력 ( fori 만 적고 엔터치면 자동으로 for문 형식 나옴
        for (int i = 0; i < 10; i+=2) {
            System.out.print(i); // println 이 아닌 print 함수를 쓰면 자동 줄바꿈x
        }

        System.out.println();

        // 홀수만 출력
        for (int i = 1; i < 10; i+=2) {
            System.out.print(i);
        }

        System.out.println();

        // 거꾸로 출력
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }

        System.out.println();

        // 1부터 10까지의 수들의 합
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다");
    }
}
