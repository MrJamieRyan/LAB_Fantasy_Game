package Fighter;

import Attacks.IWeapon;
import enemys.Enemy;

public abstract class Player{
    private String name;
    private double health;
    private IWeapon weapon;

    public Player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public double damage(Enemy enemy){
        double attackDamage = this.weapon.attack(10);
        return enemy.damage(attackDamage);
    }



}

