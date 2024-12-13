package OOP_Part1.BoksGame;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void startMatch() {

        while (this.f1.health > 0 && this.f2.health > 0) {
            int random = (int) (Math.random() * 3);
            if (random == 1) {
                System.out.println("\n"+this.f1.name+" Saldırıyor...");
                f1.attack(f2);
                System.out.println(this.f1.name+ " Health:"+this.f1.health);
                System.out.println(this.f2.name+ " Health:"+this.f2.health);
            }
            if (random == 2){
                System.out.println("\n"+this.f2.name+" Saldırıyor...");
                f2.attack(f1);
                System.out.println(this.f1.name+ " Health:"+this.f1.health);
                System.out.println(this.f2.name+ " Health:"+this.f2.health);
            }

            if (this.f1.health<=0 || this.f2.health<=0){
                break;
            }

        }
        if (this.f1.health>0){
            System.out.println("Maçı kazanan :"+this.f1.name);
        }
        if (this.f2.health>0){
            System.out.println("Maçı kazanan :"+this.f2.name);
        }

    }
}
