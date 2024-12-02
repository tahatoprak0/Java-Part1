package sinif_ve_nesneleri.pointer;

public class PointTest {
    public static void main(String[] args) {
       //orijin: 0.0 noktası
        Pointer point=new Pointer();
        point.setX(5);
        point.setY(6);
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
