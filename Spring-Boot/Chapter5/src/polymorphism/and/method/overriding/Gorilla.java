package polymorphism.and.method.overriding;

public class Gorilla extends Animal {
	protected String getName() {	// Does Not Compile because it is less accessible than the version it is overriding
		return "Gorrilla";
	}
}
