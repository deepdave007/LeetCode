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