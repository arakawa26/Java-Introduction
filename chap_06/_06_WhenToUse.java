package chap_06;

public class _06_WhenToUse {
    // 메소드가 필요한 이유
    // 대충 코드의 중복을 줄일수 있다는 내용
    // 또한 프로그램의 유지,보수에 도움이 된다
    public static int getPowerByExp(int number){
        return getPowerByExp(number,2); // 한 메소드를 정의할때 다른 메소드를 호출해도 ㄱㅊ
    }
    public static int getPowerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getPowerByExp(4)); // 16
        System.out.println(getPowerByExp(4, 2));

    }
}
