package chap_08.Camera;

import chap_08.Detecter.Detectable;
import chap_08.Reporter.Reportable;

public class SpeedCam extends Camera implements Reportable, Detectable {
    private Detectable detecter;
    private Reportable reporter;

    public void setDetecter(Detectable detecter) {
        this.detecter = detecter;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
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
