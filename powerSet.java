import java.util.*;

public class powerSet {
    public static List<List<Integer>> subset(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        findSubset(result,nums,0,new ArrayList<>());
        return result;
    }
    private static void findSubset(List<List<Integer>> result, int[] nums, int index, List<Integer> temp){
        if(index == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        findSubset(result, nums, index+1, temp);
        temp.add(nums[index]);
        findSubset(result, nums, index+1, temp);
        temp.remove(temp.size()-1);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subset(nums));
    }
}
