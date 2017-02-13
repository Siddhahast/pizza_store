package store;

import billing.CaliforniaPizzaBilling;
import billing.ItalianPizzaBilling;
import billing.PizzaBilling;
import entity.Pizza;
import factory.CaliforniaPizzaBaseFactory;
import factory.ItalianPizzaBaseFactory;
import maker.PizzaMaker;
import maker.ItalianPizzaMaker;
import factory.PizzaBaseFactory;
import store_room.KitchenStoreFactory;
import store_room.StoreRoom;

/**
 * Created by siddhahastmohapatra on 09/02/17.
 */
public class italianPizzaStore extends PizzaStore {

    private Pizza pizza;
    private PizzaMaker pizzaMaker;
    private PizzaBaseFactory pizzaBaseFactory;
    private PizzaBilling pizzaBilling;


    public italianPizzaStore(){
        pizzaBaseFactory = new ItalianPizzaBaseFactory();
        pizzaMaker = new ItalianPizzaMaker();
        pizzaBilling = new ItalianPizzaBilling();
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
        return pizzaBilling.cost(pizza);
    }
}
