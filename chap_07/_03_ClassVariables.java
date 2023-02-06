package chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);

        // 자동신고기능 개발 여부
        System.out.println("- 개발 전 -");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.conAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.conAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.conAutoReport);


        // 기능 개발
        BlackBox.conAutoReport = true;
        System.out.println("- 개발 후 -");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.conAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.conAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.conAutoReport);

        // 클래스 변수가 연결되어 있음을 확인
        System.out.println("- 실험용 -");
        b1.conAutoReport = false;
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.conAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.conAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.conAutoReport);
    }
}
