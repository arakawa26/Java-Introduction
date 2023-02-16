package chap_08.Reporter;

public class VideoReporter implements Reportable{
    @Override
    public void report() {
        System.out.println("직전 30초 영상과 함께 신고를 진행합니다");
    }

    public void recordVideo() {
        System.out.println("동영상 촬영을 시작합니다");
    }
}
