package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.autoReport(); // 현재 지원 여부가 false
        BlackBox.conAutoReport = true; // 개발됨
        b1.autoReport(); // 현재 지원 여부가 false

        b1.insertMemoryCard(256);

        // 일반 영상 : type1
        // 이벤트 영상 (충돌 감지 영상) : type2
        System.out.println("일반 영상 파일 수 : " + b1.getVideoFileCount(1));
        System.out.println("이벤트 영상 파일 수 : " + b1.getVideoFileCount(2));
        System.out.println("전체 영상 파일 수 : " + b1.getVideoFileCount(3));
    }
}
