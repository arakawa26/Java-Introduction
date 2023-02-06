package chap_06;

public class _07_VariableScope {
    public static void methodA(){
        // System.out.println(number); // 안됨
        // System.out.println(result); // 안됨
    }
    public static void methodB(){
        int result = 1; // 지역변수 -> 그 변수가 선언된 영역(중괄호 {} 으로 구분)에서만 유효
    }
    public static void main(String[] args) {
        int number = 3; // 지역변수
        // System.out.println(result); 안됨

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // System.out.println(i);
        // i 또한 위의 for문에 속한 지역변수 이므로 밖에서는 유효x

        {
            int j =0;
            System.out.println(j);
        }
        // System.out.println(j);
        // j 또한 위 중괄호로 묶인 영역의 지역변수 이므로 유효x
    }
}
