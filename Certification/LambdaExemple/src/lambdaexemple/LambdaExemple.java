package lambdaexemple;

import animals.Animal;
import animals.CheckIfHopper;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author elvis
 */
public class LambdaExemple {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Fish", false, true));
        animals.add(new Animal("Kangaroo", true, false));
        animals.add(new Animal("Rabbit", true, false));
        animals.add(new Animal("Turtle", false, true));

        print(animals, new CheckIfHopper());
        
        //print(animals, a -> a.canHop());
        //print(animals, a -> a.canSwim());
        //print(animals, a -> ! a.canSwim());
    }

    private static void print(List<Animal> animals, CheckIfHopper checkIfHopper) {
        for (Animal animal : animals) {
            if (checkIfHopper.test(animal)) {
                System.out.println(animal + "");
            }
        }
    }
}
