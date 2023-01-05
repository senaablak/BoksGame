public class Fighter {
    String name;
    int damage;
    int weight;
    int health;
    double dodge;

    Fighter(String name, int damage, int weight, int health, double dodge) {
        this.name = name;
        this.weight = weight;
        this.damage = damage;
        this.health = health;
        this.dodge = dodge ;
    }

    int hit(Fighter Foe) {
        System.out.println(this.name + "==>" + Foe.name + " " + this.damage + " Hasar vurdu.");

        if (Foe.isDodge()) {
            System.out.println(Foe.name + "   ----   BLOK!!!");
            return Foe.health;
        }
        if (Foe.health - this.damage < 0) {
            return 0;
        }
        return Foe.health - this.damage;
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
