package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String Data, int initialNum){
        String hiddenData = Data.substring(0,initialNum);
        for (int i = initialNum; i < Data.length(); i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }
    public static void main(String[] args) {
        String name = "김희진";
        String id = "990323-1214111";
        String phone = "010-7414-3082";

        System.out.println(getHiddenData(name,1));
        System.out.println(getHiddenData(id, 8));
        System.out.println(getHiddenData(phone, 9));
    }
}
