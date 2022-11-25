package project;


/**class for player info*/
public class Player {
    private String name;
    private double health = 25;
    private double weapon = 1;
    private int MonKills = 0;
    private int DistanceTraveled = 0;
    /**used to set name
     * @param name -used**/
    public void setName(String name) {
        this.name = name;
    }
    /**set health
     * @param health -used**/
    public void setHealth(double health) {
        this.health = health;
    }
    /**set weapon
     * @param weapon -used**/
    public void setWeapon(double weapon) {
        this.weapon = weapon;
    }
    /**
     * set monster kills
     * @param MonKills -used**/
    public void setMonKills(int MonKills) {
        this.MonKills = MonKills ;
    }
    /**set distance traveled
     * @param DistanceTraveled -used**/
    public void setDistanceTraveled(int DistanceTraveled) {
        this.DistanceTraveled = DistanceTraveled;
    }
    /**return weapon
     * @return  weapon -used**/
    public double getWeapon() {
        return weapon;
    }
    /**return health
     * @return health -used**/
    public double getHealth() {
        return health;
    }
    /**return name
     * @return name -used**/
    public String getName() {
        return name;
    }
    /**return monkills
     * @return MonKills -used**/
    public int getMonKills() {
        return MonKills;
    }
    /**get distance traveled
     * @return DistanceTraveled**/
    public int getDistanceTraveled() {
        return DistanceTraveled;
    }
}
