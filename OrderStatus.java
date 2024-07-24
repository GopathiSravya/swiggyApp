public class OrderStatus {
    public String pending;
    public String CONFIRMED;
    public String PREPARING;
    public String readyforPICKUP;
    public String outforDELIVERY;
    public String DELIVERED;
    public String CANCELLED;

    @Override
    public String toString() {
        return "OrderStatus{" +
                "pending='" + pending + '\'' +
                ", CONFIRMED='" + CONFIRMED + '\'' +
                ", PREPARING='" + PREPARING + '\'' +
                ", READYFORPICKUP='" + readyforPICKUP + '\'' +
                ", OUTFORDELIVERY='" + outforDELIVERY + '\'' +
                ", DELIVIERED='" + DELIVERED + '\'' +
                ", CANCELLED='" + CANCELLED + '\'' +
                '}';
    }
}