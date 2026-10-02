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

        int slow=0;
        int fast=0;
        while(true){
            slow=nums[slow];
            fast=nums[fast];
            fast=nums[fast];
            if(slow==fast){
                slow=0;
                while(slow!=fast){
                    slow=nums[slow];
                    fast=nums[fast];

                }
                return slow;
            }
        }
       
    }
}