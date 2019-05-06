package co.ellos.OOP_TASK2.impl;

import co.ellos.OOP_TASK2.Creature;
import co.ellos.OOP_TASK2.Natatorial;
import co.ellos.OOP_TASK2.Walkers;

public class Boar extends Creature implements Walkers {


    public Boar(int a, String n, boolean ia) {
        super(a, n, ia);
    }

    public void walks() {
        int numberOfLegs = 4;
    }

    public void talks() {
        System.out.println("TRACTOR");
    }

    public void feeds(Creature creature) {
        if ((creature instanceof Natatorial) && creature.isAlive) {
            System.out.println("Om-nom-nom " + creature.name);
            creature.isAlive = false;
        }
    }
}
