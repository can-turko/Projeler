public class Main {

    static boolean isPalindromik(String str) {
        int j = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != str.charAt(j)) return false;
            if (j == i) break;
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromik("aba") ? "Palindromik Kelimedir" : "Palindromik kelime değildir");
    }
}