package co.ellos.OOP_TASK2;

public class CrocodilePorohobot extends Crocodile{
    public CrocodilePorohobot(int a, String n, boolean ia) {
        super(a, n, ia);
    }

    @Override
    public void feeds(Creature creature) {
        if ((creature instanceof TwoLeggedWalkers)&&creature.isAlive) {
            creature.isAlive = false;
            System.out.println("Om-nom-nom "+creature.name);
        }
    }
}
