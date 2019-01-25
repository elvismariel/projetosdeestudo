package com.mycompany.helloreactive;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 *
 * @author elvis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hello("Elvis", "Elisa", "Tiago");
    }

    public static void hello(String... args) {
        Flowable.fromArray(args).subscribe(s -> System.out.println("Hello " + s + "!"));

        // From Array
        String[] stringArray = new String[]{"Hi", "Hola", "Bonjour"};
        Observable<String> observable = Observable.fromArray(stringArray);

        // From List
        List<Integer> integerList = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        Observable<Integer> integerObservable = Observable.fromIterable(integerList);

        // From just one String
        Observable<String> singleValueObservable = Observable.just("Just One String");

        // From timeUnit
        Observable interval = Observable.interval(100, TimeUnit.MILLISECONDS);

        // Custom Observable
        Observable.create(emitter -> {
            try {
                // Emit values 0 to 10
                IntStream.range(0, 10).boxed().forEach(integer -> System.out.print("integer = " + integer));
            } catch (Exception e) {
                emitter.onError(e);
            }
        });

        // Consuming observables
        integerObservable.subscribe(intVal -> System.out.print(intVal + " "));
        System.out.println("");
        System.out.println("Using static method reference");
        integerObservable.subscribe(Main::printObservable);
        
        // Filter out value that isn't greater than 4
        System.out.println("After filter");
        integerObservable.filter(integer -> integer > 4).subscribe(Main::printObservable);
        
        // Map each value to the square of that value
        System.out.println("After Mapping to Square");
        integerObservable
                .map(integer -> Math.multiplyExact(integer, integer))
                .subscribe(Main::printObservable);
        
        
        // Subscribe using ConsolePrintObserver
        System.out.println("Using ConsolePrintObserver");
        integerObservable.subscribe(new ConsolePrintObserver());
        
        // Using new Thread scheduler
        System.out.println("Using new thread scheduler");
        integerObservable
                .unsubscribeOn(Schedulers.newThread())
                .subscribe(new ConsolePrintObserver());
        
        // Use it all in one statement
        System.out.println("All together now");
        integerObservable
                .filter(v -> v > 4)
                .map(integer -> Math.multiplyExact(integer, integer))
                .unsubscribeOn(Schedulers.newThread())
                .subscribe(new ConsolePrintObserver());
    }

    private static <T> void printObservable(T val) {
        System.out.print(val + " - ");
    }
}
