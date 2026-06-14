class Solution {
    private long fun(int[] a, int k){
        long h=0;
        for(int i=0;i<a.length;i++){
            h += a[i]/k;
            if(a[i]%k!=0) h++;
        }
        return h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>high) high=piles[i];
        }
        int res=-1;
        while(low<=high){
            int mid = (low+high)/2;
            long hour = fun(piles, mid);
            if(hour>h) low=mid+1;
            else {
                res=mid;
                high=mid-1;
            }
        }
        return res;
    }
}