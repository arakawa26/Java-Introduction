package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정

        // for
        int max = 20;
        int customer = 50;
        int sold = 0; // 팔린 치킨 수
        int noShow = 17; // 대기번호 17번 손님이 노쇼 손님
        for (int i = 1; i <= customer; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다");

            // 손님이 없다면 -> noShow
            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다");
                continue; // continue 가 속한 반복문의 처음으로 돌아감
            }
            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다");
                break;
            }
        }

        // while
        max = 20;
        customer = 50;
        sold = 0; // 팔린 치킨 수
        noShow = 17; // 대기번호 17번 손님이 노쇼 손님
        int i = 0;

        while (i < customer){
            i++;
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다");

            // 손님이 없다면 -> noShow
            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다");
                continue; // continue 가 속한 반복문의 처음으로 돌아감
            }
            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다");
                break;
            }
        }
    }
}
