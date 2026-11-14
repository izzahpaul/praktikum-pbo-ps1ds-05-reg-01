package guided.guided3;

import java.util.Comparator;

// Comparator eksternal: kriteria sorting tambahan tanpa mengubah kode kelas utama
public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getSalary(), e2.getSalary());
    }
}
