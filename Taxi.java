
import java.util.ArrayList;
import java.util.List;

public class Taxi {
    private int taxiId;
    private char currentLocation;
    private int availableAt ;
    private int earning;
    private   List<Booking> bookingDetails=new ArrayList<>();
    public Taxi(int taxiId, char currentLocation) {
        this.taxiId = taxiId;
        this.currentLocation = currentLocation;
        this.availableAt = 0;
        this.earning = 0;
    }
    public int getTaxiId() {
        return taxiId;
    }
    public void setTaxiId(int taxiId) {
        this.taxiId = taxiId;
    }
    public char getCurrentLocation() {
        return currentLocation;
    }
    public void setCurrentLocation(char currentLocation) {
        this.currentLocation = currentLocation;
    }
    public int getAvailableAt() {
        return availableAt;
    }
    public void setAvailableAt(int availableAt) {
        this.availableAt = availableAt;
    }
    public int getEarning() {
        return earning;
    }
    public void setEarning(int earning) {
        this.earning += earning;
    }
    public List<Booking> getBookingDetails() {
        return bookingDetails;
    }
    public void setBookingDetails(Booking bookingDetail) {
        bookingDetails.add(bookingDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Taxi{");
        sb.append("taxiId=").append(taxiId);
        sb.append(", currentLocation=").append(currentLocation);
        sb.append(", availableAt=").append(availableAt);
        sb.append(", earning=").append(earning);
        sb.append(", bookingDetails=").append(bookingDetails);
        sb.append('}');
        return sb.toString();
    }
    

}
