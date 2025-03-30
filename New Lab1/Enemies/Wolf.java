package Enemies;

public class Wolf implements Enemy {
    private int health = 50;

    @Override
    public String getName() {
        return "Wolf";
    }

    @Override
    public int getDamage() {
        return 18;
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