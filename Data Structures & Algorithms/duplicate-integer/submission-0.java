class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int n : nums){
            if(hm.containsKey(n)) return true;
            hm.put(n,0);
        }
        return false;
    }
}