package parking.model;
import java.time.LocalDateTime;
public class ParkingTicket { private static long nextId=1; private final long id; private final Vehicle vehicle; private final int floor,slot; private final LocalDateTime entry;
 public ParkingTicket(Vehicle v,int f,int s){this(v,f,s,LocalDateTime.now());}
 public ParkingTicket(Vehicle v,int f,int s,LocalDateTime entry){if(v==null||f<0||s<0||entry==null)throw new IllegalArgumentException("Invalid ticket data");id=nextId++;vehicle=v;floor=f;slot=s;this.entry=entry;}
 public long getId(){return id;} public Vehicle getVehicle(){return vehicle;} public int getFloor(){return floor;} public int getSlot(){return slot;} public LocalDateTime getEntry(){return entry;}
}
