package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class Person : 사람
        // class Student extends Person : 학생 (학생은 사람이다. Student is a person)
        // class Teacher extends Person : 선생 (선생은 사람이다. Teacher is a person)

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        Camera[] cameras = new Camera[3]; // 이런식으로 배열로 선언도 가능
        cameras[0] = new Camera(); // 각 배열애는 자식 클래스를 넣는게 가능
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        System.out.println();

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }

        System.out.println();

        // factoryCam.detectFire();
        // speedCam.checkSpeed();
        // speedCam.recognizeLicenseLate();
        // 위의 코드들은 사용 불가

        if (camera instanceof Camera) { // 조건문은 참임. 즉 camera 는 Camera 의 인스턴스
            System.out.println("카메라입니다");
        }
        if (factoryCam instanceof FactoryCam) { // 조건문은 참임. 즉 factoryCam 은 FactoryCam 의 인스턴스
            ((FactoryCam)factoryCam).detectFire(); // 형변환을 이용해 FactoryCam 클래스에만 있던 메소드를 사용 가능해짐
        }
        if (speedCam instanceof SpeedCam) { // 조건문은 참임. 즉 speedCam 은 SpeedCam 의 인스턴스
            ((SpeedCam) speedCam).checkSpeed(); // 형변환을 이용해 SpeedCam 클래스에만 있던 메소드를 사용 가능해짐
        }


        // 자바의 모든 클래스는 Object 라는 클래스를 상속함.
        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();
        // 따라서 요런식으로도 가능

    }
}
