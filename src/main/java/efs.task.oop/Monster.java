package efs.task.oop;

public abstract class Monster implements Fighter{

    protected int health;
    protected int damage;
    private boolean isAlive;

    public Monster(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.isAlive = true;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    public boolean isAlive() {
        if(this.health>0){
            isAlive=true;
        }else{
            isAlive=false;
        }
        return isAlive;
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit(this.damage);
    }

    @Override
    public void takeHit(int damage) {
        health-=damage;
    }
}
