package parking.service;
import parking.model.*;import java.time.*;import java.util.*;
public class ParkingService {
 private final ParkingSlot[][] slots; private final Map<String,ParkingTicket> active=new HashMap<>(); private double collection=0;
 public ParkingService(int[] counts){if(counts==null)throw new IllegalArgumentException("Counts required");slots=new ParkingSlot[counts.length][];for(int f=0;f<counts.length;f++){if(counts[f]<0)throw new IllegalArgumentException("Negative slots");slots[f]=new ParkingSlot[counts[f]];for(int s=0;s<counts[f];s++)slots[f][s]=new ParkingSlot(f,s);}}
 public ParkingTicket enter(Vehicle v,boolean validMonthlyPass){if(v==null)throw new IllegalArgumentException("Vehicle required");String key=v.getRegNo();if(active.containsKey(key))throw new IllegalArgumentException("Duplicate active registration: "+key);
  for(ParkingSlot[] floor:slots)for(ParkingSlot slot:floor)if(slot.isFree()){slot.park(v);ParkingTicket t=new ParkingTicket(v,slot.getFloor(),slot.getNumber());active.put(key,t);return t;}throw new IllegalStateException("Parking full");}
 public double exit(String regNo,long minutes,boolean validMonthlyPass,int chargingKWh){if(minutes<0)throw new IllegalArgumentException("Negative duration");ParkingTicket t=active.remove(regNo.toUpperCase());if(t==null)throw new IllegalArgumentException("No active ticket");double fee=validMonthlyPass?0:t.getVehicle().calculateFee(minutes);if(!validMonthlyPass&&t.getVehicle() instanceof Chargeable c)fee+=c.chargingFee(chargingKWh);slots[t.getFloor()][t.getSlot()].release();collection+=fee;return fee;}
 public int activeCount(){return active.size();} public double getCollection(){return collection;}
}
