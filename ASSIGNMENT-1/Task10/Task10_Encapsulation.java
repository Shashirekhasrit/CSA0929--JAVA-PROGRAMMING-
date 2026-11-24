// Task 10: private fields and validation; wrapper comparison demonstration.
public class Task10_Encapsulation {
    static class ParkingSlot { private final int floor,slot; private String vehicleNo;
        ParkingSlot(int floor,int slot){if(floor<0||slot<0)throw new IllegalArgumentException("Invalid slot position");this.floor=floor;this.slot=slot;}
        public void park(String regNo){if(regNo==null||regNo.isBlank())throw new IllegalArgumentException("Registration required");if(vehicleNo!=null)throw new IllegalStateException("Slot occupied");vehicleNo=regNo;}
        public void release(){if(vehicleNo==null)throw new IllegalStateException("Already free");vehicleNo=null;}
        public String getVehicleNo(){return vehicleNo;} public String toString(){return "Floor "+floor+", slot "+slot+", vehicle "+vehicleNo;}}
    public static void main(String[] args){ParkingSlot s=new ParkingSlot(0,1);s.park("TN01AB1234");System.out.println(s);Integer x=1000,y=1000;System.out.println("Use equals for wrappers: "+x.equals(y));}
}
