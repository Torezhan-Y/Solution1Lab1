package ItemManager;

public class ItemManager {
    public void pickUpItem(Player player, String item) {
        switch (item.toLowerCase()) {
            case "relic":
                player.addExperience(5);
                System.out.println("You have successfully found an ancient relic.! +40 points!");
                break;
            case "mana":
                player.heal(20);
                System.out.println("You've picked up a mana potion! +65 HP");
                break;
            case "sword":
                player.addExperience(15);
                System.out.println("You are the best! You have just found the Chaotic Sword God. +150 to strength");
                break;
            default:
                System.out.println("Unknown item: " + item);
                break;
        }
        player.addItem(item);
    }
}
