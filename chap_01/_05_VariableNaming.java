package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        /* 변수이름 설정 규칙
        1. 저장할 값에 어울리는 이름
        2. 밑줄, 문자, 숫자 사용가능 (공백 사용 불가)
        3. 밑줄 또는 문자로 시작 가능 (숫자로 시작 불가)
        4. 한 단어 또는 2개 이상 단어의 연속
        5. 소문자로 시작, 이후 각 단어의 시작글자는 대문자 (첫 단어는 제외)
        6. 예약어 사용 불가
         */

        //입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "희진"; //이름
        String lastName = "김"; //성
        String dateOfBirth = "1999-03-23"; //생년월일
        String residentialAddress = "라마다 호텔"; //체류지
        String purposeOfVisit = "관광"; // 입국목적
        String flightNo = "KE657"; //비행기
        String _flightNo = "KE657"; //비행기
        String flight_No = "KE657"; //비행기

        int accompany = 2; //동반 가족 수
        int lengthOfStay = 5; //체류 기간

        String item1 = "시계";
        String item2 = "가방";
        // String 3item = "피아제"; --- 숫자시작이라 안됨


        // 예외 : 상수는 다 대문자로 쓴다

        final String CODE = "나야나야나";
        final int VICTORY = 6;
    }
}
