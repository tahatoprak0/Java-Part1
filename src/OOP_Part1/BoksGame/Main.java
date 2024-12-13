package OOP_Part1.BoksGame;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1=new Fighter("Mike Tyson",100,120);
        Fighter fighter2=new Fighter("Muhammed Ali",100,125);

        Match match=new Match(fighter1,fighter2,100,150);
        match.startMatch();


    }
}
