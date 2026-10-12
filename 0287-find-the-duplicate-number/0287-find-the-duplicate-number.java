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
    // Arrays.sort(nums);
    // for(int i=1;i<nums.length;i++){
    //     if( nums[i]==nums[i-1]){
    //         return nums[i];
    //     }

    // }
    // return -1;
    // here tc--O(n2) and space=O(1)

    // with hashset
    // HashSet<Integer> set = new HashSet<>();
    // for(int i=0;i<nums.length;i++){
    //     if(set.contains(nums[i])){
    //         return nums[i];
    //     }
    //     set.add(nums[i]);
    // }
    // return -1;
    // here time -- O(n)
    // and space -- O(n)

    // by using slow and fast rule that is applied only if the cycle exist
    int slow=nums[0];
    int fast=nums[0];
    while(true){
        slow=nums[slow];
        fast=nums[fast];
        fast=nums[fast];
        if(slow==fast){
            slow=nums[0];
            while(slow!=fast){
                slow=nums[slow];
                fast=nums[fast];
            }
            return slow;
        }
    }

}
}