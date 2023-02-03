package chap_03;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I Like Java and Han and Yang.";
        System.out.println(s);

        //문자열의 길이 출력
        System.out.println(s.length()); //29

        //대소문자 변환
        System.out.println(s.toUpperCase()); // I LIKE JAVA AND HAN AND YANG
        System.out.println(s.toLowerCase()); // i like java and han and Yang

        //포함관계 확인
        System.out.println(s.contains("Java")); // true
        System.out.println(s.contains("C")); // false
        System.out.println(s.indexOf("Java")); // 문자열에서 주어진 단어의 시작위치(시작은 0) -> 7
        System.out.println(s.indexOf("C")); //포함되지 않으면 -1을 반환 -> -1
        System.out.println(s.indexOf("and")); // 중복으로 포함되면 맨 앞에꺼 -> 12
        System.out.println(s.lastIndexOf("and")); // 중복으로 포함될때 맨 뒤에껄로 출력 -> 20
        System.out.println(s.startsWith("I Like")); // s가 이 문자열로 시작하면 true -> true
        System.out.println(s.endsWith(".")); // s가 이 문자열로 끝나면 true -> true

    }
}
