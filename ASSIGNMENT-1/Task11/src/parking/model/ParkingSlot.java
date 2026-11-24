package parking.model;
public class ParkingSlot { private final int floor,number; private Vehicle vehicle;
 public ParkingSlot(int f,int n){if(f<0||n<0)throw new IllegalArgumentException("Invalid slot");floor=f;number=n;}
 public boolean isFree(){return vehicle==null;} public void park(Vehicle v){if(v==null||!isFree())throw new IllegalStateException("Cannot park in slot");vehicle=v;} public void release(){if(isFree())throw new IllegalStateException("Slot already free");vehicle=null;} public int getFloor(){return floor;} public int getNumber(){return number;}
}
