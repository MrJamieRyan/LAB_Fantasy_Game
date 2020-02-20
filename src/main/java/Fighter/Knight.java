package Fighter;

import Attacks.IWeapon;

public class Knight{

    public String name;
    public int health;
    public IWeapon weapon;

    public Knight(String name, int health, String weapon){
        this.name = name;
        this.health = health;
    }

    public String getName(){
        return this.name;
    };
    public int getHealth(){
        return this.health;
    };
    public IWeapon getWeapon(IWeapon weapon){
        return weapon;
    }





}

