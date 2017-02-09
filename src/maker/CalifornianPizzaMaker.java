package maker;

import entity.Pizza;
import ingredients.Capsicum;
import ingredients.Cheese;
import ingredients.NoTopping;

/**
 * Created by siddhahastmohapatra on 09/02/17.
 */
public class CalifornianPizzaMaker implements PizzaMaker {

    private Pizza pizza;

    public CalifornianPizzaMaker(){

    }

    public void setPizza(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public Pizza makePizza(String[] ingredients) {
        for (String ingredient: ingredients){

            if(ingredient.equalsIgnoreCase("capsicum")){
                pizza = new Capsicum(pizza);
            } else if(ingredient.equalsIgnoreCase("cheese")) {
                pizza = new Cheese(pizza);
            } else{
                pizza = new NoTopping(pizza);
            }
        }
        return pizza;
    }
}
