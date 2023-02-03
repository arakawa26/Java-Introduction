package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키코드
        char c = 'A';
        System.out.println(c);
        System.out.println((int)c);

        System.out.println();

        String[][] seats3 = new String[10][15];
        char start = 64; // A 의 아스키코드값이 65
        for (int i = 0; i < 10; i++) {
            start++;
            for (int j = 0; j < 15; j++) {
                seats3[i][j] = String.valueOf(start)+(j+1); // String.valueOf 는 캐릭터형을 문자열형으로 바꾸는 역할도함
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
