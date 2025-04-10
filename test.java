public class test {
   public static void main(String[] args) {
         TaxiManager t= new TaxiManager(5);
         Taxi taxi=t.availableTaxi(9, 'B');
         if(taxi==null)System.out.println("Rejected");
         else{
            t.Booking(1, taxi.getTaxiId(), 'B', 'C', 9);
         }
         //System.out.println(t.availableTaxi(1, 'a'));
         System.out.println(t);

   }
   
}
