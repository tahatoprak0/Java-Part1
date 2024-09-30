package sinif_ve_nesneleri.pointer;

public class PointTest {
    public static void main(String[] args) {
        double orjin=0.0;
        Pointer point=new Pointer();
        point.x=5;
        point.y=6;
        point.moveXUp();
        point.moveYUp();
        point.moveXUp();
        point.moveYUp();
        point.moveXUp();
        point.moveXDown();
        point.bilgileriGoster();
        point.orjineUzaklıkHesapla(point.x, point.y);


    }
}
