package store;

import entity.Pizza;
import factory.CaliforniaPizzaBaseFactory;
import factory.PizzaBaseFactory;
import maker.CalifornianPizzaMaker;
import maker.PizzaMaker;
/**
 * Created by siddhahastmohapatra on 09/02/17.
 */
public class CaliforniaPizzaStore extends PizzaStore {

    private Pizza pizza;
    private PizzaMaker pizzaMaker;
    private PizzaBaseFactory pizzaBaseFactory;

    public CaliforniaPizzaStore(){
        pizzaBaseFactory = new CaliforniaPizzaBaseFactory();
        pizzaMaker = new CalifornianPizzaMaker();
    }

    @Override
    public Pizza orderPizza(String[] ingredients, String pizzaBase) {
        this.pizza = pizzaBaseFactory.getPizzaBase(pizzaBase);
        pizzaMaker.setPizza(pizza);
        pizza = pizzaMaker.makePizza(ingredients);
        return pizza;
    }

    @Override
    public int getCost() {
        return pizza.cost();
    }
}
