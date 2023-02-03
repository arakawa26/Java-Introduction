package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String Born = "990323-1214111";
        System.out.println(Born.substring(0,8));
        System.out.println(Born.substring(0,Born.indexOf("-")+2));
    }
}
