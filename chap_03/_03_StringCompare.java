package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        // 문자열 비교
        System.out.println(s1.equals(s2)); // s1 과 s2가 같은지 비교 -> false
        System.out.println(s1.equals("Java")); //true
        System.out.println(s2.equals("python")); // 기본적으로 대소문자 구분을 하므로 false
        System.out.println(s2.equalsIgnoreCase("python")); // 이 함수는 대소문자 구분x -> true

        // 문자열 비교 심화
        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2)); // (내용) true
        System.out.println(s1 == s2); //  (참조) true

        s1 = new String("1234");
        s2 = new String("1234"); // s1 과 s2 가 각각 다른 메모리를 참조
        System.out.println(s1.equals(s2)); // (내용) true
        System.out.println(s1 == s2); // (참조) false

    }
}
