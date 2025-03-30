package Enemies;

public interface Enemy {
    String getName();
    int getDamage();
    int getHealth();
    void takeDamage(int damage);
}