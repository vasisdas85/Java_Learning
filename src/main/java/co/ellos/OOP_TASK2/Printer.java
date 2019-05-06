package co.ellos.OOP_TASK2;

import co.ellos.OOP_TASK2.impl.TwoLeggedWalkers;

public class Printer {

    public void printAge(TwoLeggedWalkers[] dolboeby) {
        for (int i = 0; i < 10; i++) {
            System.out.println(dolboeby[i].age);
        }
    }
}