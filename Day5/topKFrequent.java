package Day5;
import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        System.out.println("Hashmap: "+hm);
        
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int key : hm.keySet()) {
            int freq = hm.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        // Print the bucket elements
        System.out.println("Bucket contents:");
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] != null) {
                System.out.print("Bucket " + i + ": ");
                for (int j = 0; j < bucket[i].size(); j++) {
                    System.out.print(bucket[i].get(j) + " ");
                }
                System.out.println();
            }
        }

        int[] ans = new int[k];
        int pos = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (int j = 0; j < bucket[i].size() && pos < k; j++) {
                    ans[pos] = bucket[i].get(j);
                    pos++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {5,5,5, 5, 5, 9, 9,9,8,8,8,7};
        int k = 2;
        int[] result = solution.topKFrequent(nums, k);
        System.out.println("Top K frequent elements: " + Arrays.toString(result));
    }
}
