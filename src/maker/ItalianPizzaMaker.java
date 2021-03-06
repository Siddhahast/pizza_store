package maker;

import entity.Pizza;
import ingredients.BellPepper;
import ingredients.Capsicum;
import ingredients.Cheese;
import ingredients.NoTopping;
import kitchen.ItalianPizzaKitchen;
import kitchen.PizzaKitchen;

/**
 * Created by siddhahastmohapatra on 09/02/17.
 */
public class ItalianPizzaMaker implements PizzaMaker {
    private Pizza pizza;

    private PizzaKitchen kitchen;

    public ItalianPizzaMaker(){
        kitchen = new ItalianPizzaKitchen();
    }

    public void setPizza(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public Pizza makePizza(String[] ingredients) {

        for (String ingredient: ingredients){

            if(kitchen.isIngredientAvailable(ingredient)){
                if(ingredient.equalsIgnoreCase("capsicum")){
                    pizza = new BellPepper(pizza);
                } else if(ingredient.equalsIgnoreCase("cheese")) {
                    pizza = new Cheese(pizza);
                } else{
                    pizza = new NoTopping(pizza);
                    ingredient = "invalid";
                }
                pizza.addIngredient(ingredient);
            } else{

            }
        }
        return pizza;
    }
}
