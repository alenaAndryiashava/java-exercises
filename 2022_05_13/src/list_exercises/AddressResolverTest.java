package list_exercises;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddressResolverTest {
    Address address1 = new Address("Tristanstrasse",18);
    Address address2 = new Address("Isoldenstrasse",11);
    Person person1 = new Person("Ivanov", address1);
    Person person2 = new Person("Petrov", address2);

    @Test
    void testGetAddresses() {
        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        AddressResolver actual = new AddressResolver();
        List<Address> expected = Arrays.asList(address1,address2);
        assertEquals(expected, actual.getAddresses(persons));

    }
}