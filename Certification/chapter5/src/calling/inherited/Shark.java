package calling.inherited;

/**
 *
 * @author elvis
 */
public class Shark extends Fish {

    private int numberOfFins = 8;

    public Shark(int age) {
        super(age);
        this.size = 4;
    }

    public void displaySharkDetails1() {
        System.out.print("Shark with age: " + getAge());
        System.out.print(" and " + size + " meters long");
        System.out.println(" with " + numberOfFins + " fins");
    }

    public void displaySharkDetails2() {
        System.out.print("Shark with age: " + this.getAge());
        System.out.print(" and " + this.size + " meters long");
        System.out.print(" with " + this.numberOfFins + " fins");
    }

    public void displaySharkDetails3() {
        System.out.print("Shark with age: " + super.getAge());
        System.out.print(" and " + super.size + " meters long");
        System.out.print(" with " + this.numberOfFins + " fins");
    }

    public void displaySharkDetails() {
        System.out.print("Shark with age: " + super.getAge());
        System.out.print(" and " + super.size + " meters long");
        System.out.print(" with " + super.numberOfFins + " fins"); // DOES NOT COMPILE
    }
}
