package Fighter;

import Attacks.IWeapon;

public abstract class Knight{

    public String name;
    public int health;
    public IWeapon Sword;

    public Knight(String name, int health){
        this.name = "Lancelot";
        this.health = 100;
    }

    public String getName(){
        return this.name;
    };
    public int getHealth(){
        return this.health;
    };
    public IWeapon getWeapon(){
        return this.Sword;
    }





}

