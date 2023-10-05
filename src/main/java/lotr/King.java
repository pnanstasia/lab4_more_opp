package lotr;
import kick.KingCry;
import java.util.Random;

public class King extends Character{

    public King(){
        super(new Random().nextInt(11) + 5, new Random().nextInt(11) + 5, new KingCry());
    }
}
