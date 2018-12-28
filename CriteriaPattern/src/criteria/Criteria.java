package criteria;

import java.util.List;
import model.Person;

/**
 *
 * @author elvis
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> person);
}