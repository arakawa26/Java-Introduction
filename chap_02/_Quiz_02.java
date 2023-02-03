package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        double key = 172.3;
        String s = (key >= 120) ? "탑승 가능합니다" : "탑승 불가능 합니다";
        System.out.println("키가 " + key + "cm 이므로 " + s);
    }
}
