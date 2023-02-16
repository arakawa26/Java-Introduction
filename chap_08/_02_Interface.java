package chap_08;

import chap_08.Camera.FactoryCam;
import chap_08.Detecter.AdvancedFireDetecter;
import chap_08.Detecter.Detectable;
import chap_08.Detecter.FireDetecter;
import chap_08.Reporter.NormalReporter;
import chap_08.Reporter.Reportable;
import chap_08.Reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스

        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();

        System.out.println();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();
        videoReporter.recordVideo();

        System.out.println();

        Reportable videoReporter2 = new VideoReporter();
        videoReporter2.report();
        // videoReporter2.recordVideo(); // 얜 Reportable 인터페이스에 없는 메소드라 사용 불가

        System.out.println();


        Detectable fireDetecter = new FireDetecter();
        fireDetecter.detect();

        Detectable advancedFireDetecter = new AdvancedFireDetecter();
        advancedFireDetecter.detect();

        System.out.println();

        FactoryCam factoryCam =new FactoryCam();
        factoryCam.setDetecter(advancedFireDetecter);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
