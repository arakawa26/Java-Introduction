package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자

        // 줄바꿈 \n
        System.out.println("자바가\n너무\n재밌어요");

        // 탭이동 \t
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");

        // 역슬레시(\)의 표현 \\
        System.out.println("ha\\ha"); // ha\ha 출력

        // 큰따옴표("),작은따옴표(')의 표현 \" , \'
        System.out.println("너가 아까 \"배고파\"라고 말했잖아"); // 너가 아까 "배고파"라고 말했잖아
        System.out.println(("난 \'배고프군\'이라고 생각했다")); // 난 '배고프군'이라고 생각했다
        System.out.println(("난 '배고프군'이라고 생각했다")); // 문자열에 포함된 작은따옴표는 그냥 써도 ㄱㅊ
        System.out.println('\''); // 캐릭터형으로 작은따옴표만을 표현할때는 처리가 필요
    }
}
