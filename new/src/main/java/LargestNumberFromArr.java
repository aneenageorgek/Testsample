import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class LargestNumberFromArr {
    public static void main(String[] args) {
        List<String> arr;
        arr = new ArrayList<String>();

        //output should be 6054854654
        arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");
        new LargestNumberFromArr().printLargest(arr);
        for (int i=0; i< arr.size(); i++){
            System.out.print(arr.get(i));
        }
    }

    private void printLargest(List<String> arr) {
        Collections.sort(arr, new Compare());
    }

    class Compare implements Comparator<String> {

        @Override
        public int compare(String x, String y) {
            String xy = x+y;
            String yx = y+x;
            return xy.compareTo(yx) > 0 ? -1 :1;
        }
    }
}

