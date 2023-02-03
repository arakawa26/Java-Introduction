package chap_02;

public class _04_Operater4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = false;
        boolean 제육볶음 = true;
        boolean 돈까스 = true;

        System.out.println(김치찌개 || 제육볶음 || 돈까스);  // or 연산자
        System.out.println(김치찌개 && 제육볶음 && 돈까스); // and 연산자

        System.out.println((5 > 3) && (3 > 1)); // true
        System.out.println((5 > 3) && (3 < 1)); // false
        System.out.println((5 > 3) || (3 < 1)); // true
        System.out.println((5 < 3) || (3 < 1)); // false

        // 1 < 3 < 5 같은 비교연산은 불가능. 1<3 && 3<5 로 써야함
        // 위에 코드에서 산술연산의 우선순위가 논리연산의 우선순위보다 높기때문에 괄호 없에도 출력 같음

        // 논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!(5 < 3)); // true
    }
}
