package project;
import java.util.*;
public class Events {
    private double health = 10.0,weapon = 1;
    private final Random random = new Random();
    private final Scanner input = new Scanner(System.in);
    public void Events(){
        int eventType = random.nextInt(1,4);
        if(eventType == 1){
            Monsters();
        }
        else if (eventType == 2) {

        }
        else if(eventType == 3){

        }
        else if(eventType == 4){

        }
        return;
    }
    private void Monsters(){
        String MonsterName ;
        double MonDamage,MonsHealth;
        int Monster = random.nextInt(1,300);
        if(Monster >= 1 || Monster <= 100){
            MonsterName = "Goblin";
            MonsHealth = 2;
            MonDamage = 0.5;
        }
        else if (Monster >= 101 || Monster <= 175) {
            MonsterName = "Bandit";
            MonsHealth = 5;
            MonDamage = 2.5;
        }
        else if (Monster >= 176 || Monster <= 230) {
            MonsterName = "Bear";
            MonsHealth = 10;
            MonDamage = 7.5;
        }
        else if (Monster >= 231 || Monster <= 270) {
            MonsterName = "Wisp";
            MonsHealth = 2;
            MonDamage = 10;
        }
        else if (Monster >= 271 || Monster <= 299) {
            MonsterName = "Golem";
            MonsHealth = 50;
            MonDamage = 15;
        }
        else if(Monster == 300){
            MonsterName = "Lich";
            MonsHealth = 200;
            MonDamage = 20;
        }
        else {
            MonsterName = "Error";
            MonsHealth = 0;
            MonDamage = 0;
        }
        System.out.println("You have encountered a " + MonsterName + ",You could try to run away from it and get lost in the woods or choose to risk your life");
        double regen = health;
        while(true) {
            System.out.println("What do you do");
            String action = input.nextLine();
            if(action.contains("attack") || action.contains("stab") || action.contains("hurt") || action.contains("swing")){
                MonsHealth -= weapon;
                System.out.println("The " + MonsterName + " launches his attack on you");
                health -= MonDamage;
            }
            else if(action.contains("flee") || action.contains("run") || action.contains("sprint") || action.contains("retreat")){
                int chance = random.nextInt(1,10);
                if(chance == 1){
                    System.out.println("You failed to escape, The " + MonsterName + " launches his attack on you");
                    health -= MonDamage;
                }
                else {
                    steps.RandomDirection(Project.north, Project.south, Project.east, Project.west);
                    System.out.println("You have escaped the " + MonsterName);
                    return;
                }
            }
            if (health <= 0) {
                Project.endtext += "The " + MonsterName + " has defeated you, You are Dead ";
                Project.game = false;
                return;
            } else if (MonsHealth <= 0) {
                Project.endtext += "You have defeated a " + MonsterName + "You have Won";
                health = regen;
                return;
            }
        }
    }
}
