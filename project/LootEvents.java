package project;

import javax.swing.*;
import static project.Project.random;

public class LootEvents {

    private final Player player = new Player();
    private final double health = player.getHealth();
    private final double weapon = player.getWeapon();
    public void lootevents(){
        int lootchance = random.nextInt(1,10);
        if(lootchance == 1 && weapon < 5){
            JOptionPane.showMessageDialog(null,steps.getText() + "\nYou found a rusty short sword, you pick it up");
            player.setWeapon(5);
        }
        else if(lootchance == 2 && weapon < 10){
            JOptionPane.showMessageDialog(null,steps.getText() + "\nYou found a spear, you pick it up");
            player.setWeapon(5);
        }
        else if(lootchance == 3 && weapon < 15){
            JOptionPane.showMessageDialog(null,steps.getText() + "\nYou found a fine short sword, you pick it up");
            player.setWeapon(5);
        }
        else if(lootchance == 4 && weapon < 20){
            JOptionPane.showMessageDialog(null,steps.getText() + "\nYou found a fine long sword, you pick it up");
            player.setWeapon(5);
        }
        else if(lootchance == 5 && weapon < 25){
            JOptionPane.showMessageDialog(null,steps.getText() + "\nYou found an enchanted long sword longsword stuck on a rock, you pull it out of the rock");
            player.setWeapon(5);
        }
        else if(lootchance == 6 && health < 50){
            JOptionPane.showMessageDialog(null,steps.getText() + "\nYou found Rusty Armor of a fallen soldier, you take it");
            player.setHealth(50);
        }
        else if(lootchance == 7 && health < 100){
            JOptionPane.showMessageDialog(null,steps.getText() + "\nYou found Armor of a fallen soldier, you take it");
            player.setHealth(100);
        }
        else if(lootchance == 8 && health < 150){
            JOptionPane.showMessageDialog(null,steps.getText() + "\nyou found some well made steel armor, you take it");
            player.setHealth(150);
        }
        else if(lootchance == 9 && health < 200){
            JOptionPane.showMessageDialog(null,steps.getText() + "\nyou found some damaged spell armor, you take it");
            player.setHealth(200);
        }
        else if(lootchance == 10 && health < 250){
            JOptionPane.showMessageDialog(null,steps.getText() + "\nyou found some well made spell armor, you take it");
            player.setHealth(250);
        }
    }
}
