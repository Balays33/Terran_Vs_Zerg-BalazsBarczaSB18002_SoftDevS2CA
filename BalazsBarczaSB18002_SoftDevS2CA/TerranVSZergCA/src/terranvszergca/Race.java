/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terranvszergca;

import java.util.Random;

/**
 *
 * @author  Balazs Barcza
 *          SB18002
 *          November 2018
 */
public abstract class Race {
    
    private String name;
    private int health;
    private String[] skills =  {"magic knife / rock","plasma gun /paper","laser gun / Scissors"};
    private int skillposition;
    private String skill;
    private int toughness;
    private int level;
    private String[] inventory;
    private int attackPoint;
    
    Random r = new Random();

    //constructor

    /**
     *default constructor
     */
    public Race() {
    }
    
    /**
     *  Race constructor pass string and integer
     *  r random create health toughness  skill
     * @param name
     * @param level
     */
    public Race(String name,int level)
    {
        this.name = name;
        this.health = r.nextInt(50)+50;
        this.toughness =r.nextInt(30)+2;
        this.level = level;
        this.skillposition = r.nextInt(skills.length);
        this.skill=skills[skillposition];
        this.attackPoint = r.nextInt(10)+2;
             
    }
    
    /**
     * RACE constructor pass string and integers
     * @param name
     * @param level
     * @param health
     * @param toughness
     */
    public Race(String name,int level,int health,int toughness)
    {
        this.name = name;
        this.health = health;
        this.toughness=toughness;
        this.level = level;
        this.skillposition = r.nextInt(skills.length);
        this.skill=skills[skillposition];
        this.attackPoint = r.nextInt(10)+2;
             
    }
    
    /**
     * info method get back basic informations about the character
     */
    public void info()
    {
        System.out.println("######################################");
        System.out.println("");
        System.out.println("Character name : " +this.name);
        System.out.println("health : " +this.health);
        System.out.println("toughness: "+this.toughness);
        System.out.println("level : "+this.level);
        System.out.println("skill : "+this.skill);
        System.out.println("attackPoint : "+this.attackPoint);
        dead();
    }
    
    /**
     * attack method create attack point
     */
    public void attack() {
        this.attackPoint = attackPoint+ r.nextInt(5)+2;
        System.out.println("attackpoint : "+this.attackPoint);
        
    } 

    /**
     * dead method checking the character health point 
     * if the health  0 output the name of the character is dead
     */
    public void dead()
    {
        if (this.health <=0)
        {
            System.out.println(this.name+" is dead");
        }
    }
     
    /**
     * set new health point
     */
    public void setNEWhealth()
    {
        this.health = r.nextInt(50)+50;
    }
   
     
    // getter and setter

    /**
     *  get name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *set name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get health
     * @return
     */
    public int getHealth() {
        return health;
    }

    /**
     * set health
     * @param health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     *  get skill
     * @return
     */
    public String getSkill() {
        return skill;
    }

    /**
     *  set skill
     * @param skill
     */
    public void setSkill(String skill) {
        this.skill = skill;
    }

    /**
     * get toughness
     * @return
     */
    public int getToughness() {
        return toughness;
    }

    /**
     * set toughness
     * @param toughness
     */
    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    /**
     * get level
     * @return
     */
    public int getLevel() {
        return level;
    }

    /**
     * set level
     * @param level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * get invertory
     * @return
     */
    public String[] getInventory() {
        return inventory;
    }

    /**
     * set invertory
     * @param inventory
     */
    public void setInventory(String[] inventory) {
        this.inventory = inventory;
    }

    /**
     * get attackpoint
     * @return
     */
    public int getAttackPoint() {
        return attackPoint;
    }

    /**
     * set attackpoint
     * @param attackPoint
     */
    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    /**
     * get skillposition
     * @return
     */
    public int getSkillposition() {
        return skillposition;
    }

    /**
     * set skillposition
     * @param skillposition
     */
    public void setSkillposition(int skillposition) {
        this.skillposition = skillposition;
    }

    /**
     * get skills
     * @return
     */
    public String[] getSkills() {
        return skills;
    }

    /**
     * set skills
     * @param skills
     */
    public void setSkills(String[] skills) {
        this.skills = skills;
    }
    
    
    
    
}
