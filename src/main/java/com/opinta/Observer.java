package com.opinta;

public interface Observer {
    void objectCreated(Object object);
    void objectModified(Object object);
}
