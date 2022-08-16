import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, islem;
        System.out.print("lütfen ilk sayıyı giriniz:");
        a = input.nextInt();
        System.out.print("lütfen ikinci sayıyı giriniz:");
        b = input.nextInt();
        System.out.println("lütfen yapmak isteğiniz işlemi seçiniz\ntoplama için:1\nçıkarma için:2\nçarpma için:3\nbölme için:4'ü tuşlayınız.");
        islem = input.nextInt();
        switch (islem) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                if(b!=0) System.out.println(a/b);
                else System.out.println("hiçbir sayı 0'a bölünemez!");
            default:
                System.out.println("yapılacak işlemdeki sayı ve sonuç -2147483648 ile 2147483647 arasında olmalıdır, harf veya karakter girilmez.");
        }
    }
}
