package chap_06;

public class _05_Overloading {
    // method overloading : 같은 이름의 메소드를 여러 번 선언하는것을 말함 (반환형은 같아야함)
    // -> 매개변수의 타입, 개수가 다른 경우를 처리
    public static int getPowerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static int getPowerByExp(String number, String exponent){
        int num = Integer.parseInt(number);
        int exp = Integer.parseInt(exponent);
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(getPowerByExp(3,4));
        System.out.println(getPowerByExp("3","4"));
    }
}
