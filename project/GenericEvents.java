package project;

import javax.swing.*;
import static project.Project.random;
public class GenericEvents {
    /**
     * generates random events that add flavor to the game
     */
    public void genericevents(){
        int eventCode = random.nextInt(1,10);
        switch (eventCode){
            case 1:{
                JOptionPane.showMessageDialog(null,steps.getText() + "\nas you are in the forest, you see a deer");
                break;
            }
            case 2:{
                JOptionPane.showMessageDialog(null,steps.getText() + "\nas you are in the forest, you see two dwarves wrestling");
                break;
            }
            case 3:{
                JOptionPane.showMessageDialog(null,steps.getText() + "\nas you are in the forest, you see the bones of a fallen soldier from the days of old");
                break;
            }
            case 4:{
                JOptionPane.showMessageDialog(null,steps.getText() + "\nas you are in the forest, you see a spell circle, a lich is near");
                break;
            }
            case 5:{
                JOptionPane.showMessageDialog(null,steps.getText() + "\nas you are in the forest, you see an old campsite");
                break;
            }
            case 6:{
                JOptionPane.showMessageDialog(null,steps.getText() + "\nas you are in the forest, you see fairy rings");
                break;
            }
            case 7:{
                JOptionPane.showMessageDialog(null,steps.getText() + "\nas you are in the forest, you see an old decayed church");
                break;
            }
            case 8:{
                JOptionPane.showMessageDialog(null,steps.getText() + "\nas you are in the forest, you see a man that was recently dead, bandits are near");
                break;
            }
            case 9:{
                JOptionPane.showMessageDialog(null,steps.getText() + "\nas you are in the forest, you hear the birds chirping");
                break;
            }
            case 10:{
                JOptionPane.showMessageDialog(null,steps.getText() + "\nas you are in the forest, you see a dragon flying high in the sky, \"thank goodness Im hidden in the trees\" you said");
                break;
            }
        }
    }
}
