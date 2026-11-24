// Task 7: overriding and Object methods based on registration number.
public class Task07_Overriding {
    static class Vehicle { private final String regNo; Vehicle(String r){if(r==null||r.isBlank())throw new IllegalArgumentException("Registration required");regNo=r;}
        double calculateFee(int hours){return hours*10.0;} public String getRegNo(){return regNo;}
        @Override public String toString(){return getClass().getSimpleName()+"["+regNo+"]";}
        @Override public boolean equals(Object o){return o instanceof Vehicle v && regNo.equalsIgnoreCase(v.regNo);}
        @Override public int hashCode(){return regNo.toUpperCase().hashCode();} }
    static class Car extends Vehicle {Car(String r){super(r);}@Override double calculateFee(int h){return h*30.0;} }
    public static void main(String[] args){Vehicle a=new Car("TN02B2"),b=new Car("TN02B2");System.out.println(a+" fee Rs "+a.calculateFee(2));System.out.println("Equal: "+a.equals(b)+", same hash: "+(a.hashCode()==b.hashCode()));}
}
