package kitchen;

/**
 * Created by siddhahastmohapatra on 10/02/17.
 */
public interface PizzaKitchen {

    public boolean isIngredientAvailable(String ingredient);

    public void removeUnitIngedient(String ingredient, int unit);

    public void addIngredient(String ingredient, int unit);

}
