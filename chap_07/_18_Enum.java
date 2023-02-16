package chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        // 열거형 (Enum)
        // 달력(1,2,..), 옷사이즈(S,M,L,XL), 해상도(HD,FHD,...)

        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        resolution = Resolution.FHD;
        System.out.println(resolution);

        System.out.print("동영상 녹화 품질 : ");
        switch (resolution) {
            case HD:
                System.out.println("일반화질");
                break;
            case UHD:
                System.out.println("고화질");
                break;
            case FHD:
                System.out.println("초고화질");
                break;
        }

        resolution= Resolution.valueOf("HD"); // 이런식으로 문자열로 된걸 받을수도 있음
        System.out.println(resolution);

        System.out.println();

        for (Resolution myRes: Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.ordinal());
        }

        System.out.println();
        for (Resolution myRes: Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }
    }
}

enum Resolution {
    HD(1288), FHD(1920), UHD(3840);

    private final int width;
    Resolution(int width) {
        this.width = width;
    }
    public int getWidth() {
        return width;
    }
}