public class XOR_valueOfSubarray {
    public static void main(String[] args) {
        int[] arr={1,5,6};
        System.out.println(subsetXORSum(arr));
    }

    //1863. Sum of All Subset XOR Totals
    public static  int subsetXORSum(int[] nums) {

        int ans = 0;
        int n = nums.length;

        for (int el : nums) {
            ans |= el;
        }

        return ans<< (n - 1);
    }
}
