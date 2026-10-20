package guided.gd2;

public class Employee {
    private String nama;
    String department;
    
    public Employee(String nama){
        this.nama = nama;
    }
    
    public void tampilNama(){
        System.out.println("nama: " + nama);
    }
}
