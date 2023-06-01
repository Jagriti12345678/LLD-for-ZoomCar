public class Bill {
    Reservation reservation;
    double totalAmount;
    boolean isPaid;

    Bill(Reservation reservation){
        this.reservation = reservation;
        this.totalAmount=computeAmount();
        this.isPaid=false;
    }

    public double computeAmount(){
        return 123.0;
    }
}
