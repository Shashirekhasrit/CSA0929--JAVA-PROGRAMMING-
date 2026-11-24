package parking.model;
public abstract class Vehicle {
    private final String regNo;
    protected Vehicle(String regNo){if(regNo==null||regNo.isBlank())throw new IllegalArgumentException("Registration number required");this.regNo=regNo.trim().toUpperCase();}
    public final String getRegNo(){return regNo;}
    public abstract double hourlyRate();
    public double calculateFee(long minutes){if(minutes<0)throw new IllegalArgumentException("Negative duration");long hours=(minutes+59)/60;return hours*hourlyRate();}
    @Override public boolean equals(Object o){return o instanceof Vehicle v && regNo.equals(v.regNo);}
    @Override public int hashCode(){return regNo.hashCode();}
    @Override public String toString(){return getClass().getSimpleName()+"("+regNo+")";}
}
