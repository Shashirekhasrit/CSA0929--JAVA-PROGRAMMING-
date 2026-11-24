// Task 2: Types, jagged array representation and safe hour rounding.
public class Task02_DataRepresentation {
    public static void main(String[] args) {
        int[] slotsPerFloor={2,3,1};
        String[][] slots=new String[slotsPerFloor.length][];
        for(int f=0;f<slotsPerFloor.length;f++) slots[f]=new String[slotsPerFloor[f]];
        int minutes=61;
        int billableHours=(minutes+59)/60; // ceiling using integer arithmetic
        double hourlyRate=30.0;
        double fee=billableHours*hourlyRate;
        System.out.println("Floors: "+slots.length+", slots on floor 1: "+slots[0].length);
        System.out.println("61 minutes -> "+billableHours+" billable hours -> Rs "+fee);
        System.out.println("Wrong integer division: 61 / 60 = "+(61/60));
    }
}
