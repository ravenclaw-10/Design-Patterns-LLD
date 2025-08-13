package Creational_Design_Patterns.Builder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza.PizzaBuilder("Thin Crust", "Large")
                .build();
        System.out.println("Pizza 1 : " + pizza1.toString());
        Pizza pizza2 = new Pizza.PizzaBuilder("Cheez Burst", "Medium")
                .withExtraCheez(true)
                .topping(Arrays.asList("Jalepeno","Olive","Corn"))
                .drink("Coke")
                .build();
        System.out.println("Pizza 2 :" + pizza2.toString());
    }
}
