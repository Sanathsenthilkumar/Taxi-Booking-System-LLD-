public class Booking {
    private int bookingId;
    private int customerId;
    private char from ;
    private  char to;
    public int getBookingId() {
        return bookingId;
    }
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public char getFrom() {
        return from;
    }
    public void setFrom(char from) {
        this.from = from;
    }
    public char getTo() {
        return to;
    }
    public void setTo(char to) {
        this.to = to;
    }
    public int getPickUpTime() {
        return pickUpTime;
    }
    public void setPickUpTime(int pickUpTime) {
        this.pickUpTime = pickUpTime;
    }
    public int getDropTime() {
        return dropTime;
    }
    public void setDropTime(int dropTime) {
        this.dropTime = dropTime;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Booking.count = count;
    }
    private int pickUpTime;
    private int dropTime;
    private int amount;
    static int count=1;
    public Booking( int customerId, char from, char to, int pickUpTime,int dropTime, int amount) {
        this.bookingId = count++;
        this.customerId = customerId;
        this.from = from;
        this.to = to;
        this.pickUpTime = pickUpTime;
        this.dropTime = dropTime;
        this.amount = amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Booking{");
        sb.append("bookingId=").append(bookingId);
        sb.append(", customerId=").append(customerId);
        sb.append(", from=").append(from);
        sb.append(", to=").append(to);
        sb.append(", pickUpTime=").append(pickUpTime);
        sb.append(", dropTime=").append(dropTime);
        sb.append(", amount=").append(amount);
        sb.append('}');
        return sb.toString();
    }
     
}
