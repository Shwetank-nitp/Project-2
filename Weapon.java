package FightToDeath;

import java.util.Random;

public class Weapon implements Hammer{
    Random  random =new Random();
    @Override
    public int Throw() {
        return random.nextInt(3);
    }

    @Override
    public int Thunder() {
        return 10;
    }

}
