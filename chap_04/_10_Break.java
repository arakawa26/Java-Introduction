package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // break
        // 치킨 집에서 매일 20마리만 판매 (1인당 1마리만 구매 가능)
        // 손님이 50명 대기

        // for문 이용
        int max = 20;
        int customer = 50;
        for (int i = 1; i <= customer; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            if (i == max){
                System.out.println("금일 재료가 모두 소진되었습니다");
                break; // break 사용하면 break가 속한 반복문을 한겹 벗는다
            }
        }
        System.out.println("영업을 종료합니다");
    }
}
