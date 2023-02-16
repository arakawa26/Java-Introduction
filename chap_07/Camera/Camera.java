package chap_07.Camera;

public class Camera {
    public String name; // 이때 접근제어자를 private 으로 해버리면 자식클래스들이 name 을 못쓴다

    public Camera() { // 부모 클래스
        this("카메라");
    }

    protected Camera(String name) {
        this.name = name;
    }

    public void takePicture(){
        // 사진 촬영
        System.out.println(this.name + " : 사진을 촬영합니다.");
    }

    public void recordVideo(){
        // 동영상 녹화
        System.out.println(this.name + " : 동영상을 녹화합니다.");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 사진촬영,동영상녹화");
    }
}
