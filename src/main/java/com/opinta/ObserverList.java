package com.opinta;

import java.util.ArrayList;
import java.util.Iterator;

public class ObserverList<T extends Observer> extends ArrayList<T> {

    public void notifyObjectCreated(Object object) {
        for (Iterator<T> iterator = iterator(); iterator.hasNext(); ) {
            iterator.next().objectCreated(object);
        }
    }

    public void notifyObjectModified(Object object) {
        for (Iterator<T> iterator = iterator(); iterator.hasNext(); ) {
            iterator.next().objectModified(object);
        }
    }
}
