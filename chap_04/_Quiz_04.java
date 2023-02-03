package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        String carKind = "경차";
        int max = 30000;
        int time = 10;
        int chargeHour = 4000;
        int chargeTotal = (time*chargeHour > max) ? max : time * chargeHour ;

        /*
        int chargeTotal;
        if (time*chargeHour > max) {
            chargeTotal = max;
        } else {
            chargeTotal = time * chargeHour;
        }
        */

        if (carKind == "경차" || carKind == "장애인 차량") {
            chargeTotal /= 2;
        }

        System.out.println("총 주차요금은 " + chargeTotal + "원 입니다");
    }
}
