// Task 4: default, parameterised, overloaded and copy constructors; this/chaining.
public class Task04_Constructors {
    static class ParkingTicket {
        private final int id; private final String regNo; private final long entryTime;
        ParkingTicket(){this(0,"UNKNOWN",System.currentTimeMillis());}
        ParkingTicket(int id,String regNo){this(id,regNo,System.currentTimeMillis());}
        ParkingTicket(int id,String regNo,long entryTime){if(id<0||regNo==null||regNo.isBlank())throw new IllegalArgumentException("Invalid ticket");this.id=id;this.regNo=regNo;this.entryTime=entryTime;}
        ParkingTicket(ParkingTicket other){this(other.id,other.regNo,other.entryTime);}
        public String toString(){return "Ticket "+id+" / "+regNo+" / "+entryTime;}
    }
    public static void main(String[] args){ParkingTicket a=new ParkingTicket(101,"TN01AB1234");ParkingTicket b=new ParkingTicket(a);System.out.println(a);System.out.println("Copied: "+b);}
}
