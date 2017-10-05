package com.opinta;

public class App {

    public static void main( String[] args ) {
        System.out.println("Observer Pattern Example!");

        Observer observer = new ObserverEmptyImpl() {
            @Override
            public void objectModified(Object object) {
                System.out.println("Subscriber got info");
            }
        };

        Subject subject = new Subject();
        subject.subscribe(observer);
        subject.setField("Some test");
    }
}
