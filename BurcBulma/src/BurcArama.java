import java.util.Scanner;
public class BurcArama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("Lütfen doğduğunuz ayı giriniz: ");
        x = input.nextInt();
        System.out.print("Lütfen doğduğunuz günü giriniz: ");
        y = input.nextInt();
        if (x == 3) {
            if (y > 20) System.out.println("koç burcu");
            else System.out.println("balık burcu");
        } else if (x == 4) {
            if (y > 20) System.out.println("boğa burcu");
            else System.out.println("koç burcu");
        } else if (x == 5) {
            if (y > 21) System.out.println("ikizler burcu");
            else System.out.println("boğa burcu");
        } else if (x == 6) {
            if (y > 22) System.out.println("yengeç burcu");
            else System.out.println("ikizler burcu");
        } else if (x == 7) {
            if (y > 22) System.out.println("aslan burcu");
            else System.out.println("yengeç burcu");
        } else if (x == 8) {
            if (y > 22) System.out.println("başak burcu");
            else System.out.println("aslan burcu");
        } else if (x == 9) {
            if (y > 22) System.out.println("terazi burcu");
            else System.out.println("başak burcu");
        } else if (x == 10) {
            if (y > 22) System.out.println("akrep burcu");
            else System.out.println("terazi burcu");
        } else if (x == 11) {
            if (y > 21) System.out.println("yay burcu");
            else System.out.println("akrep burcu");
        } else if (x == 12) {
            if (y > 21) System.out.println("oğlak burcu");
            else System.out.println("yay burcu");
        } else if (x == 1) {
            if (y > 21) System.out.println("kova burcu");
            else System.out.println("oğlak burcu");
        } else if (x == 2) {
            if (y > 19) System.out.println("balık burcu");
            else System.out.println("kova burcu");
        }else System.out.println("geçerli bir sayı giriniz(1-12)");
    }
}
