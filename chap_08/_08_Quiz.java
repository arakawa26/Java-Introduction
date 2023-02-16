package chap_08;

import chap_08.Camera.SpeedCam;
import chap_08.Detecter.AccidentDetecter;
import chap_08.Detecter.Detectable;
import chap_08.Reporter.Reportable;
import chap_08.Reporter.VideoReporter;

public class _08_Quiz {
    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();

        /*
        Detectable accidentDetecterdetecter = new AccidentDetecter();
        Reportable videoReporterreporter = new VideoReporter();
        speedCam.setDetecter(accidentDetecterdetecter);
        speedCam.setReporter(videoReporterreporter);
         */
        speedCam.setDetecter(new AccidentDetecter());
        speedCam.setReporter(new VideoReporter());

        speedCam.showMainFeature();
        speedCam.detect();
        speedCam.report();

    }
}
