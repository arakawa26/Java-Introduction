package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 do while
        int distance = 25; // 전체거리 25m
        int move = 0; // 현재 이동 거리 0m
        int height = 2; // 키 2m
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착하였습니다 #1");

        // 키가 엄청나게 큰 사람의 경우
        move = 0;
        height = 25;
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착하였습니다 #2");

        // 반복문 do while
        move = 0;
        height = 25;
        do {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;

        } while (move + height < distance);
        System.out.println("도착하였습니다 #3");
    }
}
