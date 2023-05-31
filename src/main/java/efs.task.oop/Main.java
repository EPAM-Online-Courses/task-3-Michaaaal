public class Main {

        static Villager villager1=new Villager("Kashya",30);
        static Villager villager2=new Villager("Gheed",50);
        static Villager villager3=new Villager("Warriv",35);
        static Villager villager4=new Villager("Flawia",25);

        static Monsters monsters=new Monsters();

        static Villager victim;
        static Monster Mvictim;

        public static void agro(){
            if(villager1.isAlive()){
                victim=villager1;
            } else if (villager2.isAlive()) {
                victim=villager2;
            }
            else if (villager3.isAlive()) {
                victim=villager3;
            }
            else if (villager4.isAlive()) {
                victim=villager4;
            }
            /*else{
                System.out.println("WSZYSCY WOJOWNICY UMARLI POTWORY WYGRALY");
                System.exit(0);
            }*/
        }

        public static void agroM(){
            if(monsters.blacksmith.isAlive()){
                Mvictim=monsters.blacksmith;
            } else if (monsters.andariel.isAlive()) {
                Mvictim=monsters.andariel;
            }
        }

    public static void main(String[] args) {

        Object object_akara= new ExtraordinaryVillager("Akara",40,ExtraordinaryVillager.Skill.SHELTER);
        Object object_deckard_cain= new ExtraordinaryVillager("Deckard Cain",85,ExtraordinaryVillager.Skill.IDENTIFY);

        villager1.sayHello();
        villager2.sayHello();
        villager3.sayHello();
        villager4.sayHello();
        ((ExtraordinaryVillager) object_deckard_cain).sayHello();
        ((ExtraordinaryVillager) object_akara).sayHello();

        System.out.println();
        int i=0;
        while(monsters.getMonstersHealth()>0 ){

            agro();
            monsters.andariel.attack(victim);
            agro();
            monsters.blacksmith.attack(victim);

            agroM();
            if(i%2==0){
                villager1.attack(Mvictim);
                System.out.println("Aktualnie walczacy osadnik to "+villager1.getName() /*+ "ma tyle hp: "+ villager1.getHealth()*/);
                agroM();
                villager2.attack(Mvictim);
                System.out.println("Aktualnie walczacy osadnik to "+villager2.getName() /*+ "ma tyle hp: "+ villager2.getHealth()*/);
            }else{
                villager3.attack(Mvictim);
                System.out.println("Aktualnie walczacy osadnik to "+villager3.getName() /*+"ma tyle hp: "+ villager3.getHealth()*/);
                agroM();
                villager4.attack(Mvictim);
                System.out.println("Aktualnie walczacy osadnik to "+villager4.getName()  /*+"ma tyle hp: "+ villager4.getHealth()*/);
            }
            System.out.println("Potwory posiadaja jeszcze "+ monsters.getMonstersHealth() +" punkty zycia");
            i++;
        }
        System.out.println("\nObozowisko ocalone!\n");

        ExtraordinaryVillager deckard_cain = (ExtraordinaryVillager) object_deckard_cain;
        ExtraordinaryVillager akara = (ExtraordinaryVillager) object_akara;

        deckard_cain.sayHello();
        akara.sayHello();

    }


}
