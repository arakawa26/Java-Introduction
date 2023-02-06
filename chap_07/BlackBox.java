package chap_07;

public class BlackBox {
    String modelName;// instance variable. 각 개체마다 다를수 있다
    String resolution;
    int price;
    String color;
    int serialNumber; // 시리얼 번호
    static int counter = 0; // 시리얼 번호를 생성해주는 역할 : 0 -> 1 -> 2 -> ...
    static boolean conAutoReport = false; // 자동신고기능
    // static 이 붙은 변수는 class variable
    // 그 클래스의 모든 객체에 공통적으로 적용됨
    // 하나의 프로젝트에서 그 클래스의 클래스 변수값과 객체들의 클래스 변수값은 통일됨

    BlackBox() {
        System.out.println("기본 생성자 호출");
        this.serialNumber =  ++counter;
        // static은 classVariable 이므로 블랙박스의 instance 를 생성할때마다 생성자에 의해 counter 가 증가
        System.out.println("새로운 시리얼 넘버를 발급받았습니다. : " + this.serialNumber);
    }
    BlackBox(String modelName, String resolution, int price, String color) { // 생성자도 overloading 가능
        this(); // 이 코드로 인해 위의 기본 생성자가 호출됨
        System.out.println("사용자 정의 생성자 호출");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
    }

    void autoReport() { // static이 안붙었으므로 instance method
        if (conAutoReport == true){
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 개발 미지원으로 신고 안합니다");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다");
        System.out.println("용량은 " + capacity + "GB 입니다");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { //일반영상
            return 9; // 일반영상의 개수
        } else if (type == 2) { // 이벤트영상
            return 1; // 이벤트영상의 갸수
        } else {
            return 10; // 전체영상의 갸수
        }
    }

    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다");
        }
        System.out.println("영상은 " + min + "분 단위로 표시됩니다");
    }
    void record() {
        record(true,true,5);
    } // 원래 메소드를 호출하여 overload 하는것이 메소드들의 일괄적인 보수,유지에 유리하다

    static void callServiceCenter() { //static 이 붙었으므로 class method
        System.out.println("서비스 센터(1588-0000) 으로 연결합니다");
        // modelName = "하하" -> instance 변수 이므로 classMethod 내에선 접근 불가
        // System.out.println(modelName); -> 마찬가지의 이유로 에러 발생
        // 따라서 ClassMethod 에는 instance 변수가 필요하지 않은 공통적인 기능을 담는다.
    }
    void appendModelName(String modelName) {
        this.modelName += modelName;
        // class 의 instance variable 과 메소드의 parameter 이름이 같으면 this 로 구분해줄 수 있다
    }

    // Getter & Setter
    String getModelName() {
        return modelName;
    }
    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요"; // 이
        }
        return resolution;
    }
    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }
    void setPrice(int price) {
        if (price < 10000) {
            this.price = 10000; // 이렇게 함으로서 instance 변수의 범위?제한? 등을 설정 가능
        } else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }
    void setColor(String color) {
        this.color = color;
    }
}
