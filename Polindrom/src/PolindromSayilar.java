import java.util.Scanner;

public class PolindromSayilar {
    static boolean i(int a) {
        int b = a, c = 0;
        while (b != 0) {
            c *= 10;
            c += (b % 10);
            b /= 10;
        }
        if (c == a) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Sayı giriniz: ");
        System.out.println(i(input.nextInt()) ? "Polindrom sayıdır" : "Polindrom sayı değildir");
    }
}
