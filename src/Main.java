import Product.Car;
import Product.Vehicle;
import Product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = addUser();
        List<Vehicle> vehicles= addVehicle();
        List<Store> stores =addStore(vehicles);

        VehicleRentalSystem vehicleRentalSystem=new VehicleRentalSystem(stores, users);

        User user=users.get(0);

        Location location = new Location(403012, "Bangalore", "Karnataka", "India");
        Store store = vehicleRentalSystem.getStore(location);

        List<Vehicle> storeVehicles = store.getVehicles(VehicleType.CAR);

        Reservation reservation= store.createReservation(storeVehicles.get(0), users.get(0));

        Bill bill= new Bill(reservation);

        Payment payment=new Payment();

        payment.payBill(bill);


    }

    public static List<User> addUser(){
        List<User> user=new ArrayList<>();
        User user1=new User();
        user1.setUserId(1);
        user.add(user1);
        return user;
    }

    public static List<Store> addStore(List<Vehicle> vehicles){
        List<Store> stores=new ArrayList<>();
        Store store1=new Store();
        store1.storeID=1;
        store1.setVehicles(vehicles);
        stores.add(store1);
        return stores;
    }

    public static List<Vehicle> addVehicle(){
        List<Vehicle> vehicles=new ArrayList<>();
        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleId(1);
        vehicle1.setVehicleType(VehicleType.CAR);

        Vehicle vehicle2=new Car();
        vehicle2.setVehicleId(2);
        vehicle2.setVehicleType(VehicleType.CAR);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);

        return vehicles;
    }
}
