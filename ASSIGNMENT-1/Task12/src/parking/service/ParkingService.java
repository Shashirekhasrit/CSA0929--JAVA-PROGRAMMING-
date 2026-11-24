package parking.service;
import parking.model.*;import java.time.*;import java.util.*;
public class ParkingService {
 private final ParkingSlot[][] slots;private final Map<String,ParkingTicket> active=new HashMap<>();private double collection;
 public ParkingService(int[] counts){if(counts==null)throw new IllegalArgumentException("Counts required");slots=new ParkingSlot[counts.length][];for(int f=0;f<counts.length;f++){if(counts[f]<0)throw new IllegalArgumentException("Negative slots");slots[f]=new ParkingSlot[counts[f]];for(int s=0;s<counts[f];s++)slots[f][s]=new ParkingSlot(f,s);}}
 public ParkingTicket enter(Vehicle v){if(v==null)throw new IllegalArgumentException("Vehicle required");String key=v.getRegNo();if(active.containsKey(key))throw new IllegalArgumentException("Duplicate registration");for(ParkingSlot[] floor:slots)for(ParkingSlot slot:floor)if(slot.isFree()){slot.park(v);ParkingTicket t=new ParkingTicket(v,slot.getFloor(),slot.getNumber());active.put(key,t);return t;}throw new IllegalStateException("Parking full");}
 public double exit(String reg,long minutes,LocalDateTime entry,OneDayPass pass,int kWh){if(minutes<0||entry==null)throw new IllegalArgumentException("Invalid duration/time");String key=reg.toUpperCase();ParkingTicket t=active.get(key);if(t==null)throw new IllegalArgumentException("No active ticket");Vehicle v=t.getVehicle();LocalDate date=entry.toLocalDate();double fee;
  if(pass!=null&&pass.isValidFor(key,date))fee=pass.getPrice();else if(v instanceof EBike eb)fee=eb.flatFee();else if(v instanceof DeliveryVan van)fee=van.calculateFee(minutes,entry.toLocalTime());else fee=v.calculateFee(minutes);
  if(v instanceof Chargeable c)fee+=c.chargingFee(kWh);slots[t.getFloor()][t.getSlot()].release();active.remove(key);collection+=fee;return fee;}
 public int activeCount(){return active.size();}public double getCollection(){return collection;}
}
