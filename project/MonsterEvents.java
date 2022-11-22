package project;
import javax.swing.*;
import static project.Project.random;
public class MonsterEvents {
    private final Player player = new Player();
    private double health = player.getHealth();
    private final double weapon = player.getWeapon();
    public void monsterevents(){
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
        JOptionPane.showMessageDialog(null,"You have encountered a " + monsterName + ",You could try to run away from it and get lost in the woods or choose to risk your life");
        double regen = health;
        while(true) {
            String action =JOptionPane.showInputDialog("What do you do");

            if (health <= 0) {
                JOptionPane.showMessageDialog(null,"The " + monsterName + " has defeated you, You are Dead ");
                System.exit(0);
                return;
            }
            else if (monsHealth <= 0) {
                JOptionPane.showMessageDialog(null,"You have defeated a " + monsterName + "You have Won");
                health = regen;
                player.setMonKills();
                return;
            }
            else{
                if(action.contains("attack") || action.contains("stab") || action.contains("hurt") || action.contains("swing") || action.contains("strike") || action.contains("hit") || action.contains("kick") || action.contains("punch")){
                    JOptionPane.showMessageDialog(null,"You hit the monster with your weapon");
                    monsHealth -= weapon;
                    JOptionPane.showMessageDialog(null,"The " + monsterName + " launches his attack on you");
                    health -= monDamage;
                }
                else if(action.contains("flee") || action.contains("run") || action.contains("sprint") || action.contains("retreat")){
                    int chance = random.nextInt(1,10);
                    if(chance == 1){
                        JOptionPane.showMessageDialog(null,"You failed to escape, The " + monsterName + " launches his attack on you");
                        health -= monDamage;
                    }
                    else {
                        steps.RandomDirection(Project.getNorth(),Project.getSouth(),Project.getEast(),Project.getWest());
                        JOptionPane.showMessageDialog(null,"You have escaped the " + monsterName);
                        return;
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"You do nothing as The " + monsterName + " launches his attack on you");
                    health -= monDamage;
                }
            }
        }
    }
}
