package chap_07.Camera;

public class SlowActionCam /* extends ActionCam (final 이라 상속 불가) */ {
    public String name;
    public SlowActionCam() {
        this.name = "슬로우 액션 카메라";
    }
    public void recordVideo(){
        // 동영상 녹화
        System.out.println(this.name + " : 동영상을 녹화합니다.");
    }

    //public void makeVideo() {
    //    System.out.println(this.name + " : " + this.lens + "로 촬영한 멋진 '슬로우 모드' 비디오를 출력합니다.");
    //}
    // 부모클래스인 ActionCam 에서 makeVideo 메소드를 final 로 선언해서 오버라이딩 불가능
}
