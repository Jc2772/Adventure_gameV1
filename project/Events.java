package project;
import java.util.*;
public class Events {
    private double health = 10;
    private double weapon = 1;
    private double MonDamage;
    private double MonsHealth;
    private String MonsterName;
    private final Random random = new Random();
    private final Scanner input = new Scanner(System.in);
    public void Events(){
        int eventType = random.nextInt(1,3);
        if(eventType == 1){
            MonsterEvent();
        }
        else if (eventType == 2) {
            GenericEvents();
        }
        else if(eventType == 3){
            LootEvents();
        }
    }
    private void MonsterEvent(){
        int Monster = random.nextInt(1,300);
        if(Monster >= 1 && Monster <= 100){
            MonsterName = "Goblin";
            MonsHealth = 2;
            MonDamage = 0.5;
        }
        else if (Monster >= 101 && Monster <= 175) {
            MonsterName = "Bandit";
            MonsHealth = 5;
            MonDamage = 2.5;
        }
        else if (Monster >= 176 && Monster <= 230) {
            MonsterName = "Bear";
            MonsHealth = 10;
            MonDamage = 7.5;
        }
        else if (Monster >= 231 && Monster <= 270) {
            MonsterName = "Wisp";
            MonsHealth = 2;
            MonDamage = 10;
        }
        else if (Monster >= 271 && Monster <= 299) {
            MonsterName = "Golem";
            MonsHealth = 50;
            MonDamage = 15;
        }
        else if(Monster == 300){
            MonsterName = "Lich";
            MonsHealth = 200;
            MonDamage = 20;
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
    private void GenericEvents(){
        int eventCode =random.nextInt(1,10);
        switch (eventCode){
            case 1:{
                System.out.println("as you walk around the forest, you see a deer");
                break;
            }
            case 2:{
                System.out.println("as you walk around the forest, you see two dwarves wrestling");
                break;
            }
            case 3:{
                System.out.println("as you walk around the forest, you see the bones of a fallen soldier from the days of old");
                break;
            }
            case 4:{
                System.out.println("as you walk around the forest, you see a spell circle, a lich is near");
                break;
            }
            case 5:{
                System.out.println("as you walk around the forest, you see an old campsite");
                break;
            }
            case 6:{
                System.out.println("as you walk around the forest, you see fairy rings");
                break;
            }
            case 7:{
                System.out.println("as you walk around the forest, you see an old decayed church");
                break;
            }
            case 8:{
                System.out.println("as you walk around the forest, you see a man that was recently dead, bandits are near");
                break;
            }
            case 9:{
                System.out.println("as you walk around the forest, you hear the birds chirping");
                break;
            }
            case 10:{
                System.out.println("as you walk around the forest, you see a dragon flying high in the sky, \"thank goodness Im hidden in the trees\" you said");
                break;
            }
        }
    }
    private void LootEvents(){
        int lootchance = random.nextInt(1,10);
        if(lootchance == 1 && weapon < 5){
            weapon = 5;

        }
        else if(lootchance == 2 && weapon < 10){
            weapon = 10;

        }
        else if(lootchance == 3 && weapon < 15){
            weapon = 15;

        }
        else if(lootchance == 4 && weapon < 20){
            weapon = 20;

        }
        else if(lootchance == 5 && weapon < 25){
            weapon = 25;

        }
        else if(lootchance == 6 && health < 50){
            health = 50;

        }
        else if(lootchance == 7 && health < 100){
            health = 100;

        }
        else if(lootchance == 8 && health < 150){
            health = 150;

        }
        else if(lootchance == 9 && health < 200){
            health = 200;

        }
        else if(lootchance == 10 && health < 250){
            health = 250;

        }
    }
}
