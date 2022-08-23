import java.util.Scanner;
public class ElmasDeseni {
    public static void main(String[] args) {
        int a,b,c,d,f;
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz: ");
        a= input.nextInt();
        d=a;
        for (int i = 0;i<=a;i++){
            for(b=0;b<(a-i);b++) System.out.print(" ");
            for (c=1;c<=(2*i+1);c++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int j = 0;j<=a;j++){
            for(int e=0;e<j;e++) System.out.print(" ");
            for (f=1;f<=(2*d+1);f++) System.out.print("*");
            System.out.println("");
            d--;
        }
    }
}
