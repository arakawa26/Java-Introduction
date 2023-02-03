package chap_02;

public class _01_Operater1 {
    public static void main(String[] args) {

        // 일반 연산
        System.out.println(4+2); // 6
        System.out.println(5-3); // 2
        System.out.println(4*5); // 20
        System.out.println(8/2); // 4
        System.out.println(5/2); // 2 --- 몫을 구하는 연산자 ㅇㅇ
        System.out.println(5%2); // 2 --- 나머지를 구하는 연산자

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); // 30
        c = a - b;
        System.out.println(c); // 10
        c = a / b;
        System.out.println(c); // 2
        c = a * b;
        System.out.println(c); // 200
        c = a % b;
        System.out.println(c); // 0

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        ++val; // val = 11
        val++; // val = 12
        System.out.println(val); // 12
        System.out.println(++val); // 증감연산 이후 코드수행 -> 13 출력 and val = 13
        System.out.println(val++); // 코드수행 이후 증감연산 -> 13 출력 but val = 14 가 됨
        System.out.println(val); // 14

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 0명
        System.out.println("대기 인원 : " + waiting++); // 1명
        System.out.println("대기 인원 : " + waiting++); // 2명
        System.out.println("총 대기 인원 : " + waiting); // 3명

    }
}
