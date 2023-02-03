package chap_05;

public class _04_MutiArrayLoop {
    public static void main(String[] args) {
        String[][] seats = {
                {"a1", "a2", "a3", "a4", "a5"},
                {"b1", "b2", "b3", "b4", "b5"},
                {"c1", "c2", "c3", "c4", "c5"}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // 줄마다 요소의 개수가 다른 경우는?
        String[][] seats2 = {
                {"a1", "a2", "a3"},
                {"b1", "b2", "b3", "b4"},
                {"c1", "c2", "c3", "c4", "c5"}
        };
        for (int i = 0; i < seats2.length; i++) { // seats2.length -> 행 개수
            for (int j = 0; j < seats2[i].length; j++) { // seats2[i].length -> i 행의 열 개수
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // 다차원 배열의 요소 입력시 반복문 이용
        String[][] seats3 = new String[10][15];
        String[] eng = {"A","B","C","D","E","F","G","H","I","J"};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                seats3[i][j] = eng[i] + (j + 1); //
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
