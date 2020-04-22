/**
Question: Given a non-empty array of integers, every element appears twice except for one. Find that single one.
Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:
Input: [2,2,1]
Output: 1

Example 2:
Input: [4,1,2,1,2]
Output: 4
*/

//SOLUTION - Linear 0(n) Time Complexity.

class Solution {
    public int singleNumber(int[] nums) {
        
        HashSet<Integer> numberSet =  new HashSet <Integer>();
        
            for(int i:nums){
                if(numberSet.contains(i)) {
                    numberSet.remove(i);
                }
                else {
                    numberSet.add(i);
                }
            }
       
        for(int i:numberSet){
            return i;
        }
        
        return -1;
    }
}
