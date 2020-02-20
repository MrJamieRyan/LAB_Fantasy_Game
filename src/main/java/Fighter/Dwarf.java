package Fighter;

import Attacks.IWeapon;

public abstract class Dwarf{

    public String name;
    public int health;
    public IWeapon Axe;

    public Knight(String name, int health){
        this.name = "Gimly";
        this.health = 50;
    }

    public String getName(){
        return this.name;
    };
    public int getHealth(){
        return this.health;
    };
    public IWeapon getWeapon(){
        return this.Axe;
    }
