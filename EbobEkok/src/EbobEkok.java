import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 1, n1, n2, i = 1;
        System.out.print("Lütfen n1 sayısını giriniz: ");
        n1 = input.nextInt();
        System.out.print("Lütfen n2 sayısını giriniz: ");
        n2 = input.nextInt();
        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                a = i;
            }
            i++;
        }
        System.out.println("EBOB= " + a);
        System.out.println("EKOK= " + ((n1 * n2) / a));
    }
}
