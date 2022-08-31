public class RecursiveAsal {
    static void asal100(){
        int a=0;
        for(int i = 100;i>1;i--){
            for(int j = (i-1);j>1;j--){
                a=i%j;
                if(a==0){
                    break;
                }
            } if(a!=0) System.out.println(i);
        }
    }
    public static void main(String[] args) {
        asal100();

    }
}
