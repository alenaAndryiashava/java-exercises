package Employee_package;

import java.util.Comparator;

public class EmployeeComparatorByAge implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        if (employee1.getAge() == employee2.getAge()){
            return employee1.getName().compareTo(employee2.getName());
        }else {
            return Integer.compare(employee1.getAge(), employee2.getAge());
        }
    }
}
