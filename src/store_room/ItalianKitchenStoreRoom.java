package store_room;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by siddhahastmohapatra on 10/02/17.
 */
public class ItalianKitchenStoreRoom implements StoreRoom {

    private Map<String, Integer> ingredientStore;
    private int ingredientUsageCounter;

    private static ItalianKitchenStoreRoom storeRoom = new ItalianKitchenStoreRoom();

    private ItalianKitchenStoreRoom(){
        this.ingredientUsageCounter = 0;
        ingredientStore = new HashMap<String, Integer>();
    }

    @Override
    public int getIngredient(String ingredient) {

        if(ingredientStore.get(ingredient)==0){
            return -1;
        }
        ingredientStore.put(ingredient, ingredientStore.get(ingredient)-1);
        ingredientUsageCounter++;
        return 1;
    }

    public void addIngredient(String ingredient, int units){
        if(ingredientStore.get(ingredient)==null){
            ingredientStore.put(ingredient, units);
        }else{
            ingredientStore.put(ingredient, ingredientStore.get(ingredient)+units);
        }
    }

    @Override
    public boolean isIngredientAvailable(String ingredient) {
        return (ingredientStore.get(ingredient)==null || ingredientStore.get(ingredient)==0)?false:true;
    }

    @Override
    public void removeIngredient(String ingredient, int units) {
        if(ingredientStore.get(ingredient)<=units){
            ingredientStore.put(ingredient, 0);
        }else{
            ingredientStore.put(ingredient, ingredientStore.get(ingredient)-units);
        }
    }

    public static StoreRoom getStoreRoom() {
        return storeRoom;
    }
}
