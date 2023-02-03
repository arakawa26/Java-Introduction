package chap_01;

public class _04_Comment {
    public static void main(String[] args) {
        System.out.println("(10분전) 잠시 후 결혼식 시작하니 착석좀");
        //System.out.println("(5분전) 잠시 후 결혼식 시작하니 착석좀"); ---첫번째 주석 방법 = // = 한줄주석
        System.out.println("지금부터 결혼식을 시작합니다");

        int size = 120;
        size = size + 10; // 덧셈연산
        System.out.println("신발사이즈는 " + size + "으로 보여주세요");

        /*
        int a = 10;
        int b = 20;
        System.out.println( a + b);
         */

        // 두번째 주석방법 = /* */ = 여러줄 주석

        /*
        이미 존재하는 코드를 주석처리 하는법
        1. 하려는 코드들 드래그 & ctrl + '/' -> 전부 한줄주석처리
        2. 하려는 코드들 드래고 & ctrl + shift + '/' -> 전부 여러줄 주석 처리
         */
    }
}
