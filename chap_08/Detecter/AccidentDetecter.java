package chap_08.Detecter;

public class AccidentDetecter implements Detectable{

    @Override
    public void detect() {
        System.out.println("사고를 감지합니다");
    }
}
