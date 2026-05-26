class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int n : nums){
            hm.put(n, hm.getOrDefault(n,1)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> hm.get(a)-hm.get(b)
        );
        for(int i : hm.keySet()){
            pq.add(i);
            if(pq.size()>k) pq.poll();
        }
        for(int i=k-1;i>=0;i--){
            res[i]=pq.poll();
        }
        return res;
    }
}
