package animals_package;

import java.util.Comparator;

public class PatComparatorByLastLetter implements Comparator<Pet> {


    @Override
    public int compare(Pet pet1, Pet pet2) {
        char last1 = pet1.getName().charAt(pet1.getName().length()-1);
        char last2 = pet2.getName().charAt(pet2.getName().length()-1);

        return Character.compare(last1, last2);
    }
}