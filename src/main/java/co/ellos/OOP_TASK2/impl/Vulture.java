package co.ellos.OOP_TASK2.impl;

import co.ellos.OOP_TASK2.Creature;
import co.ellos.OOP_TASK2.Flyers;

public class Vulture extends Creature implements Flyers {
    public Vulture(int a, String n, boolean ia) {
        super(a, n, ia);
    }

    @Override
    public void flies() {

    }

    public void feeds(Creature creature) {
        if (creature.isAlive = false) {
            System.out.println(
                    "Om-nom-nom, " + creature.name);
        }
    }

    @Override
    public String voice() {
        return "Brace yourself, winter is coming";
    }
}

