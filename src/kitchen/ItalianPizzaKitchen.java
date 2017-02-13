package kitchen;

import store.PizzaStore;
import store_room.ItalianKitchenStoreRoom;
import store_room.KitchenStoreFactory;
import store_room.StoreRoom;

/**
 * Created by siddhahastmohapatra on 10/02/17.
 */
public class ItalianPizzaKitchen implements PizzaKitchen{

    private StoreRoom store;
    private String kitchenType = "italian";

    public ItalianPizzaKitchen(){
        store = KitchenStoreFactory.getStoreRoom(kitchenType);
    }

    @Override
    public boolean isIngredientAvailable(String ingredient) {
        return store.isIngredientAvailable(ingredient);
    }

    @Override
    public void removeUnitIngedient(String ingredient, int unit) {
        store.removeIngredient(ingredient, unit);
    }

    @Override
    public void addIngredient(String ingredient, int unit) {

    }
}
