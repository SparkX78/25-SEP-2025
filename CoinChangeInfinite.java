public class CoinChangeInfinite {
    public static int sumcoins(int[] nums, int n, int sum){
        if(sum == 0){
            return 1;
        }
        if(sum < 0){
            return 0;
        }
        if(n==0 && sum > 0){
            return 0;
        }
        int ways = sumcoins(nums,n-1, sum) + sumcoins(nums,n, sum - nums[n-1]);
        return ways;
    }
    public static void main(String args[]){
        int[] nums = {2,1,5,6};
        int sum = 8;
        System.out.println(sumcoins(nums,nums.length , sum));
    }
}
