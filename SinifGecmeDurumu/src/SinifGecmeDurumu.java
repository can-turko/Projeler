import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik, turkce, fizik, kimya, muzik;
        double  ortalama;
        System.out.print("Lütfen matematik notunuzu giriniz: ");
        matematik = input.nextInt();
        System.out.print("Lütfen türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Lütfen fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Lütfen kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Lütfen muzik notunuzu giriniz: ");
        muzik = input.nextInt();

        if (matematik<0 || matematik>100)
            matematik=0;
        if (turkce<0 || turkce>100)
            turkce=0;
        if (fizik<0 || fizik>100)
            fizik=0;
        if (kimya<0 || kimya>100)
            kimya=0;
        if (muzik<0 || muzik>100)
            muzik=0;
        ortalama = (matematik+turkce+fizik+kimya+muzik)/5.0;
        boolean gecmeDurumu = (ortalama >= 55);
        String sonDurum = gecmeDurumu ? "gectiniz":"kaldınız";
        System.out.println("ortalamanız: "+ortalama+" "+sonDurum);


    }
}
