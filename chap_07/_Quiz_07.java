package chap_07;

import chap_07.Burger.Cheeze;
import chap_07.Burger.Classic;
import chap_07.Burger.Shrimp;

public class _Quiz_07 {
    public static void main(String[] args) {
        Classic[] burger = new Classic[3];
        burger[0] = new Classic();
        burger[1] = new Cheeze();
        burger[2] = new Shrimp();

        System.out.println("각 햄버거들의 레시피를 읊어봅니다. \n--------------");
        for (Classic hamburger:burger) {
            hamburger.printRecipe();
            System.out.println("----------------");
        }
        System.out.println("-완-");
    }
}
