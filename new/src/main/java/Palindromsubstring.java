public class Palindromsubstring {
    public static void main(String[] args) {
        String s = "abababababdfaba";
        Palindromsub(s);
    }

    public static void Palindromsub(String s) {
        int length=0;
        String longestPalindrome = "";
        for (int i = 1; i <=s.length(); i++) {
            String s1 = s.substring(0, i);
            if (palinDromecheck(s1)){
                length = s1.length();
                longestPalindrome = s1;
            }

        }
        System.out.println("String: " + longestPalindrome + " length: "+length);

    }

    public static boolean palinDromecheck(String s1) {

        String actual = "";
        for (int j = s1.length() - 1; j >= 0; j--) {
            actual = actual + s1.charAt(j);
        }
        if (actual.equals(s1)) {
            return true;
        }
        return false;
    }
}
