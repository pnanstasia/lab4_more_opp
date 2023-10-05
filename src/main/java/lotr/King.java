package lotr;
import kick.KingCry;
import java.util.Random;

public class King extends Character{

    public King(){
        super(new Random().nextInt(5, 15), new Random().nextInt(5, 15), new KingCry());
    }
}
