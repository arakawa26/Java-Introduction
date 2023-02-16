package chap_08.Camera;

import chap_08.Detecter.Detectable;
import chap_08.Reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    private Detectable detecter;
    private Reportable reporter;

    public void setDetecter(Detectable detecter) {
        this.detecter = detecter;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() { // 추상클래스의 추상메소드를 구현
        System.out.println("화재 감지");
    }

    public void fact() {
        System.out.println("사실이다");
    }


    @Override
    public void detect() {
        detecter.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}
