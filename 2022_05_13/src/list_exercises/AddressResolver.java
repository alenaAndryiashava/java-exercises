package list_exercises;

import java.util.ArrayList;
import java.util.List;

public class AddressResolver {

    public List<Address> getAddresses(List<Person> persons){
        List<Address> addressesList = new ArrayList<>();
        for (Person person:persons) {
            addressesList.add(person.getAddress());
        }
        return addressesList;
    }
}
