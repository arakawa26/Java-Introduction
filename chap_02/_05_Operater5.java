package chap_02;

public class _05_Operater5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과값 = (조건) ? (조건이 참일 경우의 결과값) : (조건이 거짓일 경우의 결과값)

        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y; // x와y중 큰 값 저장
        System.out.println(max); // 5
        int min = (x < y) ? x : y; // x와y중 작은 값 저장
        System.out.println(min); // 3

        boolean b = (x == y) ? true : false;
        System.out.println(b); // false

        String s = (x != y) ? "다릅니다" : "같습니다";
        System.out.println(s); // 다릅니다
    }
}
