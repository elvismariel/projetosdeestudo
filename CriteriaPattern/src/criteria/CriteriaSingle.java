package criteria;

import java.util.ArrayList;
import java.util.List;
import model.Person;

/**
 *
 * @author elvis
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();

        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }

        return singlePersons;
    }
}
