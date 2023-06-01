import Product.Vehicle;
import Product.VehicleType;

import java.util.List;

public class Store {
    int storeID;
    VehicleInventoryManagement vehicleInventoryManagement;
    Location location;
    List<Reservation> reservations;

    public List<Vehicle> getVehicles(VehicleType vehicleType){
        return  vehicleInventoryManagement.getVehicles();
    }

    public void setVehicles(List<Vehicle> vehicles){
        vehicleInventoryManagement=new VehicleInventoryManagement(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation=new Reservation();
        reservation.createReservation(user, vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationId){
        return true;
    }
}
