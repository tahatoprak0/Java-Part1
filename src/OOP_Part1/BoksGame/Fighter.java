package OOP_Part1.BoksGame;

import java.util.Scanner;

public class Fighter {
    Scanner input = new Scanner(System.in);
    String name;
    int health;
    int weight;

    public Fighter(String name, int health, int weight) {
        this.name = name;
        this.health = health;
        this.weight = weight;
    }

    void feautures(int select, Fighter fighter){

        switch (select){
            case 1 :
                int damaged=(int)(Math.random()*51);
                if (damaged==0){
                    int hasar=((damaged)*defended()/100);
                    fighter.health-=hasar;
                    System.out.println("Verilen Hasar:"+hasar);
                    System.out.println("Bu vuruş olmadı");

                } else if (damaged>0 && damaged <20) {
                    int hasar=((damaged)*defended()/100);
                    fighter.health-=hasar;
                    System.out.println("Verilen Hasar:"+hasar);
                    System.out.println("Bir şimsek vuruşu ama Etkili bir vuruş olmuyor");
                }else {
                    int hasar=((damaged)*defended()/100);
                    fighter.health-=hasar;
                    System.out.println("Verilen Hasar:"+hasar);
                    System.out.println("Etkili bir şimşek  vuruşu");
                }
                break;
            case 2:
                int damaged1=(int)(Math.random()*51);
                if (damaged1==0){
                    int hasar=((damaged1)*defended()/100);
                    fighter.health-=hasar;
                    System.out.println("Verilen Hasar:"+hasar);
                    System.out.println("Bu vuruş olmadı");

                } else if (damaged1>0 && damaged1 <20) {
                    int hasar=((damaged1)*defended()/100);
                    fighter.health-=hasar;
                    System.out.println("Verilen Hasar:"+hasar);
                    System.out.println("Bir Gölge Kroşesi ama Etkili bir vuruş olmuyor");
                }else {
                    int hasar=((damaged1)*defended()/100);
                    fighter.health-=hasar;
                    System.out.println("Verilen Hasar:"+hasar);
                    System.out.println("Etkili bir Gölge Kroşesi Vuruşu");
                }
                break;
            case 3:
                int damaged3=(int)(Math.random()*51);
                if (damaged3==0){
                    int hasar=((damaged3)*defended()/100);
                    fighter.health-=hasar;
                    System.out.println("Verilen Hasar:"+hasar);
                    System.out.println("Bu vuruş olmadı");

                } else if (damaged3>0 && damaged3 <20) {
                    int hasar=((damaged3)*defended()/100);
                    fighter.health-=hasar;
                    System.out.println("Verilen Hasar:"+hasar);
                    System.out.println("Bir Ejderha Nefesi Vuruşu ama Etkili bir vuruş olmuyor");
                }else {
                    int hasar=((damaged3)*defended()/100);
                    fighter.health-=hasar;
                    System.out.println("Verilen Hasar:"+hasar);
                    System.out.println("Etkili bir Ejderha Nefesi vuruşu Noluyor Böyle!!!!");
                }
                break;
            case 4 :
                int damaged4=(int)(Math.random()*51);
                if (damaged4==0){
                    int hasar=((damaged4)*defended()/100);
                    fighter.health-=hasar;
                    System.out.println("Verilen Hasar:"+hasar);
                    System.out.println("Bu vuruş olmadı");

                } else if (damaged4>0 && damaged4 <20) {
                    int hasar=((damaged4)*defended()/100);
                    fighter.health-=hasar;
                    System.out.println("Verilen Hasar:"+hasar);
                    System.out.println("Rakibe Bir Kaplan Saldırısı ama Etkili bir saldırı olmuyor");
                }else {
                    int hasar=((damaged4)*defended()/100);
                    fighter.health-=hasar;
                    System.out.println("Verilen Hasar:"+hasar);
                    System.out.println("Etkili bir Kaplan Saldırısı, Aman Allahım");
                }
                break;
        }
    }

    void attack(Fighter fighter){
        System.out.println(
                "\n1- Şimşek Yumruğu"+
                        "\n2- Gölge Kroşesi"+
                        "\n3- Ejderha Nefesi"+
                        "\n4- Kaplan Saldırısı");
        System.out.print("Attack :");
        int select=input.nextInt();
        feautures(select,fighter);
    }

    public int defended(){
        int random = (int)(Math.random()*6);
        if (random == 0){
            return 0;
        }else if (random == 1){
            System.out.println("%20 bloke edildi");
            return 20;
        } else if (random == 2) {
            System.out.println("%40 bloke edildi");
            return 40;
        }else if (random == 3) {
            System.out.println("%60 bloke edildi");
            return 60;
        }else if (random == 4) {
            System.out.println("%80 bloke edildi");
            return 80;
        }else return 100;

    }



}
