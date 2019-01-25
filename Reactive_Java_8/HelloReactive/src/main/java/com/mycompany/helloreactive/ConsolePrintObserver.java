package com.mycompany.helloreactive;

import io.reactivex.observers.DefaultObserver;

/**
 *
 * @author elvis
 */
public class ConsolePrintObserver extends DefaultObserver {

    @Override
    public void onNext(Object t) {
        System.out.print("[" + t + "] - ");
    }

    @Override
    public void onError(Throwable thrwbl) {
        System.out.println("Erro: " + thrwbl.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println("Observable Complete");
        System.out.println("");
    }
}
