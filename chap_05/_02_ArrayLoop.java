package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요 #1");

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) { // coffees.length -> coffees배열의 길이
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요 #2");

        // enhanced for (for-each) 반복문
        for (String coffee : coffees){ // 'coffees' 배열의 요소들을 'coffee' 라는 변수에 차례대로 받는다
            System.out.println(coffee + " 하나");
        }
        // foreach 하고 엔터치면 바로 양식나옴
        System.out.println("주세요 #3");
    }
}
