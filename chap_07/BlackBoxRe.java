package chap_07;

public class BlackBoxRe { // 클래스를 public 으로 선언할 경우엔 무조건 파일명과 같아야함
    public String modelName;// instance variable. 각 개체마다 다를수 있다
    String resolution;
    private int price; // 이래버리면 이 클래스의 인스턴스에서 겟터와 셋터로만 변수에 접근 가능
    protected String color;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요"; // 이
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 10000) {
            this.price = 10000; // 이렇게 함으로서 instance 변수의 범위?제한? 등을 설정 가능
        } else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

