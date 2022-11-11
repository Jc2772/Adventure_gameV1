package project;
import java.io.PrintStream;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Gui {
    public Gui(){
        JFrame frame = new JFrame("Adeventure game");
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        frame.setLayout(flow);
        frame.setSize(600,120);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea textArea = new JTextArea("You are in a forest with no way out,\nYou only hava a dagger\nand you must find your way out");
        JScrollPane scrollPane = new JScrollPane(textArea);
        JTextField input = new JTextField();
        JButton enter = new JButton();
    }
}
