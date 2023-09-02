package FightToDeath;
public class Main {
    public static void main(String[] args) {
        Warrior thor = new GodOFThunder
                ("Thor", 100, 100, 100, 30);
        Warrior Loki = new MagicWarrior
                ("Loki", 100, 90, 60, 70);
        Battle.StartFight(Loki, thor);
    }
}
