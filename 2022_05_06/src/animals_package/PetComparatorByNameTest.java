package animals_package;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PetComparatorByNameTest {

    @Test
    void testCompareByName() {
        Pet pet1 = new Pet("Rabbit", 12, "black", "Peter");
        Pet pet2 = new Pet("Dog", 15, "white", "Ivan");
        Pet pet3 = new Pet("Cat", 10, "red", "Oleg");

        List<Pet> actual = Arrays.asList(pet1, pet2, pet3);
        List<Pet> expected = Arrays.asList(pet3, pet2, pet1);
        actual.sort(new PetComparatorByName());
        Assertions.assertEquals(expected, actual);
    }
}