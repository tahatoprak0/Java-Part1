package exercises_part1;

//Bir String ifadeyi tersine çevirmek için bir Java programı yazın.

public class DiziyiTersineCevir {
    public static void main(String[] args) {
        String kelime = "The quick brown fox";
        String tersDondur = "";

        for (int i = kelime.length()-1; i >= 0; i--) {
            tersDondur += "" + kelime.charAt(i);
        }

        System.out.println("Kelimenin ters döndürülmüş hali:" + tersDondur);
    }
}
