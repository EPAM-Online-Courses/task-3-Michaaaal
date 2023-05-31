package efs.task.oop;

public class ExtraordinaryVillager extends Villager {

    public enum Skill{
        IDENTIFY("I will identify items for you at no charge."),
        SHELTER("I can offer you poor shelter.");

        private String s;
        Skill(String s) {
            this.s=s;
        }

        @Override
        public String toString() {
            return this.s;
        }
    }

    private final Skill skill;

    public ExtraordinaryVillager(String name, int age, Skill skill) {
        super(name, age);
        this.skill=skill;
    }

    @Override
    public void sayHello(){
        System.out.println("Greetings traveler... I'm "+this.name +" and I'm " +this.age+" years old. "+skill);
    }

    @Override
    public void attack(Fighter victim) {
    }

    @Override
    public void takeHit(int damage) {
        this.health=0;
    }
}
