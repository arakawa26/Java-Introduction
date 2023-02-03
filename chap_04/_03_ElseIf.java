package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf

        //한라봉 에이드가 있으면 +1
        //또는 망고주스가 있으면 +1
        //또는 아이스 아메리카노 +1

        boolean halla = false; // 한라봉 에이드
        boolean mango = false; // 망고 쥬스

        if (halla){
            System.out.println("한라봉 에이드 + 1");
        } else if (mango){
            System.out.println("망고 쥬스 + 1");
        } else{
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("음료 주문 완료");
    }
}
