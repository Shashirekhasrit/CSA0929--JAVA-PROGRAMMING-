package parking.app;
import parking.model.*;import parking.service.*;
public class Main {public static void main(String[] args){ParkingService p=new ParkingService(new int[]{2,1});
 ParkingTicket t1=p.enter(new TwoWheeler("TN01A1"),false);ParkingTicket t2=p.enter(new Car("TN02B2"),false);ParkingTicket t3=p.enter(new ElectricCar("TN03C3"),false);
 System.out.println("Tickets: "+t1.getId()+", "+t2.getId()+", "+t3.getId());
 System.out.println("TwoWheeler fee: Rs "+p.exit("TN01A1",61,false,0));
 System.out.println("Car fee: Rs "+p.exit("TN02B2",120,false,0));
 System.out.println("EV fee incl. 5 kWh: Rs "+p.exit("TN03C3",60,false,5));
 System.out.println("Active vehicles: "+p.activeCount());System.out.println("Total collection: Rs "+p.getCollection());
 }}
