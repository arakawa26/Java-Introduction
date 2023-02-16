package chap_07.Burger;

public class Shrimp extends Classic {
    public Shrimp() {
        super("새우버거");
    }
    public void printRecipe() {
        super.printRecipe();
        System.out.println("+새우패티");
    }
}
