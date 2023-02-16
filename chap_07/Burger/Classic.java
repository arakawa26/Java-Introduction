package chap_07.Burger;

public class Classic {
    public String name;
    public Classic(String name) {
        this.name = name;
    }
    public Classic() {
        this("햄버거");
    }

    public void printRecipe() {
        System.out.println(this.name + "의 재료 리스트");
        System.out.println("양상추 \n+소고기패티 \n+피클");
    }
}
