import java.util.Scanner;
public class OrtakSayilarinOrtalamasi {
    public static void main(String[] args) {
        //Average of numbers divisible by 3 and 4
        Scanner input=new Scanner(System.in);
        int a,i,b=0,c=0;
        System.out.print("please enter a number(pozitive and integer): ");
        a= input.nextInt();
        if(a>0){
            for (i=1;i<=a;i++){
                if(!(i%3==0&&i%4==0))continue;
                ++b;
                c=c+i;
            }
            System.out.println(c/b);
        }else System.out.println("wrong number entry");
    }
}
