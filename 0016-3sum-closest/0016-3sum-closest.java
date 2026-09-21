class Solution {
    public static int threeSumClosest(int[] nums, int target) {
        // int closestsum=nums[0]+nums[1]+nums[2];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         for(int k=j+1;k<nums.length;k++){
        //             int sum=nums[i]+nums[j]+nums[k];
        //             if(Math.abs(closestsum-target)>Math.abs(sum-target)){
        //                 closestsum=sum;
        //             }
        //         }
        //     }
        // }
        // return closestsum;
       Arrays.sort(nums);
        int closestSum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){

            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];

                if(Math.abs(sum-target)<Math.abs(closestSum-target)) closestSum=sum;
                if(sum==target){
                    return sum;

                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return closestSum;
}
}