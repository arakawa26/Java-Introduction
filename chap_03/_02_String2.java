package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I Like Java and Python and C.";

        // 문자열 변환(수정)
        System.out.println(s.replace(" and",",")); // I Like Java, Python, C.
        System.out.println(s.substring(7)); // 주어진 시작위치부터 출력 -> Java and Python and C.
        System.out.println(s.substring(s.indexOf("Java"))); // 앞강의의 응용. 위와 출력 같다
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));
        //시작위치와 끝위치를 다 설정. 단, 설정한 끝 위치의 바로 앞까지만 출력 -> Java and Python and C

        // 공백 제거
        s = "      I Love Java.    ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞뒤 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); // 원래 했던거 -> JavaPython
        System.out.println(s1 + "," + s2); // 원래했던거 -> Java,Python
        System.out.println(s1.concat(",").concat(s2)); // 문자열 결합 함수 concat -> Java,Python
    }
}
