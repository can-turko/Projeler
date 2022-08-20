import java.util.Scanner;
public class Siralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z;
        System.out.print("Lütfen ilk sayıyı giriniz: ");
        x = input.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        y = input.nextInt();
        System.out.print("Lütfen üçüncü sayıyı giriniz: ");
        z = input.nextInt();
        if(x<=y && x<=z){
            if(y<=z) System.out.println(x+"  "+y+"  "+z);
            else System.out.println(x+"  "+z+"  "+y);
        }
        else if(y<=x && y<=z){
            if(x<=z) System.out.println(y+"  "+x+"  "+z);
            else System.out.println(y+"  "+z+"  "+x);
        } else  {
            if (x <= y) System.out.println(z + "  " + x + "  " + y);
            else System.out.println(z + "  " + y + "  " + x);
        }
    }
}
