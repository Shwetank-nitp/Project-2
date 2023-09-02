package FightToDeath;


public class GodOFThunder extends Warrior {
    protected int chance;
    private int count = 0;
    Weapon weapon = new Weapon();
    public GodOFThunder(String name, int health, int attack, int block, int chance){
        super(name,health,attack,block);
        this.chance =chance;
    }
    @Override
    public int Attack(){
        int odds = random.nextInt(100);
        if (odds<chance/5 && count < 2){
            count++;
            System.out.println(getName()+" used his 10000 Volts thunder .....");
            return weapon.Thunder();
        }
        else if (odds<chance/2){
            System.out.println(getName()+" throws his Weapon .....");
            return weapon.Throw();
        }
        return super.Attack();
    }
    @Override
    public int Block(){
        int odds = random.nextInt(100);
        if (odds<chance) {
            System.out.println(getName()+" Hammer Absorbs The Damage .....");
            Battle.damage =Battle.damage-10;
            return super.Attack();
        }
        return super.Block();
    }
}
