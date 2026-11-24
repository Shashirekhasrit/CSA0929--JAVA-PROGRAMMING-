// Task 6: hierarchical inheritance and constructor order.
public class Task06_Inheritance {
    static class Vehicle { String regNo; Vehicle(String regNo){this.regNo=regNo;System.out.println("Vehicle constructor");} }
    static class Car extends Vehicle { Car(String regNo){super(regNo);System.out.println("Car constructor");} }
    static class ElectricCar extends Car { ElectricCar(String regNo){super(regNo);System.out.println("ElectricCar constructor");} }
    static class TwoWheeler extends Vehicle { TwoWheeler(String regNo){super(regNo);System.out.println("TwoWheeler constructor");} }
    public static void main(String[] args){new ElectricCar("TN03EV1234");System.out.println("UML: Vehicle <|-- Car <|-- ElectricCar; Vehicle <|-- TwoWheeler");}
}
