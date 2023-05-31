package efs.task.oop;

public class ExtraordinaryVillager extends Villager{

    public enum Skill {
        IDENTIFY("I will identify items for you at no charge."),
        SHELTER("I can offer you poor shelter.");

        private final String description;

        Skill(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    private final Skill skill;

    public ExtraordinaryVillager(String name, int age, Skill skill) {
        super(name, age);
        this.skill = skill;
    }

    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + name +  " and I'm " + age + " years old. " + skill.getDescription());
    }

    public void attack(Fighter victim) {
        victim.takeHit(0);
    }

    public void takeHit(int damage) {
        health = 0;
    }
}
