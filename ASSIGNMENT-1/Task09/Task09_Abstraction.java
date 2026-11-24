// Task 9: abstract class represents shared state; interface represents optional capability.
public class Task09_Abstraction {
    interface Chargeable { double chargingFee(int kWh); default String chargingStatus(){return "Charging available";} }
    abstract static class Vehicle { private final String regNo; Vehicle(String r){regNo=r;} final String getRegNo(){return regNo;} abstract double fee(int hours); }
    static class ElectricCar extends Vehicle implements Chargeable { ElectricCar(String r){super(r);} @Override double fee(int h){return h*30.0;} @Override public double chargingFee(int kWh){return kWh*12.0;} }
    public static void main(String[] args){ElectricCar e=new ElectricCar("TN03EV1234");System.out.println(e.getRegNo()+" fee Rs "+e.fee(2));System.out.println(e.chargingStatus()+", charge Rs "+e.chargingFee(5));}
}
