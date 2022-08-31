import java.util.Scanner;

public class RecursiveDesen {
    static void desen() {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı: ");
        int a = input.nextInt(), b = a;
        while (a > 0) {
            System.out.print(a + " ");
            a -= 5;
        }
        while (a <= b) {
            System.out.print(a + " ");
            a += 5;
        }
    }

    public static void main(String[] args) {
        desen();
    }

}
