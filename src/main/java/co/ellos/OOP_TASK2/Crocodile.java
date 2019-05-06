package co.ellos.OOP_TASK2;

public class Crocodile extends Creature implements Natatorial, Walkers {
    public Crocodile(int a, String n, boolean ia) {
        super(a, n, ia);
    }

    @Override
    public void walks() {
    }

    @Override
    public void swims() {
            }

    @Override
    public void talks() {
        System.out.println("Max smokes A LOT of weed");
    }

    @Override
    public void feeds(Creature creature) {
        if (creature.isAlive && !(creature instanceof Flyers)) {
            creature.isAlive = false;
            System.out.println("Om-nom-nom "+creature.name);
        }
    }
}
