package efs.task.oop;

public abstract class Monster implements Fighter {
    private int health;
    private final int damage;

    public Monster(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public void attack(Fighter victim) {
        victim.takeHit(damage);
    }
    public void takeHit(int damage) {
        if (health > damage) {
            health -= damage;
        }
        else {
            health = 0;
        }
    }

    public int getHealth() {
        return health;
    }
}
