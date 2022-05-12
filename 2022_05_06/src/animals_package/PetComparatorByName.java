package animals_package;

import java.util.Comparator;

public class PetComparatorByName implements Comparator<Pet> {

    @Override
    public int compare(Pet pet1, Pet pet2) {
        return pet1.getName().compareTo(pet2.getName());
    }


}
