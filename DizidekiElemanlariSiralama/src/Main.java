import java.util.Scanner;
public class Main {
    static void diz(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (i > j) continue;
                if (arr[i] > arr[j]) {
                    int a = arr[i];
                    int b = arr[j];
                    arr[i] = b;
                    arr[j] = a;
                }
            }
        }
    }
    static void print(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n: ");
        int[] arr = new int[input.nextInt()];
        System.out.println("Dizinin elemanlarını giriniz :");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print((i+1)+". Elemanı: ");
            arr[i] = input.nextInt();
        }
        diz(arr);
        print(arr);


    }
}
