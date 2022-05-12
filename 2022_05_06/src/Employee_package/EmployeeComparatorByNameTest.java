package Employee_package;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeComparatorByNameTest {
    Employee employee1 = new Employee(3,"Ivanov",33,2000);
    Employee employee2 = new Employee(2,"Petrov",27,1500);
    Employee employee3 = new Employee(1,"Burton",45,2500);

    @Test
    void testCompareByName() {
        List<Employee> actual = Arrays.asList(employee1,employee2,employee3);
        List<Employee> expected = Arrays.asList(employee3,employee1,employee2);
        actual.sort(new EmployeeComparatorByName());
        Assertions.assertEquals(expected, actual);
    }
}