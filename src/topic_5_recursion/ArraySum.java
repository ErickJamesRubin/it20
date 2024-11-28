package topic_5_recursion;
import java.util.Scanner;

public class ArraySum {
    public int sum(int[] arr, int n) {

        if (n <= 0) {
            return 0;
        }

        // Recursive case: sum of the last element and the sum of the rest
        return arr[n - 1] + sum(arr, n - 1);
    }
    
    
    
}
