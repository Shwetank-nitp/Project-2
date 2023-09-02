package FightToDeath;
public class Battle{
    public static void StartFight(Warrior war1, Warrior war2){

        while (true){
            if (getFightResult(war1,war2).equals("Game Over")){
                System.out.println("..... Game Over .....");
                break;
            }
            if (getFightResult(war2, war1).equals("Game Over")){
                System.out.println("..... Game Over .....");
                break;
            }
        }
    }
    static int damage = 0;
    private static String getFightResult(Warrior a, Warrior b){
        System.out.println(a.getName()+" Attack "+b.getName());
        int offence = a.Attack();
        int defence = b.Block();
        damage = (damage + offence - defence);
        if (damage > 0){
            b.setHealth(b.getHealth() - damage);
            System.out.println(b.getName()+" Receives damage : "+damage);
            damage = 0;
        }
        else damage =0;
        System.out.println("health of "+b.getName()+" is "+b.getHealth());
        System.out.println();

        if (b.getHealth()<=0) {
            System.out.println(b.getName() + " Died " + a.getName() + " is Victories !");
            return "Game Over";
        }
        return "Fight";
    }
}
