//Justin Ramirez
//CSC 2720 Lab CS225
//Lab time: W 1300
//Due time: 4/23/2023 @ 11:59PM
import java.util.*;

public class TopKFrequentElements {
    /*
     * Test Cases:
     * TopKFrequentElements solution = new TopKFrequentElements();
     * int[] nums1 = {1, 1, 1, 2, 2, 3};
     * int[] result1 = solution.topKFrequent(nums1, 2);
     * System.out.println(Arrays.toString(result1)); // should print [1, 2]
     *
     * int[] nums2 = {1};
     * int[] result2 = solution.topKFrequent(nums2, 1);
     * System.out.println(Arrays.toString(result2)); // should print [1]
     *
     * int[] nums3 = {4, 1, -1, 2, -1, 2, 3};
     * int[] result3 = solution.topKFrequent(nums3, 2);
     * System.out.println(Arrays.toString(result3));
     */
    public int[] topKFrequent(int[] nums, int k) {
        // Count the frequency of each element in the array
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Use a PriorityQueue to keep track of the k most frequent elements
        PriorityQueue <Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry <Integer, Integer> entry : frequencyMap.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        // Add the k most frequent elements to the output array
        int[] result = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {
            result[i++] = pq.poll().getKey();
        }
        return result;
    }
}