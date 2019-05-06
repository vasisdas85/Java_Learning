package co.ellos.OOP_TASK2;

public class TwoLeggedWalkers extends Creature implements Walkers {
    public TwoLeggedWalkers(int a, String n, boolean ia) {
        super(a, n, ia);
    }

    @Override
    public void walks() {

    }

    @Override
    public void feeds(Creature creature) {

    }

    @Override
    public void talks() {
        System.out.println("I, ZEbil");
    }
}
