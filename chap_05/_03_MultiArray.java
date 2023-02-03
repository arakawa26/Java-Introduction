package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 2차원 배열

        // 소규모 영화관 좌석
        // A1-A5, B1-B5, C1-C5 존재

        String[] seatA = {"A1","A2","A3","A4","A5"};
        String[] seatB = {"B1","B2","B3","B4","B5"};
        String[] seatC = {"C1","C2","C3","C4","C5"};

        // 3 x 5 크기의 2차원 배열
        String[][] seats = new String[][] {
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}
        };

        // 2차원 배열에서 요소에 접근
        System.out.println(seats[1][2]); // B3 출력

        // 첫 줄에는 3칸, 둘째 줄에는 4칸, 셋째 줄에는 5칸인 배열
        String[][] seats2 = {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };

        // System.out.println(seats2[0][4]); // 이 경우 에러가 발생. A5 위치에 요소가 없음을 증명

        // 3차원 배열
        // String[][][] marray = {
        //         {{},{},{}},
        //         {{},{},{}},
        //         {{},{},{}}
        // };
    }
}
