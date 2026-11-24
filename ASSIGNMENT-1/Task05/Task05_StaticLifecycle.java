// Task 5: static ticket sequence and facility-specific occupancy.
public class Task05_StaticLifecycle {
    static class ParkingTicket { private static int nextId=1000; final int id; ParkingTicket(){id=nextId++;} }
    static class ParkingFacility { private int occupancy; void park(){occupancy++;} int getOccupancy(){return occupancy;} }
    public static void main(String[] args){ParkingFacility north=new ParkingFacility(),south=new ParkingFacility();north.park();south.park();ParkingTicket a=new ParkingTicket(),b=new ParkingTicket();System.out.println("Ticket IDs: "+a.id+", "+b.id);System.out.println("North occupancy: "+north.getOccupancy()+", South occupancy: "+south.getOccupancy());}
}
