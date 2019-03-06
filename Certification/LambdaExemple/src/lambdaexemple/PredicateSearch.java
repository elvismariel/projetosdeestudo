package lambdaexemple;

import animals.Animal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author elvis
 */
public class PredicateSearch {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("Dog", true, true));

        print(animals, a -> a.canHop());

        removeBunnies();
    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) {
                System.out.println(animal + " ");
            }
        }
        System.out.println("");
    }

    private static void removeBunnies() {
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        bunnies.add("short ear");

        bunnies.removeIf(s -> s.charAt(0) != 'h');

        System.out.println(bunnies);
    }
}
