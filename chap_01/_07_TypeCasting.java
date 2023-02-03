package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 자료형을 다른 자료형으로 변환

        // int io to float,double
        int score = 93;
        System.out.println(score);
        System.out.println((float)score);     // 93.0 으로 출력
        System.out.println(((double)score));  // 93.0 으로 출력

        // float,double to int
        float score_f = 93.3F;
        double score_d = 98.9;
        System.out.println(score_f);
        System.out.println(score_d);
        System.out.println((int)score_f); // 소수점 버림
        System.out.println((int)score_d); // 소수점 버림

        // 변수에 형변환된 데이터 집어넣기

        double converted_socre_double = score; // 191 -> 191.0
        // int -> long -> float -> double (자동 형변환)

        int converted_socre_int = (int) score_d; // 191.8 -> 191
        // double -> float -> long -> int (수동 형변환 필요)

        //숫자를 문자열로
        String s1 = String.valueOf(93); // 정수를 문자열로 바꾸는방법1
        System.out.println(s1);
        s1 = Integer.toString(93); // 정수를 문자열로 바꾸는방법2
        System.out.println(s1);

        String s2 = String.valueOf(93.8); // 소수를 문자열로 바꾸는방법1
        System.out.println(s2);
        s2 = Double.toString(93.8); // 소수를 문자열로 바꾸는방법2
        System.out.println(s2);

        //문자열을 숫자로
        int i = Integer.parseInt("93"); // 문자열(정수)를 정수형으로 바꾸는 방법
        System.out.println(i);
        double k = Double.parseDouble("91.1"); // 문자열(실수)를 실수형으로 바꾸는 방법
        System.out.println(k);
    }
}