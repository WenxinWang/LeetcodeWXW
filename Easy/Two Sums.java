class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int y = target-nums[i];
            if(map.containsKey(y) && map.get(y)!=i){
                return new int[] { i, map.get(y)};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum result.");
    }
}

/**
* Run Code Status: Finished
* Attention:
*   1. new HashMap();
*   2. numbers.length, no();
*   3. IllegalArgumentException, Argument not Arguement;
*   4. "and you may not use the same element twice." -> && map.get(y)!=i
*1st Run Date: Sep 25th, 2017.
*/
