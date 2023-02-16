package chap_07;

import chap_07.Camera.ActionCam;
import chap_07.Camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
         // Final
        ActionCam actionCam = new ActionCam();
        actionCam.recordVideo();
        actionCam.makeVideo();
        // actionCam.lens = "하얀렌즈"; // 클래스에서 lens 를 final 변수로 선언하여 변경 불가

        System.out.println();

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();

    }
}
