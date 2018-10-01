public class SentenceLenth {
    public static void main(String[] args){
        String s="haii how are you";
        Countchar(s);

    }
    public static void Countchar(String s)
    {
        String s1=s.replaceAll(" ","");

        System.out.println((s1+" "+s1.length()));
    }
}
