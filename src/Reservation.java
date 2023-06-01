import Product.Vehicle;

import java.util.Date;

public class Reservation {
    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingFrom;
    Date bookingTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    ReservationType reservationType;
    Location location;
    ReservationStatus reservationStatus;

    public int createReservation(User user, Vehicle vehicle){
        reservationId = 1234;
        this.user=user;
        this.reservationType=ReservationType.DAILY;
        this.reservationStatus=ReservationStatus.SCHEDULED;

        return reservationId;
    }

}
