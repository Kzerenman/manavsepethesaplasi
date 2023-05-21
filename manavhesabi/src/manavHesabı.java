import java.util.Scanner;

public class manavHesabı {
    public static void main(String[] args) {
        Scanner Scan =new Scanner(System.in);

        //değişkenler tanımlandı ve veri girişşi için scanner kodu kullanıldı.
        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz=0.95;
        double patlican=5.00;

        System.out.print("Armut Kaç Kilo : ");
        double armutKilo = Scan.nextDouble();

        System.out.print("Elma Kaç Kilo : ");
        double elmaKilo = Scan.nextDouble();

        System.out.print("Domates Kaç Kilo : ");
        double domatesKilo =Scan.nextDouble();

        System.out.print("Muz kaç Kilo : ");
        double muzKilo = Scan.nextDouble();

        System.out.print("Patlıcan Kaç Kilo : ");
        double patlicanKilo =Scan.nextDouble();

        double toplam = 0.0;
        toplam = (armut * armutKilo);
        toplam +=(elma*elmaKilo);
        toplam +=(domates*domatesKilo);
        toplam +=(muz*muzKilo);
        toplam +=(patlican*patlicanKilo);
        System.out.print("Toplam Tutar : " +toplam + " TL");









    }
}
