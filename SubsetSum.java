public class SubsetSum {
    public static boolean subsetSum(int[] nums, int n, int sum){
        if(n == 0){
            return (sum == 0)? true: false;
        }
        if(nums[n-1] > sum){
            return subsetSum(nums, n-1, sum);

        }
        return subsetSum(nums, n-1, sum)|| subsetSum(nums, n-1, sum-nums[n-1]);
            
        
    }
    public static void main(String[] args) {
        int[] nums = {2,3,5,8,11};
        int sum = 1;
        System.out.println(subsetSum(nums, nums.length, sum));
    }
}
