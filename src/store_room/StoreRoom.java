package store_room;

/**
 * Created by siddhahastmohapatra on 10/02/17.
 */
public interface StoreRoom {

    public int getIngredient(String ingredient);

    public void addIngredient(String ingredient, int units);

    public boolean isIngredientAvailable(String ingredient);

    public void removeIngredient(String ingredient, int units);

}
