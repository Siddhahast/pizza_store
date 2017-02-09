package app;

import entity.Pizza;
import store.PizzaStore;
import factory.PizzaStoreFactory;
/**
 * Created by siddhahastmohapatra on 09/02/17.
 */
public class App {

    public static void main(String[] args) {

        String pizzaBase = "thincrust";
        String[] ingredients = {"capsicum", "cheese"};
        String store = "italian";

        PizzaStore pizzaStore = PizzaStoreFactory.getPizzaStore(store);
        Pizza pizza = pizzaStore.orderPizza(ingredients, pizzaBase);
        int cost = pizzaStore.getCost();

        System.out.println(pizza.getDescription());
        System.out.println(cost);
    }

}
