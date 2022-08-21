import java.util.Scanner;
public class UcakMesafeUcret {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, yas, tip;
        double tutar;
        System.out.print("Mesafeyi km türünden giriniz: ");
        km = input.nextInt();
        tutar = km * 0.10;
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tip = input.nextInt();
        if ((km > 0) && (yas > 0) && ((tip == 1) || (tip == 2))) {
            if (yas < 12) {
                if (tip == 2) {
                    tutar = -(tutar * 0.5) + (tutar);
                    tutar = -(tutar * 0.2) + tutar;
                } else tutar = tutar * 0.5;
            } else if (yas >= 12 && yas < 24) {
                if (tip == 2) {
                    tutar = -(tutar * 0.1) + tutar;
                    tutar = -(tutar * 0.2) + tutar;
                } else tutar = -(tutar * 0.1) + tutar;
            } else if (yas >= 65) {
                if (tip == 2) {
                    tutar = -(tutar * 0.3) + tutar;
                    tutar = -(tutar * 0.2) + tutar;
                } else tutar = -(tutar * 0.3) + tutar;
            } else {
                if (tip == 2) {
                    tutar = -(tutar * 0.2) + tutar;

                }

            }
            System.out.print("Tutar: " + tutar);
        }else System.out.println("Yanlış sayı girdiniz!");

    }
}
