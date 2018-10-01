public class Linereverse {

    public static void main(String[] args) {
        String s = "hai how are you ok";
        Reversestring(s);
    }

    public static void Reversestring(String s) {
        String[] s1 = s.split(" ");
        for (int i = s1.length - 1; i >= 0; i--) {
            System.out.print((" "+s1[i]));
        }
    }
}
