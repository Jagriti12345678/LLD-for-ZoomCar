import java.util.List;

public class VehicleRentalSystem {
    List<Store> storeList;
    List<User> userList;

    VehicleRentalSystem(List<Store> storeList, List<User> userList){
        this.storeList=storeList;
        this.userList=userList;
    }

    public Store getStore(Location location){
         return storeList.get(0);
    }
}
