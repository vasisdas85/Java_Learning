package co.ellos.OOP_TASK2;

public abstract class Creature {
    int age;
    String name;
    boolean isAlive;
    public String voice() {
        {
            return "";
        }
    }
    public Creature(int a, String n, boolean ia){
        age = a;
        name = n;
        isAlive = ia;
    };

}