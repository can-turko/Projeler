import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {-2, 12, 788, 1, -1, -778, 2, 0};
        int min = numbers[0];
        int max = numbers[0];
        System.out.println(Arrays.toString(numbers));

        for (int i : numbers) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.print("lütfen bir değer giriniz: ");
        int value = input.nextInt();
        for (int i : numbers) {
            if (value < i && i < max) max = i;
            if (value > i && i > min) min = i;
        }
        System.out.println("en yakın küçük " + min);
        System.out.println("en yakın büyük " + max);
    }
}
