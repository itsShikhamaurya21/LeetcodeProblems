class Solution {
    public int findDuplicate(int[] nums) {
        // int n=nums.length;
        // int i=0;
        
        // while(i<n){
        //     if(nums[i]==i+1) i++;
        //     else {
        //         int idx=nums[i]-1;
        //         if(nums[i]==nums[idx]){
        //             return nums[i];
        //         }
        //         int temp=nums[i];
        //         nums[i]=nums[idx];
        //         nums[idx]=temp;
                
        //     }
        // }
        // return -1;
    // Brute Force
    // Approach
    // 1. sort the array
    // 2. and then check the duplicates 
    Arrays.sort(nums);
    for(int i=1;i<nums.length;i++){
        if( nums[i]==nums[i-1]){
            return nums[i];
        }

    }
    return -1;
}
}