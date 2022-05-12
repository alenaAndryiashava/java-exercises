package animals_package;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PetComparatorByLastLetterTest {

    @Test
    void testCompareByLastLetter() {
        Pet pet1 = new Pet("Cat", 12,"black","Peter");
        Pet pet2 = new Pet("Dog",15,"white","Ivan");
        Pet pet3 = new Pet("Rabbit",10,"red", "Oleg");

        List<Pet> actual = Arrays.asList(pet1,pet2,pet3);
        List<Pet> expected = Arrays.asList(pet3,pet1,pet2);
        actual.sort(new PetComparatorByWeight());
        Assertions.assertEquals(expected, actual);
    }
}