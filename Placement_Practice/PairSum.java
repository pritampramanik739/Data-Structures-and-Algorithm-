import java.util.HashSet;
import java.util.Set;

public class PairSum {

    public static void main(String[] args) {
        int[] numbers = {1, 4, 3, 2, 5, 7}; // Example array
        int sum = 8; // Target sum

        printPairsWithSum(numbers, sum);
    }
    public static void printPairsWithSum(int[] arr, int sum) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(sum - num)) {
                System.out.println("(" + (sum - num) + ", " + num + ")");
            }
            seen.add(num);
        }
    }
}
