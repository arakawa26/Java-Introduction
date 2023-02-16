package chap_07;

public class _10_AccesModifier {
    public static void main(String[] args) {
        // 캡슐화 ( Encapsulation )
        // 정보은닉 ( Information Hiding )

        // 접근 제어자
        // private : 해당 클래스 내에서만 접근 가능
        // public : 모든 클래스에서 접근 가능
        // default : 아무것도 안적으면 기본 적용. 같은 패키지 내에서만 접근 가능
        // protected : 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근 가능

        BlackBoxRe b1 = new BlackBoxRe();
        b1.modelName = "까망이";
        b1.resolution = "UHD";
        b1.setPrice(20000);
        b1.color = "블랙";

        // 할인 행사
        b1.setPrice(-5000);
        System.out.println("가격 : " + b1.getPrice());
        System.out.println("해상도 : " + b1.resolution);

        System.out.println("--------------");

        BlackBoxRe b2 = new BlackBoxRe();
        b2.setModelName("하양이");
        // 해상도 입력을 까먹은 상황
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());
    }
}
