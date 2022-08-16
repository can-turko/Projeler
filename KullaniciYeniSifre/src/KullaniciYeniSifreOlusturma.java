import java.util.Scanner;

public class KullaniciYeniSifreOlusturma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullaniciAdi, sifre, yeniSifre, onay;
        System.out.print("Kullanıcı adınızı giriniz: ");
        kullaniciAdi = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        sifre = input.nextLine();
        if (kullaniciAdi.equals("java101") && sifre.equals("12345"))
            System.out.println("Başaralı bir şekilde giriş yaptınız!");
        else if (kullaniciAdi.equals("java101") && !(sifre.equals("12345"))) {
            System.out.println("Şifrenizi hatalı girdiniz! \nŞifrenizi değiştirmek istermisiniz?\ny,n");
            onay = input.next();
            if (onay.equals("y")) {
                System.out.println("yeni şifrenizi giriniz: ");
                input.nextLine();
                yeniSifre = input.nextLine();
                input.close();
                if (yeniSifre.equals("12345")) System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                else System.out.println("yeni şifreniz oluşturuldu");


            }

        } else System.out.println("kullanıcı adınız bulunmuyor");
    }
}
