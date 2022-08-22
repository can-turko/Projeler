import java.util.Scanner;
public class Mod4 {
    public static void main(String[] args) {
        /*
        A program that accepts input from the user until a single number is entered
        with Java loops and adds the numbers that are multiples of 4 from
        the entered values and prints them on the screen.
         */
        Scanner input = new Scanner(System.in);
        int a,b=0;
        System.out.print("Please enter a number: ");

        while ((a = input.nextInt())%2==0){
            System.out.print("Please enter a number: ");
            if(a%4==0)b+=a;

        }
        System.out.println("total= "+b);
    }
}
