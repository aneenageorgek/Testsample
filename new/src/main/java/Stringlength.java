public class Stringlength {

    public static void main(String[] args){
        String s="hai how are you";
        count(s);
    }
    public static void count(String s){
        String[] s1=s.split(" ");

//Print last string and its length

        System.out.println(s1[s1.length -1]);
        System.out.println(s1[s1.length-1].length());
    }
}
