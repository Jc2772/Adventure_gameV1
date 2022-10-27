package project;
import java.util.*;
public class Events {
    private double health = 10.0,weapon = 1;
    private final Random random = new Random();
    public void Events(){
        int eventType = random.nextInt(1,3);
        if(eventType == 1){
            Monsters();
        }
        else if (eventType == 2) {

        }
        else if(eventType == 3){

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
        else{
            MonsterName="Error";
            MonsHealth=0;
            MonDamage=0;
        }
        Boolean Fight = true;
        while(Fight)
        if(health <= 0){
            System.out.println();

            Project.game = false;
            return;
        }
        else if(MonsHealth <= 0){

            return;
        }
    }
}
