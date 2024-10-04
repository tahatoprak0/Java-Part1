package sinif_ve_nesneleri.pointer;

public class Pointer {
    int x;
    int y;

    public void moveXUp(){
        x++;
        System.out.println("X bir arttırıldı"+" X:"+x);
    }
    public void moveXDown(){
        x--;
        System.out.println("x bir azaltıldı"+" X:"+x);
    }
    public void moveYUp(){
        y++;
        System.out.println("y bir arttırıldı"+" Y:"+y);
    }
    public void moveYDown(){
        y--;
        System.out.println("y bir azaltıldı"+" Y:"+y);
    }

    public void orjineUzaklıkHesapla(int x, int y){
        double kare=Math.pow(x,2)+Math.pow(y,2);
        double oriijineUzaklık=Math.sqrt(kare);
        System.out.println("Orijine Uzaklık="+oriijineUzaklık);

    }


    public void bilgileriGoster(){
        System.out.println("X:"+x);
        System.out.println("Y:"+y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
