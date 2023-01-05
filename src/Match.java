import javax.swing.*;

public class Match {
    Fighter F1;
    Fighter F2;
    int MaxWeight;
    int MinWeight;
    double StartNumber;

    Match(Fighter F1, Fighter F2, int MinWeight, int MaxWeight) {
        this.F1 = F1;
        this.F2 = F2;
        this.MinWeight = MinWeight;
        this.MaxWeight = MaxWeight;
        this.StartNumber = StartNumber;

    }

    boolean isF1Start() {
        if ((int) (Math.random() * 100) % 2 == 1) {
            System.out.println("Oyuna B oyuncusu başlıyor.");
            return true;

        } else {
            System.out.println("Oyuna A oyuncusu başlıyor.");
            return false;
        }
    }

    void F1Attack() {
        this.F2.health = this.F1.hit(this.F2);
    }

    void F2Attack() {
        this.F1.health = this.F2.hit(this.F1);
    }

    void run() {

        if (isCheck()) {

            boolean isTurnF1 = false;

            if (isF1Start()) {
                isTurnF1 = false;


            } else {
                isTurnF1 = true;

            }

            while (this.F1.health > 0 && this.F2.health > 0) {
                System.out.println("---Yeni Round---");

                if (isTurnF1) {
                    F1Attack();
                    isTurnF1 = false;
                } else {
                    F2Attack();
                    isTurnF1 = true;
                }

                if (isWin()) {
                    break;
                }

                System.out.println(this.F1.name + " : Sağlık : " + this.F1.health);
                System.out.println(this.F2.name + " : Sağlık : " + this.F2.health);
            }
        } else {
            System.out.println("Sporcuların Sikletleri uymuyor.");
        }
    }

    boolean isCheck() {
        return (this.F1.weight >= MinWeight && this.F1.weight <= MaxWeight) && (this.F2.weight >= MinWeight && this.F2.weight <= MaxWeight);

    }

    boolean isWin() {
        if (this.F1.health == 0) {
            System.out.println(this.F2.name + " Kazandı.");
            return true;
        }
        if (this.F2.health == 0) {
            System.out.println(this.F1.name + " Kazandı.");
            return true;
        }
        return false;
    }
}

