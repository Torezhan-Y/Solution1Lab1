package Player;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health = 100;
    private int experience = 0;
    private List<String> inventory = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void addItem(String item) {
        inventory.add(item);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void heal(int amount) {
        health += amount;
    }

    public void addExperience(int exp) {
        experience += exp;
    }
    public int getHealth() {
        return health;
    }
}