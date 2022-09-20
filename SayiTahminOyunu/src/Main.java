import java.util.Scanner;
import  java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] q = new int[5];
        int randomNumber = (int) (Math.random()*100);
        int right = 5;
        int g = 0;
        for(int i = 1 ; i <=5 ; i++){
            System.out.print("Lütfen tahmininizi giriniz : ");
            int enteredNumber = input.nextInt();
            q[i-1]=enteredNumber;
            if(enteredNumber>99 || enteredNumber<0){
                if( g == 0){
                    System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz");
                    g++;
                    i--;
                    continue;
                }
                else if ( g > 0){
                    System.out.println("Birden fazla hatalı giriş yaptınız!");
                    i++;
                    System.out.println("Kalan hakkınız: "+(right-i));
                    if(i > 5){
                        System.out.println("Kaybettiniz, sayı: "+randomNumber+" olması gerikiyordu.");
                    }
                    continue;
                }

            }
            if(enteredNumber==randomNumber){
                System.out.println("Tebrikler doğru tahmit ettiniz sayı "+enteredNumber+" idi.");
                break;
            }
            else if (enteredNumber < randomNumber ){
                System.out.println("Tahmin edilecek sayı girdiğiniz sayıdan daha büyüktür");
                System.out.println("Kalan hakkınız: "+(right-i));
            }
            else{
                System.out.println("Tahmin edilecek sayı girdiğiniz sayıdan daha küçüktür");
                System.out.println("Kalan hakkınız: "+(right-i));
            }
            if(i==5){
                System.out.println("Kaybettiniz, sayı: "+randomNumber+" olması gerikiyordu.");
            }
        }
        System.out.println("Girdiğiniz numaralar: "+Arrays.toString(q));
    }
}