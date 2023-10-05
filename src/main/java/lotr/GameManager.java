package lotr;

public class GameManager {
    
    public static void fight(Character c1, Character c2){
        int round = 1;
        Character fighter = c1;
        Character victim = c2;
        while (c1.isAlive() && c2.isAlive()){
            System.out.println("Round "+round);
            System.out.println("---------------");
            if (fighter.getClass() == victim.getClass()){
                System.out.println("You can't kick your relative!!!");
                break;
            }
            System.out.println(fighter.getClass().getSimpleName() + " kick " + victim.getClass().getSimpleName());
            fighter.kick(victim);
            System.out.println("Current situation\n" + victim.getClass().getSimpleName() + ": hp - " + victim.getHp());
            if (fighter.equals(c1)){ fighter = c2; }
            else{ fighter = c1;}
            if (victim.equals(c1)){ victim = c2; }
            else{ victim = c1;}
            round += 1;
        }
        if (c1.isAlive()){
            System.out.println(c1.getClass().getSimpleName() + " won");
        }
        else{ System.out.println(c2.getClass().getSimpleName() + " won"); }
    }
}

