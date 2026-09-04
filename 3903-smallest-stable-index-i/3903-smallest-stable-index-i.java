class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if(nums.length==1){
            return 0;
        }
        int min=0;
        int max=0;
        int diff=0;
        for(int i=0;i<nums.length;i++){
            max=max(0,i,nums);
            min=min(i,nums.length,nums);
            diff=max-min;
            if(diff<=k){
                return i;
        }  
        }
        
        
    return -1;
        
    }
    public int min(int s,int e, int arr[]){
        int min=arr[s];
        for(int i=s;i<e;i++){
            if(arr[i]<=min){
                min=arr[i];
            }
        }
        return min;
    }

    public int max(int s,int e, int arr[]){
        int max=arr[s];
        for(int i=s;i<e;i++){
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        return max;
    }
}