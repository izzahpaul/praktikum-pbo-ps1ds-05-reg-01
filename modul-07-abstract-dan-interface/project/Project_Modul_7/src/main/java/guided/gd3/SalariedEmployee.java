package guided.gd3;

public class SalariedEmployee extends Employee{
    private double weeklySalary;
    
    public SalariedEmployee(String nama, double weeklySalary){
        super(nama);
        this.weeklySalary = weeklySalary;
    }
    
    @Override
    public double earnings(){
        return weeklySalary;
    }
}
