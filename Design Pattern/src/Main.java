interface Combatant {
    void takeDamage(int amount);
}

class Player implements Combatant {
    private String name;
    private int health = 100;
    private int experience = 0;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void takeDamage(int amount) {
        health -= amount;
        System.out.println(name + " took " + amount + " damage, health is now " + health);
    }

    public void gainXP(int xp) {
        experience += xp;
        System.out.println(name + " gained " + xp + " XP.");
    }
}

class Enemy implements Combatant {
    private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public void takeDamage(int amount) {
        health -= amount;
        System.out.println(name + " took " + amount + " damage, health is now " + health);
    }
}

class Game {
    public static void main(String[] args) {
        Player player = new Player("Hero");
        Enemy enemy = new Enemy("Goblin", 30);

        enemy.takeDamage(10);
        player.gainXP(50);
    }
}