package chap_07.Burger;

public class Cheeze extends Classic {
    public Cheeze() {
        super("치즈버거");
    }
    public void printRecipe() {
        super.printRecipe();
        System.out.println("+치즈");
    }
}
