import java.util.Arrays;

public class Main {
    static boolean control(int[] a, int b) {
        for (int i : a) {
            if (i == b) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 2, 5};
        int[] doplicant = new int[arr.length];
        int u = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (control(doplicant, arr[i])) {
                    if (i != j && arr[i] == arr[j] && arr[i] % 2 == 0) {
                        doplicant[u++] = arr[i];
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(doplicant));
    }
}
