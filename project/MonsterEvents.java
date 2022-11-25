package project;
import javax.swing.*;
import java.awt.event.WindowEvent;

import static project.Project.frame;
import static project.Project.random;
public class MonsterEvents {
    /*this class is used to set the monster and allows you to deal with it*/
    public void monsterevents(Player player){
        double health = player.getHealth(),
        weapon = player.getWeapon();
        int Monster = random.nextInt(1,300);
        Monster monster = new Monster();
        if(Monster >= 1 && Monster <= 100){
            monster.setNum(0);
        }
        else if (Monster >= 101 && Monster <= 175) {
            monster.setNum(1);
        }
        else if (Monster >= 176 && Monster <= 230) {
            monster.setNum(2);
        }
        else if (Monster >= 231 && Monster <= 270) {
            monster.setNum(3);
        }
        else if (Monster >= 271 && Monster <= 299) {
            monster.setNum(4);
        }
        else if(Monster == 300){
            monster.setNum(5);
        }
        String monsterName = monster.getMonsterName();
        double monsHealth = monster.getMonsterHealth();
        double monDamage = monster.getMonsterDamage();
        JOptionPane.showMessageDialog(null,steps.getText() + "\nYou have encountered a " + monsterName + ",You could try to run away from it and get lost in the woods or choose to risk your life");
        String battle_text = "";
        while(true) {

            if (monsHealth <= 0) {
                JOptionPane.showMessageDialog(null,"You have defeated a " + monsterName + "You have Won");
                int monKills = player.getMonKills();
                monKills++;
                player.setMonKills(monKills);
                return;
            }
            else if (health <= 0) {
                JOptionPane.showMessageDialog(null,"The " + monsterName + " has defeated you, You are Dead ");
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
                return;
            }
            else{
                String action = JOptionPane.showInputDialog(String.format("%90S\n%90s\n%90s\n\n\n",
                        "Player health: " + health, "Monster health: " + monsHealth,"Player damage: " + weapon) + battle_text + "\nWhat do you do");
                if(action.contains("attack") || action.contains("stab") || action.contains("hurt") || action.contains("swing") || action.contains("strike") || action.contains("hit") || action.contains("kick") || action.contains("punch") || action.contains("fight")){
                    battle_text = "You hit the monster with your weapon" + "\n\nThe " + monsterName + " launches his attack on you\n\n";
                    monsHealth -= weapon;

                    health -= monDamage;
                }
                else if(action.contains("flee") || action.contains("run") || action.contains("sprint") || action.contains("retreat") || action.contains("walk") || action.contains("move") || action.contains("travel") || action.contains("wander") || action.contains("head") || action.contains("go")){
                    int chance = random.nextInt(1,10);
                    if(chance <= 2){
                        battle_text = "You failed to escape, The " + monsterName + " launches his attack on you";
                        health -= monDamage;
                    }
                    else {
                        steps.RandomDirection(Project.getNorth(),Project.getSouth(),Project.getEast(),Project.getWest(),player);
                        JOptionPane.showMessageDialog(null,"You have escaped the " + monsterName);
                        return;
                    }
                }
                else{
                    battle_text = "You do nothing as The " + monsterName + " launches his attack on you";
                    health -= monDamage;
                }
            }
        }
    }
}
