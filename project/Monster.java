package project;
/**class for monster info*/
public class Monster {
    private final String[] MonsterName = {"Goblin","Bandit","Bear","Wisp","Golem","Lich"};
    private final double[] MonsterHealth = {2,5,10,2,50,200};
    private final double[] MonsterDamage = {0.5,2.5,7.5,10,15,20};
    private int num;
    /**set num
     * @param num -used**/
    public void setNum(int num) {
        this.num = num;
    }
    /**get monster name
     * @return MonsterName[num]**/
    public String getMonsterName(){
        return MonsterName[num];
    }
    /**return monster damage
     * @return MonsterHealth[num]**/
    public double getMonsterHealth() {
        return MonsterHealth[num];
    }
    /**return monster damage
     * @return MonsterDamage[num]**/
    public double getMonsterDamage() {
        return MonsterDamage[num];
    }

}
