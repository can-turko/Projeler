import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 1;
        int d = 0;
        int e = -1;
        int[][] q = new int[a][b];
        int[][] w = new int[b][a];
        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < q[i].length; j++) {
                q[i][j] = c;
                c++;
            }
        }
        for (int[] k : q) {
            System.out.println(Arrays.toString(k));
        }
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j <= w.length+1; j++) {
                w[i][j] = q[j][i];

            }
        }
        System.out.println(" ");
        for (int[] k : w) {
            System.out.println(Arrays.toString(k));
        }
    }

}