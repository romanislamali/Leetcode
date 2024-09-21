import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMap {
    
    public int[] twosum(int[] arr, int target){
        int n = arr.length;
        int[] res = new int[2];
        int b = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            b = target-arr[i];
            if(map.containsKey(b)){
                res[0]=map.get(b);
                res[1]=i;   
                return res;
            }else{
                map.put(arr[i], i);
            }
        }

        return res;

    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        TwoSumHashMap map = new TwoSumHashMap();
        int[] result = map.twosum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}