package store_room;

/**
 * Created by siddhahastmohapatra on 10/02/17.
 */
public class KitchenStoreFactory {

    public static StoreRoom getStoreRoom(String kitchenType){
        if(kitchenType.equalsIgnoreCase(kitchenType)){
            return ItalianKitchenStoreRoom.getStoreRoom();
        }
        return null;
    }

}
