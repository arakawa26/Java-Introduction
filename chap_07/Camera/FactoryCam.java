package chap_07.Camera;

// FactoryCam is a Camera (IS-A 관계)
public class FactoryCam extends Camera { // 자식 클래스
    public FactoryCam() {
        // this.name = "공장 카메라";
        super("공장 카메라"); // 이러면 바로 부모클래스의 생성자를 호출하는것임
    }

    public void recordVideo(){
        // 동영상 녹화
        super.recordVideo(); // 이런식으로 overriding 으로 기능을 추가하려 할때, 부모클래스의 기존 기능을 간단히 불러올수 있다
        detectFire();
    }

    public void detectFire() {
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재감지");
    }
}
