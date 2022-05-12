package Employee_package;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeComparatorByAgeTest {

    @Test
    void testCompareByAge() {
        Employee employee1 = new Employee(3,"Ivanov",33,2000);
        Employee employee2 = new Employee(2,"Petrov",27,1500);
        Employee employee3 = new Employee(1,"Burton",45,2500);

        List<Employee> actual = Arrays.asList(employee1,employee2,employee3);
        List<Employee> expected = Arrays.asList(employee2,employee1,employee3);
        actual.sort(new EmployeeComparatorByAge());
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testCompareByNameOnEqualAge() {
        Employee employee1 = new Employee(3,"Ivanov",33,2000);
        Employee employee2 = new Employee(2,"Petrov",33,1500);
        Employee employee3 = new Employee(1,"Burton",45,2500);

        List<Employee> actual = Arrays.asList(employee3,employee2,employee1);
        List<Employee> expected = Arrays.asList(employee1,employee2,employee3);
        actual.sort(new EmployeeComparatorByAge());
        Assertions.assertEquals(expected, actual);
    }
}