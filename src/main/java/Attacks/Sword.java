package Attacks;

public class Sword implements IWeapon{

    String name;
    int damage;

    public Sword(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public double attack(double damage){
         return this.damage += 10;
    }

    public double getDamage() {
        return this.damage;
    }


}