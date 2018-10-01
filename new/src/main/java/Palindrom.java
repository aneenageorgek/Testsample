public class Palindrom {
    public static void main(String[] args){
        String s="aneena";
        palindromCheck(s);

    }
    public static void palindromCheck(String s){
        String revers="";
        for(int i=s.length()-1;i>=0;i--){
            revers=revers + s.charAt(i);

        }
        if(revers.equals(s)) {
            System.out.println("palindrom");
        }
        else {
                System.out.println("Not palindrom");
        }

    }
}
