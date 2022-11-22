package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static project.Project.game;
import static project.Project.random;

public class MonsterEvents {
    private final Player player = new Player();
    private double health = player.getHealth();
    private final double weapon = player.getWeapon();
    private Monster monster = new Monster();
    private JButton monsterbuttion;
    private JTextField monsterinput;
    private JLabel monstertext;
    private JPanel monstergui;
    private double regen;
    private String monsterName;
    private double monsHealth;
    private double monDamage;
    private boolean monsterfight;

    public MonsterEvents() {
        monsterbuttion.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String eventText = "";
                if (health <= 0) {
                    JOptionPane.showMessageDialog(null, "The " + monsterName + " has defeated you, You are Dead ");
                    System.exit(0);
                    monsterfight = false;
                    return;
                } else if (monsHealth <= 0) {
                    JOptionPane.showMessageDialog(null, "You have defeated a " + monsterName + "You have Won");
                    health = regen;
                    player.setMonKills();
                    monsterfight = false;
                    return;
                } else {
                    if (monsterinput.getText().contains("attack") || monsterinput.getText().contains("stab") || monsterinput.getText().contains("hurt") || monsterinput.getText().contains("swing") || monsterinput.getText().contains("strike") || monsterinput.getText().contains("hit") || monsterinput.getText().contains("kick") || monsterinput.getText().contains("punch") || monsterinput.getText().contains("fight")) {
                        eventText += "<html>You hit the monster with your weapon";
                        monsHealth -= weapon;
                        eventText += "<br>The " + monsterName + " launches his attack on you</html>";
                        health -= monDamage;
                    } else if (monsterinput.getText().contains("flee") || monsterinput.getText().contains("run") || monsterinput.getText().contains("sprint") || monsterinput.getText().contains("retreat") || monsterinput.getText().contains("walk") || monsterinput.getText().contains("move") || monsterinput.getText().contains("travel") || monsterinput.getText().contains("wander") || monsterinput.getText().contains("head") || monsterinput.getText().contains("go")) {
                        int chance = random.nextInt(1, 10);
                        if (chance == 1) {
                            eventText += "You failed to escape, The " + monsterName + " launches his attack on you";
                            health -= monDamage;
                        } else {
                            steps.RandomDirection(Project.getNorth(), Project.getSouth(), Project.getEast(), Project.getWest());
                            eventText += "<html>You have escaped the " + monsterName + "</html>";
                            return;
                        }
                    } else {
                        eventText += "<html>You do nothing as The " + monsterName + " launches his attack on you</html>";
                        health -= monDamage;
                    }
                    monstertext.setText(eventText);
                }
            }
        });
    }

    public void monsterevents() {

        int Monster = random.nextInt(1, 300);
        Monster monster = new Monster();
        if (Monster >= 1 && Monster <= 100) {
            monster.setNum(0);
        } else if (Monster >= 101 && Monster <= 175) {
            monster.setNum(1);
        } else if (Monster >= 176 && Monster <= 230) {
            monster.setNum(2);
        } else if (Monster >= 231 && Monster <= 270) {
            monster.setNum(3);
        } else if (Monster >= 271 && Monster <= 299) {
            monster.setNum(4);
        } else if (Monster == 300) {
            monster.setNum(5);
        }
        monsterName = monster.getMonsterName();
        monDamage = monster.getMonsterDamage();
        monsHealth = monster.getMonsterHealth();
        regen = health;
        String montext = "<html>You have encountered a " + monsterName + "<br>,You could try to run away from it and get lost in the woods or choose to risk your life<br> What do you do</html>";
        monsterfight = true;
        while (monsterfight) {
            MonsterEventGui(montext);
        }
    }

    private JFrame MonFrame = new JFrame();

    public void MonsterEventGui(String montext) {
        MonsterEvents gui = new MonsterEvents();
        monstertext.setText(montext);
        createUIComponents();
        MonFrame.setSize(500, 500);
            /*
            code source -- https://web.archive.org/web/20080921040824/http://blog.codebeach.com/2008/02/center-dialog-box-frame-or-window-in.html
            date accessed -- 21/11/2022
            */
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int
                x = (screenSize.width - MonFrame.getWidth()) / 2,
                y = (screenSize.height - MonFrame.getHeight()) / 2;
        MonFrame.setLocation(x, y);
        //end of code copied
        MonFrame.setVisible(true);
        MonFrame.add(gui.monstergui);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        monstergui = new JPanel();
        monstergui.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(4, 1, new Insets(0, 0, 0, 0), -1, -1));
        monstertext = new JLabel();
        monstertext.setText("");
        monstergui.add(monstertext, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        monsterbuttion = new JButton();
        monsterbuttion.setHideActionText(false);
        monsterbuttion.setText("Button");
        monsterbuttion.setVerticalAlignment(0);
        monstergui.add(monsterbuttion, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTH, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, 1, null, null, null, 0, false));
        monsterinput = new JTextField();
        monsterinput.setDragEnabled(true);
        monsterinput.setMargin(new Insets(2, 6, 2, 6));
        monstergui.add(monsterinput, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, new Dimension(150, -1), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return monstergui;
    }

}

