package store;

import entity.Pizza;

/**
 * Created by siddhahastmohapatra on 09/02/17.
 */
public abstract class PizzaStore {

    public abstract Pizza orderPizza(String[] ingredients, String pizzaBase);

    public abstract int getCost();

}
