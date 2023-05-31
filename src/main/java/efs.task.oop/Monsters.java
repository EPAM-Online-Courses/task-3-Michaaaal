public class Monsters{
      public static final Monster andariel = new Monster(10,70) {
        @Override
        public void takeHit(int damage) {
            health-=damage;
            monstersHealth-=damage;
        }
    };

    public static final Monster blacksmith = new Monster(100,25) {
        @Override
        public void takeHit(int damage) {
            health-=(damage+5);
            monstersHealth-=(damage-5);
        }
    };

    private static int monstersHealth=andariel.getHealth()+ blacksmith.getHealth();

    public static int getMonstersHealth() {
        return monstersHealth;
    }
}
