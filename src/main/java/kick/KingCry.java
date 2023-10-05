package kick;
import java.util.Random;

import lotr.Character;

public class KingCry implements KickStrategy {
    
    @Override
    public void kick(Character whoKick, Character whoIsKicked){
        if(whoIsKicked.getPower() != 0){
            whoIsKicked.setHp(whoIsKicked.getHp() - new Random().nextInt(whoIsKicked.getPower()));
        }
        else{
            whoIsKicked.setHp(0);
        }
        System.out.println(whoIsKicked.getClass().getSimpleName() + " was kicked, his hp - " + whoIsKicked.getHp());
    }
}
