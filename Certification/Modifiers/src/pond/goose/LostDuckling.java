package pond.goose;

import pondduck.DuckTeacher;

/**
 *
 * @author elvis
 */
public class LostDuckling {

    public void swim() {
        DuckTeacher teacher = new DuckTeacher();
        teacher.swim();

        System.out.println("Thanks " + teacher.name);
    }
}
