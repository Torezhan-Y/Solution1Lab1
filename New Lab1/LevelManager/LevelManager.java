package LevelManager;

import java.util.List;
import java.util.ArrayList;

public class LevelManager {
    private int level = 1;
    private List<String> enemies = new ArrayList<>();
    private List<String> items = new ArrayList<>();

    public void advanceLevel(Player player) {
        level++;
        player.equals(100);
    }
}
