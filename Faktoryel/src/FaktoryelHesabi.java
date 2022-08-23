import java.util.Scanner;
public class FaktoryelHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, b = 1,r,c=1,d,f=1;
        System.out.print("n elemanını giriniz: ");
        n = input.nextInt();
        System.out.print("r elemanını giriniz(n'den küçüktür): ");
        r = input.nextInt();
        for (int i = 1; i <= n; i++) {
            b*=i;
            if(!(i<=r))continue;
            c*=i;

        }
        for (int e = 1;e<=(n-r);e++){
            f*=e;
        }
        d=(b)/(c*f);
        System.out.println(d);

    }
}
