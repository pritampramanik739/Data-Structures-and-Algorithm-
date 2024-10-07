import java.util.*;

public class Striver_Math {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(Character.toUpperCase('a'));
        String str = "ABcdEF";
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            str2 += Character.toUpperCase(str.charAt(i));
        }
        System.out.println(str2);

    }

    public static void CountDigit(int n) {
        int k = (int) Math.log10(n) + 1;
        System.out.println(k);
    }

    public static void PrintDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void PrintDivisors2(int n) {
        ArrayList<Integer> divisor = new ArrayList<>();
        int k = (int) Math.sqrt(n);
        for (int i = 1; i <= k; i++) {
            if (n % i == 0) {
                divisor.add(i);
                if (i != n / i) {
                    divisor.add(n / i);
                }
            }
        }
        Collections.sort(divisor);
        for (int p : divisor) {
            System.out.print(p + " ");
        }
    }

    // colourful stone   [A. Colorful Stones (Simplified Edition)---> Codeforces]
    public static void ColorfulStone() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); // Stones sequence
        String t = scanner.nextLine(); // Instructions sequence

        int position = 0; // Start from the first stone (0-based index)

        for (char instruction : t.toCharArray()) {
            // Ensure we do not go out of bounds before checking the stone color
            if (position < s.length() && s.charAt(position) == instruction) {
                position++; // Move to the next stone
            }
        }

        System.out.println(position + 1); // Output final position (1-based index)
        scanner.close();
    }

    // check perfect square
    public static int countPerfectSquares(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isPerfectSquare(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        return (sqrt * sqrt == num);
    }

    // minimum penalty [given array then minimise the avalue of the sum of diffences between to adjacent numbers]
    public static int MinimumPwenalty(int arr[]) {
        Arrays.sort(arr);
        int k = 0;
        for (int i = 1; i < arr.length; i++) {
            k += (int) Math.abs(arr[i] - arr[i - 1]);
        }
        return k;
    }

    // happy number square[GFG]
    public static int numSquareSum(int n) {
        int num = 0;
        while (n != 0) {
            int digit = n % 10;
            num += digit * digit;
            n /= 10;
        }
        return num;
    }
    static boolean isHappyNumber(int n) {
        HashSet<Integer> st = new HashSet<>();
        while (true) {
            n = numSquareSum(n);
            if (n == 1)
                return true;
            if (st.contains(n))
                return false;
            st.add(n);
        }
    }

    // chocolate[GFG -->Chocolate Distribution Problem]
    public int findMinDiff(ArrayList<Integer> a, int n, int m) {
        Collections.sort(a);
        int minDiff = Integer.MAX_VALUE;
        for (int i = m - 1; i < n; i++) {
            minDiff = Math.min(minDiff, a.get(i) - a.get(i - m + 1));
        }
        return minDiff;
    }

    // lucky or not[ram thinks 4&7 are his lucky number and those number are completely divisible by those number are called      almost lucky number]
    public static boolean isAlmostLucky(int N) {
        int[] luckyNumbers = { 4, 7, 47, 74, 447, 474, 744, 777 }; // Common small lucky numbers
        for (int lucky : luckyNumbers) {
            if (N % lucky == 0) {
                return true;
            }
        }
        return false;
    }

}
