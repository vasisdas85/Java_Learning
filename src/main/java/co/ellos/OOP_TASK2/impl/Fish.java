package co.ellos.OOP_TASK2.impl;

import co.ellos.OOP_TASK2.Creature;
import co.ellos.OOP_TASK2.Natatorial;

public class Fish extends Creature implements Natatorial {
    public Fish(int a, String n, boolean ia) {
        super(a, n, ia);
    }

    public void swims() {
        };
    public void talks() {
        System.out.println("Max smokes weed");
    };
}
