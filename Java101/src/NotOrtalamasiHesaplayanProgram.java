import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int mat, fizik, tarih, edep, ing;
     System.out.print("lütfen matematik notunuzu giriniz: ");
     mat = input.nextInt();
     System.out.print("lütfen fizik notunuzu giriniz: ");
     fizik = input.nextInt();
     System.out.print("lütfen tarih notunuzu giriniz: ");
     tarih = input.nextInt();
     System.out.print("lütfen edebiyat notunuzu giriniz: ");
     edep = input.nextInt();
     System.out.print("lütfen ingilizce notunuzu giriniz: ");
     ing = input.nextInt();
     int toplam = mat + fizik + tarih + edep + ing;
     double ortalama = toplam/5.0;
     boolean sonuc = ortalama >= 60;
     String str = sonuc ? "Geçtiniz" : "Kaldınız";
     /* aşağıdaki dizilimi not ile geçtiniz-kaldınız yazısı arasnı boşluk bırakmak için yapıldı %s birimi ifade eder,
     3 birim yazılıp, ikisinin arasına boşluk bırakılacak.
      */
     String str2 = String.format("%s%s %s","Ortalamanız:", ortalama, str);
        System.out.println(str2);

    }
}
