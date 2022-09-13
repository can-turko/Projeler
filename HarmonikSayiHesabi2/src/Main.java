public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        double sum=0.0;
        for(int i : numbers){
            sum = sum + 1.0/i;
        }
        System.out.println("Harmonic Average : " + numbers.length / sum);
    }
}
