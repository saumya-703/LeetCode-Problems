import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Code_2799{
    //Finding Distinct element 
    public static int distinct(int [] arr){
        HashSet<Integer> ht= new HashSet<>();
        for(int i: arr){
            ht.add(i);
        }
        int count = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        int left = 0;

        // Iterate with the right pointer
        for (int right = 0; right < n; right++) {
            freqMap.put(nums[right], freqMap.getOrDefault(nums[right], 0) + 1);

            // If the window contains all distinct elements, try to shrink the window from the left
            while (freqMap.size() == totalDistinct) {
                count += (n - right);  // Every subarray from [left, right] to [left, n-1] is a valid subarray
                freqMap.put(nums[left], freqMap.get(nums[left]) - 1);
                if (freqMap.get(nums[left]) == 0) {
                    freqMap.remove(nums[left]);
                }
                left++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int [] arr= {1,3,1,2,2};
        System.out.println(distinct(arr));
    }
}