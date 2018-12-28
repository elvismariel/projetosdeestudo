package criteriapattern;

import criteria.AndCriteria;
import criteria.Criteria;
import criteria.CriteriaFemale;
import criteria.CriteriaMale;
import criteria.CriteriaSingle;
import criteria.OrCriteria;
import java.util.ArrayList;
import java.util.List;
import model.Person;

/**
 *
 * @author elvis
 */
public class CriteriaPattern {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males:");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales:");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males:");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    private static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person: [Name:" + person.getName() + ", Gender: " + person.getGender() + ", Marital Status: " + person.getMaritalStatus() + "]");
        }
    }
}
