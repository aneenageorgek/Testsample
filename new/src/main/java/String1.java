public class String1 {
    public static void main(String[] args) {

    int editlength=0;
    String s = "pale";
    String s1 = "pal";
    int l = s.length();
    int l1 = s1.length();
    if (l>l1) {
        if (l - l1 > 1) {
            System.out.println("flase");
        } else {
            editlength = Lengtfind(s, s1);
        }
    }

    else {
            if (l1 - l > 1) {
                System.out.println("flase");
            } else {
                editlength = Lengtfind(s,s1);
            }
        }

    if(editlength>1)

        System.out.println("flse");
    else
        System.out.println("true");

    }

    public static int Lengtfind(String s,String s1)
    {
        int count=0;
        int j=0;

        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) != s1.charAt(j)) {
                count++;
                if (i < s.length() && j < s1.length() - 1 && s.charAt(i + 1) != s1.charAt(j)) {
                    j++;
                }
            }
        }
        return (count);


            }
        }

