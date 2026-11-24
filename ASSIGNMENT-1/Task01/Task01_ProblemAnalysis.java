import java.util.*;
// Task 1: Candidate objects and responsibilities, demonstrated as Java model classes.
public class Task01_ProblemAnalysis {
    static class Vehicle { String regNo, type; Vehicle(String regNo,String type){this.regNo=regNo;this.type=type;} }
    static class ParkingSlot { int floor, number; Vehicle vehicle; boolean isFree(){return vehicle==null;} }
    static class ParkingTicket { static int nextId=1; final int ticketId; final Vehicle vehicle; final long entryMillis;
        ParkingTicket(Vehicle v){ticketId=nextId++;vehicle=v;entryMillis=System.currentTimeMillis();} }
    static class ParkingFloor { List<ParkingSlot> slots=new ArrayList<>(); }
    static class ParkingFacility { List<ParkingFloor> floors=new ArrayList<>(); }
    public static void main(String[] args) {
        Vehicle v=new Vehicle("TN01AB1234","Car"); ParkingTicket t=new ParkingTicket(v);
        System.out.println("Vehicle: "+v.regNo+", type: "+v.type);
        System.out.println("Ticket: "+t.ticketId+", vehicle: "+t.vehicle.regNo);
        System.out.println("Candidate classes: Vehicle, ParkingSlot, ParkingFloor, ParkingTicket, ParkingFacility, ParkingService, FeePolicy");
    }
}
