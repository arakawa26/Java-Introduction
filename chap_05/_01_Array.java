package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열
        String coffeeRoss = "아메리카노";
        String coffeeKim = "카페모카";
        String coffeePak = "라떼";

        System.out.println(coffeeRoss + " 하나");
        System.out.println(coffeeKim + " 하나");
        System.out.println(coffeePak + " 하나");
        System.out.println("주세요 #1");

        // 배열 선언 첫 번째 방법
        // String[] coffees = new String[3];

        // 배열 선언 두 번째 방법
        // String coffees[] = new String[3];

        // 선언 후 입력
        // coffees[0] = "아메리카노"; // index값은 0부터 시작. 이경우 0~2 까지 존재
        // coffees[1] = "카페모카";
        // coffees[2] = "라떼";

        // 세 번째 방법 : 선언과 동시에 입력
        // String[] coffees = new String[] { "아메리카노", "카페모카", "라떼" };

        // 네 번째 방법
        String[] coffees = { "아메리카노", "카페모카", "라떼" };

        for (int i = 0; i < 3; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요 #2");

        // 다른 자료형도 가능하다
        int[] key = {1,3,7,2,5};
        for (int i = 0; i < 5; i++) {
            System.out.print(key[i]);
        }
    }
}
