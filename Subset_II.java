import java.util.*;

public class Subset_II {
    public static List<List<Integer>> subsetNodup(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        duplicate_subset(nums, 0,result, new ArrayList<>());
        return result;
    }
    private static void duplicate_subset(int[] nums, int index, List<List<Integer>> result, List<Integer> temp){
        result.add(new ArrayList<>(temp));
            

        
        for(int i = index ; i < nums.length; i++){
            if(i > index && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            duplicate_subset(nums,index + 1, result, temp );
            temp.remove(temp.size() -1);
        }

    }
    public static void main(String args[]){
        int[] nums = {1,2,2};
        System.out.println(subsetNodup(nums));

    }
}
