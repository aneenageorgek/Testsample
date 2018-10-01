public class MaxSubArray {

    public static void main(String[] args) {
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        int startIndex = 0;
        int endIndex = 0;
        int maxSum = 0;
        int maxSoFar = 0;
        for (int i =0 ; i < a.length; i++) {
            maxSoFar = maxSoFar + a[i];

            if (maxSum < maxSoFar){
                if (startIndex == 0)
                    startIndex = i;
                endIndex = i;
                maxSum = maxSoFar;
            }

            if (maxSoFar < 0) {

                startIndex = 0;
                maxSoFar = 0;
                continue;
            }
        }
        System.out.println (maxSum + " " + startIndex + " " + endIndex );
    }
}
