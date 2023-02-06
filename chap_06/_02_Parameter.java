package chap_06;

public class _02_Parameter {
    public static void power(int number) {
        // 전달값 = 매개변수 = Parameter
        System.out.println(number + "의 제곱 : " + number*number);
    }
    public static void powerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + "승 : " + result);
    }
    public static void main(String[] args) {
        // 인자 = 인수 = Argument
        power(4);
        powerByExp(4,5);
    }
}
