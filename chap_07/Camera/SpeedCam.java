package chap_07.Camera;

// SpeedCam is a Camera (IS-A 관계)
public class SpeedCam extends Camera { // 자식 클래스
    public SpeedCam() {
        // this.name = "과속단속 카메라";
        super("과속단속 카메라");
    }

    public void takePicture(){
        // 사진 촬영
        super.takePicture(); // 이런식으로 overriding 으로 기능을 추가하려 할때, 부모클래스의 기존 기능을 간단히 불러올수 있다
        checkSpeed();
        recognizeLicensePlate();
    }


    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        // 번호판 인식
        System.out.println("차량 번호를 인식합니다.");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도측정,차량번호인식");
    }
}
