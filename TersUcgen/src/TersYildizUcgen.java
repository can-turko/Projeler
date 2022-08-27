import java.util.Scanner;

public class TersYildizUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt(), a = n;
        for (int i = 0; i < n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 2 * a - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
            a--;
        }
    }
}
