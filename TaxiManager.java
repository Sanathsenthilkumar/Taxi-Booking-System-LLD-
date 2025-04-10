import java.util.*;
public class TaxiManager {
    private List<Taxi> taxis = new ArrayList<>();
    TaxiManager(int taxiCount){
        for(int i=1;i<=taxiCount;i++){
            Taxi t = new Taxi(i,'A');
            taxis.add(t);
        }
    }
    public int getDistance(char from, char to){
        int distance = Math.abs(from - to)*15;
        return distance;
    }
     Taxi availableTaxi(int pickupTime, char From){
        int minDistance = Integer.MAX_VALUE;
        int minEarning = Integer.MAX_VALUE;
        Taxi t = null;
        for(Taxi taxi : taxis){
            if(taxi.getAvailableAt() <= pickupTime){
                if(getDistance(taxi.getCurrentLocation(), From) <= minDistance){
                    minDistance = getDistance(taxi.getCurrentLocation(), From);
                    if(taxi.getEarning() < minEarning){
                        minEarning = taxi.getEarning();
                        t = taxi;
                       
                    }
                }
            }
        }
        return t;
    }
    public int amount(char from, char to){
        int distance = getDistance(from, to);
        if(distance <= 5){
            return 100;
        }
        int amt = 100;
        distance-=5;
        amt+=distance*10;
        return amt;
    }

     public void Booking(int customerId, int taxiId, char from, char to, int pickUpTime){
         int unavailable = Math.abs(from - to);
         Booking book = new Booking(customerId, from, to, pickUpTime,pickUpTime+unavailable,amount(from, to));
         taxis.get(taxiId-1).setBookingDetails(book);
         taxis.get(taxiId-1).setEarning(amount(from, to));
         taxis.get(taxiId-1).setCurrentLocation(to);
         taxis.get(taxiId-1).setAvailableAt(pickUpTime+unavailable);
     }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TaxiManager{");
        sb.append("taxis=").append(taxis);
        sb.append('}');
        return sb.toString();
    }
}
