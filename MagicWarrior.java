package FightToDeath;

import java.util.Random;

public class MagicWarrior extends Warrior {
    int magicChance;
    useMagic magic = new useMagic();
    public MagicWarrior(String name, int Health, int maxAttack, int maxBlock,int magicChance) {
        super(name, Health, maxAttack, maxBlock);
        this.magicChance = magicChance;
    }
    @Override
    public int Block(){
        Random random1 = new Random();
        int odds = random1.nextInt(100);
        if (odds<magicChance/5){
            System.out.println(getName()+" Used "+magic.Regeneration());
            setHealth(100);
            return 10000;
        }
        else if (odds<magicChance){
            System.out.println(getName()+" used "+magic.Teleport());
            return 10000;
        }
        return super.Block();
    }
}
