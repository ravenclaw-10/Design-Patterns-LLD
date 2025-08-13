package Creational_Design_Patterns.Builder;

import java.util.List;

public class Pizza {
    private final String base;
    private final String size;

    private final boolean extraCheez;
    private final List<String> toppings;
    private final String drink;

    Pizza(PizzaBuilder builder) {
        this.base = builder.base;
        this.size = builder.size;
        this.extraCheez = builder.extraCheez;
        this.toppings = builder.toppings;
        this.drink = builder.drink;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "base='" + base + '\'' +
                ", size='" + size + '\'' +
                ", extraCheez=" + extraCheez +
                ", toppings=" + toppings +
                ", drink='" + drink + '\'' +
                '}';
    }

    public static class PizzaBuilder {
        private String base;
        private String size;
        private boolean extraCheez;
        private List<String> toppings;
        private String drink;

        PizzaBuilder(String base, String size) {
            this.base = base;
            this.size = size;
        }

        public PizzaBuilder withExtraCheez(boolean cheez) {
            this.extraCheez = cheez;
            return this;
        }

        public PizzaBuilder topping(List<String> toppings) {
            this.toppings = toppings;
            return this;
        }

        public PizzaBuilder drink(String drink) {
            this.drink = drink;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
