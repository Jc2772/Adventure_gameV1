package project;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

@SuppressWarnings("ALL")
public class Project {
    public static Random random = new Random();
    private static int north = 0;
    private static int south = 0;
    private static int east = 0;
    private static int west = 0;
    private static int northborder = random.nextInt(50, 75);
    private static int southborder = random.nextInt(50, 75);
    private static int eastborder = random.nextInt(50, 75);
    private static int westborder = random.nextInt(50, 75);
    private static int northeastborder = random.nextInt(25, 50);
    private static int southwestborder = random.nextInt(25, 50);
    public static boolean game = true;
    public static String endtext;
    private JLabel text;
    private JPanel window;
    private JTextField input;
    private JButton enter;

    public static JFrame frame = new JFrame();


    public static void main(String[] args) {
        new Player().setName();
        Project gui = new Project();
        gui.createUIComponents();
        frame.setSize(500, 500);
        /*
        code source -- https://web.archive.org/web/20080921040824/http://blog.codebeach.com/2008/02/center-dialog-box-frame-or-window-in.html
        date accessed -- 21/11/2022
        */
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int
                x = (screenSize.width - frame.getWidth()) / 2,
                y = (screenSize.height - frame.getHeight()) / 2;
        frame.setLocation(x, y);
        //end of code copied
        frame.setVisible(true);
        frame.add(gui.window);
    }

    public static void setDirection(int north, int south, int east, int west) {
        Project.north = north;
        Project.south = south;
        Project.east = east;
        Project.west = west;
    }

    public static int getNorth() {
        return north;
    }

    public static int getSouth() {
        return south;
    }

    public static int getEast() {
        return east;
    }

    public static int getWest() {
        return west;
    }

    public Project() {
        $$$setupUI$$$();
        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                if (north > northeastborder && east > northeastborder) {
                    game = false;
                } else if (south > southwestborder && west > southwestborder) {
                    game = false;
                } else if (north > northborder) {
                    game = false;
                } else if (south > southborder) {
                    game = false;
                } else if (east > eastborder) {
                    game = false;
                } else if (west > westborder) {
                    game = false;
                }
                if (game == false) {
                    JOptionPane.showMessageDialog(null, "You got out of the forest");
                } else {
                    text.setText("Enter your next move: ");
                    String move;
                    move = input.getText();
                    new steps(move);
                    Events();
                    frame.setVisible(true);
                }
            }

            public void Events() {
                int eventType = random.nextInt(1, 3);
                if (eventType == 1) {
                    new MonsterEvents().monsterevents();
                } else if (eventType == 2) {
                    new GenericEvents().genericevents();
                } else if (eventType == 3) {
                    new LootEvents().lootevents();
                }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        window = new JPanel();
        window.setLayout(new GridBagLayout());
        window.setMaximumSize(new Dimension(500, 500));
        window.setMinimumSize(new Dimension(300, 300));
        text = new JLabel();
        Font textFont = this.$$$getFont$$$("Times New Roman", Font.BOLD, 22, text.getFont());
        if (textFont != null) text.setFont(textFont);
        text.setHorizontalAlignment(0);
        text.setHorizontalTextPosition(0);
        text.setText("<html>You are in a forest with no way out,<br>\nYou only hava a dagger<br>\nand no armour<br>\nthe forest is a deadly place<br>\nfull of creatures waiting to strike<br>\nto live you must find a way out<br></html");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        window.add(text, gbc);
        input = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        window.add(input, gbc);
        enter = new JButton();
        Font enterFont = this.$$$getFont$$$("Times New Roman", -1, -1, enter.getFont());
        if (enterFont != null) enter.setFont(enterFont);
        enter.setHorizontalAlignment(0);
        enter.setHorizontalTextPosition(0);
        enter.setText("Input");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        window.add(enter, gbc);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return window;
    }

}
