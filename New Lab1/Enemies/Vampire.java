package Enemies;

public class Vampire implements Enemy {
    private int health = 80;

    @Override
    public String getName() {
        return "Vampire";
    }

    @Override
    public int getDamage() {
        return 25;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }
}
