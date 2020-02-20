package Attacks;

public class Axe implements IWeapon{

    String name;
    int damage;

    public Axe(String name, int damage) {
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
