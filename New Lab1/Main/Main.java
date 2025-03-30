package Main;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player("Player");
        CombatManager combatManager = new CombatManager();
        ItemManager itemManager = new ItemManager();

        while (true) {
            System.out.println("select an action:");
            System.out.println("1. Fight the wolf");
            System.out.println("2. Fight the vampire");
            System.out.println("3. rise up an item");
            System.out.println("4. Check ur Health");
            System.out.println("5. log out");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    combatManager.fight(player, new Wolf());
                    break;
                case 2:
                    combatManager.fight(player, new Vampire());
                    break;
                case 3:
                    System.out.print("select an item: ");
                    String item = scanner.nextLine();
                    itemManager.pickUpItem(player, item);
                    break;
                case 4:
                    System.out.println("Health: " + player.getHealth());
                    break;
                case 5:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Wrong choice!. try again =)");
            }

            if (!player.isAlive()) {
                System.out.println("You're dead:(.The game is over.");
                break;
            }
        }

        scanner.close();
    }
}