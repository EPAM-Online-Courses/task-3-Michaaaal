public class Villager implements Fighter{
    protected String name;
    protected int age;

    private boolean isAlive;

    protected int health=100;
    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
        this.isAlive=true;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        if(this.health>0){
            isAlive=true;
        }else{
            isAlive=false;
        }
        return isAlive;
    }

    public int getAge() {
        return age;
    }

    public int getHealth() {
        return health;
    }

    public void sayHello(){
        System.out.println("Greetings traveler... I'm "+this.name +" and I'm " +this.age+" years old");
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit((int) ((100 - this.getAge() * 0.5) / 10));
    }

    @Override
    public void takeHit(int damage) {
        this.health-=damage;
    }
}
