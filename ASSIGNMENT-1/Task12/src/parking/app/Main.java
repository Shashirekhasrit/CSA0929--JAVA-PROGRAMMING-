package parking.app;import parking.model.*;import parking.service.*;import java.time.*;
public class Main {public static void main(String[] args){ParkingService p=new ParkingService(new int[]{2,3,1,2,4});LocalDateTime day=LocalDateTime.of(2026,11,9,10,0);
 p.enter(new EBike("TN10EB1000"));p.enter(new DeliveryVan("TN20DV2000"));p.enter(new Car("TN30CA3000"));p.enter(new TwoWheeler("TN40TW4000"));
 System.out.println("E-bike flat fee: Rs "+p.exit("TN10EB1000",90,day,null,0));
 System.out.println("Van (10 AM entry) fee: Rs "+p.exit("TN20DV2000",120,day,null,0));
 OneDayPass pass=new OneDayPass("TN30CA3000",day.toLocalDate(),40.0);
 System.out.println("Visitor one-day pass fee: Rs "+p.exit("TN30CA3000",300,day,pass,0));
 System.out.println("Two-wheeler fee: Rs "+p.exit("TN40TW4000",60,day,null,0));
 System.out.println("Active: "+p.activeCount()+", collection: Rs "+p.getCollection());
 }}
