package chap_08;

import chap_07.BlackBoxRe;
// import chap_07.* -> chap_7 패키지에 있는 모든 class들을 import 한다
// import chap_07.A; // default 클래스 -> 다른패키지라서 접근 불가

public class _00_AccesModifierTest {
    public static void main(String[] args) {
        BlackBoxRe b1 = new BlackBoxRe();
        b1.modelName = "까망이"; // public 변수 -> 다른패키지에서도 접근 가능
        // b1.resolution = "FHD"; // default 변수 -> 다른패키지라서 접근 불가
        // b1.price = "20000"; // private 변수 -> 다른클래스라서 접근 불가
        // b1.color = "블랙"; // protected 변수 -> 다른 패키지 이며, 자식클래스가 아닌 클래스라 접근 불가

        // A a = new A(); // default 클래스 -> 다른패키지라서 접근 불가
    }
}
