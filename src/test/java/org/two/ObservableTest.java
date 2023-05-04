package org.two;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ObservableTest {

    @Test
    void testObserver(){
        Observable observable = new Observable();
        Observable observable2 = new Observable();
        ObserverListener observer = new ObserverListener();

        observable.addPropertyChangeListener(observer);
        observable2.addPropertyChangeListener(observer);
        observable.setStatus("going for a walk");
        observable2.setStatus("eating my lunch");

        Assertions.assertEquals("going for a walk", observer.printStatuses().get(0));
        Assertions.assertEquals("eating my lunch", observer.printStatuses().get(1));
    }

}