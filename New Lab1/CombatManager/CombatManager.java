package CombatManager;

public class CombatManager {
    public void fight(Player player, enemy enemy) {
        System.out.println("Fighting " + enemy.getName());

        while (player.isAlive() && enemy.getHealth()> 0) {
            System.out.println(" Player attacks " + enemy.getName());
            enemy.takeDamage(25);
            if(enemy.getHealth()<=0){
                System.out.println(enemy.getName()+ " has been defeated!");
                player.addExperience(10);
                return;
            }

            System.out.println(enemy.getName() + " deals " + enemy.getDamage() + " damage!");
            player.takeDamage(enemy.getDamage());


            if (!player.isAlive()) {
                System.out.println("Player has been defeated!");
            }
        }
    }
}