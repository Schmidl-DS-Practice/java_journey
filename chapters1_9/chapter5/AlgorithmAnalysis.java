package chapter5;

/**
 * AlgorithmAnalysis
 */
public class AlgorithmAnalysis {

    public static void main() {
        int [] a = {7};
        maxSubsequenceSum(a);
    }

    public static int maxSubsequenceSum(int[] a) {
        int maxSum = 0;
        for(int i = 0; i < a.length; i++)
            for (int j = i; j < a.length; j++){
                int thisSum = 0;
                for (int k = i; k <= j; k++)
                    thisSum += a[k];
                if (thisSum > maxSum){
                    maxSum = thisSum;
                    int seqStart = i;
                    int seqEnd = j;
                }
            }
            return maxSum;
    }

    public static void name() {

    }

}