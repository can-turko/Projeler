import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] u = {10, 20, 20, 10, 10, 20, 5, 20};
        int q = 1;
        Arrays.sort(u);
        System.out.println("Tekrar sayıları");
        for (int i = 0; i < u.length; i++) {
            for (int j = 0; j < u.length; j++) {
                if (j != i && u[j] == u[i]) {
                    q++;
                    i++;
                }
            }
            if (q > 1) {
                System.out.println(u[i] + " sayısı " + q + " kere tekrar edildi.");
            }
            q = 1;
        }
    }
}
