import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[2];
        int b = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            b = target-nums[i];
            if(map.containsKey(b)){
                res[0]=map.get(b);
                res[1]=i;   
                return res;
            }else{
                map.put(nums[i], i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
    
}
