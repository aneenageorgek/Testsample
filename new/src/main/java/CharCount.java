
/*hello hai come*/
public class CharCount {
    public static void main(String[] args)
    {
        String str="hello how are you";
        count(str);
    }
    public static void count(String str)
    {
            char[] ch= str.toCharArray();
            String s="";
            //each word selecting with seperating space
            for(int i=0;i<ch.length;i++) {
                while ( i<ch.length &&ch[i] != ' '){
                    s = s + ch[i];
                    i++;
                }
            }
        System.out.println(s +" " +s.length());
    }


}
