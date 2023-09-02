package FightToDeath;

import java.util.Random;

public class Warrior {
    private String name = "Warrior";
    private int Health = 0;
    private int maxAttack = 0;
    private int maxBlock = 0;
    Random random = new Random();

    public Warrior(String name, int Health, int maxAttack, int maxBlock) {
        setHealth(Health);
        setMaxAttack(maxAttack);
        setMaxBlock(maxBlock);
        setName(name);
    }
    public int Attack(){
        return random.nextInt(getMaxAttack());
    }
    public int Block(){
        return random.nextInt(getMaxBlock());
    }
    public String getName() {
        return name;
    }
    public void setName(String Name){
        this.name = Name;
    }
    public int getHealth(){
        return Health;
    }
    public void setHealth(int health){
        this.Health =health;
    }

    public int getMaxAttack() {
        return maxAttack;
    }

    public int getMaxBlock() {
        return maxBlock;
    }

    public void setMaxAttack(int maxAttack) {
        this.maxAttack = maxAttack;
    }

    public void setMaxBlock(int maxBlock) {
        this.maxBlock = maxBlock;
    }
}
