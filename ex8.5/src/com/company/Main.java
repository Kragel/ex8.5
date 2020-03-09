
package com.company;

public class Main {

    public static void ride(Cycle c) {
        c.travel(c);
        System.out.println("wheels: " + c.wheels());
    }

    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(u); // upcast to Cycle
        ride(b);
        ride(t);
    }
}
