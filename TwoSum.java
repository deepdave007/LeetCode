/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]. 

Runtime: 1 ms, faster than 99.96% of Java online submissions for Two Sum.
Memory Usage: 39.6 MB, less than 37.48% of Java online submissions for Two Sum. */




class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++ ){
            int difference = target - nums[i];
            if(map.containsKey(difference)) {
                result[0] = i;
                result[1] = map.get(difference);
                return result;
            }
            map.put(nums[i],i);
        }       
        return result;
    }
}
