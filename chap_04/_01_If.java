package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 12;
        if (hour < 14) {  // 조건문 안에 코드 두줄이상 쓸려면 중괄호({)로 묶는거 필수
            System.out.println("아아 한잔");
            System.out.println("샷 추가");
        }
        if (hour >= 14) // 조건문 안에 코드 한줄만 존재하면 중괄호 안해도 ㄱㅊ
            System.out.println("뜨아 한잔");
        System.out.println("커피 주문 완료");

        // 오후 2시 이전 '이고' 모닝 커피를 마시지 않은경우에 주문
        hour = 10;
        boolean morningCoffee = false; // 모닝커피
        if (hour < 14 && morningCoffee == false){ // !morningCoffee 로 해도 동치
            System.out.println("아이스 아메리카노 한잔");
        }
        System.out.println("커피 주문 완료");

        // 오후 2시 이후 '이거나' 모닝커피를 마신 경우
        hour = 15;
        morningCoffee = true;
        if (hour >= 14 || morningCoffee){
            System.out.println("아아 디카페인 한잔");
        }
        System.out.println("커피 주문 완료");
    }
}
