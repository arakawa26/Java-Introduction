package chap_08;

import chap_08.Camera.Camera;
import chap_08.Camera.FactoryCam;
import chap_08.Camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상황 (Data Abstraction)
        // abstract
        // 추상 클래스 (아직 완성되지 않은 클래스) (추상클래스는 추상메소드를 가질수도, 안가질수도있다.)
        // 추상 메소드 (추상 클래스 또는 인터페이스에서만 사용가능한, 틀만있는 메소드)

        // Camera camera = new Camera() // Camera 는 추상클래스이므로 이것으로 객체를 만들수 없음
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println();

        Camera factoryCam2 = new FactoryCam();
        factoryCam2.takePicture(); // Camera에 있는 그냥 메소드 사용 가능
        factoryCam2.showMainFeature(); // Camera에 있는 추상 메소드 사용 가능
        // factoryCam2.fact(); // 이 메소드는 Camera 에 없어서 사용 불가
    }
}
