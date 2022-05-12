package Employee_package;

import animals_package.Pet;
import animals_package.PetComparatorByWeight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee employee1 = new Employee(3,"Ivanov",27,2000);
    Employee employee2 = new Employee(2,"Petrov",33,1500);
    Employee employee3 = new Employee(1,"Burton",45,2500);

    @Test
    void testCompareById() {
        List<Employee> actual = Arrays.asList(employee1,employee2,employee3);
        List<Employee> expected = Arrays.asList(employee3,employee2,employee1);
        actual.sort(Employee::compareTo);
        Assertions.assertEquals(expected, actual);

    }
}