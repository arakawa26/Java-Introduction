package chap_06;

public class _03_Return {
    // 호텔 전화번호
    public static String getPhoneNumber(){
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }
    // 호텔 주소
    public static String getAddress(){
        return "화성시 반월동";
    }


    public static void main(String[] args) {
        // 반환값 return
        System.out.println("호텔 전화번호 : " + getPhoneNumber());
        System.out.println("호텔 주소 : " + getAddress());
    }
}
