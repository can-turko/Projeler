import java.util.Scanner;
public class ZodiacBurc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tarih, kalan;
        String burc = "";
        boolean isError = false;
        System.out.print("Lütfen doğum tarihinizi yıl olarak giriniz: ");
        tarih = input.nextInt();
        kalan = tarih % 12;
        switch (kalan) {
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Köpek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
            default:
                isError =true;
        }
        if(isError||tarih<0) System.out.println("lütfen geçerli bir tarih giriniz!");
        else System.out.println("Çin Zodyağı Burcunuz :"+burc);

    }
}
