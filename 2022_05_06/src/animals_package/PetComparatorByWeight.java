package animals_package;

import java.util.Comparator;

public class PetComparatorByWeight implements Comparator<Pet> {

    @Override
    public int compare(Pet pet1, Pet pet2) {
        return pet1.getWeight()-pet2.getWeight();
    }
}
