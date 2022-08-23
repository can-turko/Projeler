import java.util.Scanner;

public class DortVeBesKuvvetleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b = 1;
        System.out.print("Please enter a number: ");
        a = input.nextInt();
        for (int i = 1; i < a; i *= 4) {
            System.out.print(i + ", ");
            if (b < a) System.out.println(b);
            b *= 5;
        }
    }
}
