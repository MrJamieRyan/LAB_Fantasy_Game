package Fighter;

import Attacks.IWeapon;

public abstract class Barbarian{

    public String name;
    public int health;
    public IWeapon Club;

    public Barbarian(String name, int health){
        this.name = "Conan";
        this.health = 150;
    }

    public String getName(){
        return this.name;
    };
    public int getHealth(){
        return this.health;
    };
    public IWeapon getWeapon(){
        return this.Club;
    }