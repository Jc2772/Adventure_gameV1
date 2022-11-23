package project;

import javax.swing.*;

public class Player {
    private String name;
    private double health = 25;
    private double weapon = 1;
    private int MonKills = 0;
    private int DistanceTraveled = 0;
    public void setName(String name) {
        this.name = name;
    }
    public void setHealth(double health) {
        this.health = health;
    }

    public void setWeapon(double weapon) {
        this.weapon = weapon;
    }

    public void setMonKills(int MonKills) {
        this.MonKills = MonKills ;
    }

    public void setDistanceTraveled(int DistanceTraveled) {
        this.DistanceTraveled = DistanceTraveled;
    }

    public double getWeapon() {
        return weapon;
    }

    public double getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public int getMonKills() {
        return MonKills;
    }

    public int getDistanceTraveled() {
        return DistanceTraveled;
    }
}
