package chap_08.Detecter;

public interface Detectable {
    void detect(); // 감지 기능의 메소드(의 뼈대)
    // interface의 모든 메소드의 선언에는 기본적으로 ( public abstract ) 가 있다
    // 또한 interface 에서 변수를 선언하면 그건 기본적으로 ( public static final ) 임
}
