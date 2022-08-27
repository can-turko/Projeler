import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Eleman sayisi gir : ");
        int a = inp.nextInt();
        int fib = 0, top = 1, n = 1;
        if (a > 0) {
            System.out.print(fib + " ");

            for (int i = 1; i < a; i++) {

                top = fib;
                fib += n;

                System.out.print(fib + " ");
                n = top;
            }
        }
    }
}
