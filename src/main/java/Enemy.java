public abstract class Enemy {
    
    private int health;
    
    public Enemy(int health) {
        this.health = health;
    }

    public abstract int damage();

}


