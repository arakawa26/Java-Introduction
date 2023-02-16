package chap_07.Camera;

public final class ActionCam extends Camera { // 클래스에 final 을 붙여버리면 다른 클래스가 얘를 상속받을수 없음
    public final String lens; // = "광각렌즈"; // final 붙이면 다른 클래스는 물론이거니와, 같은 클래스에서도 변경 불가 ( 생성자는 예외 )
    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈"; // 생성자에서는 final 변수에 대입 가능
    }
    public final void makeVideo() { // 메소드에 final 을 붙여버리면 자식클래스에서 이 메소드를 overriding 불가능
        System.out.println(this.name + " : " + this.lens + "로 촬영한 멋진 비디오를 출력합니다.");
    }
}
