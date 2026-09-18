class Solution {
    public static int removeDuplicates(int[] nums) {
        // int k=1;
        // nums[0]=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]!=nums[i-1]){
        //         nums[k]=nums[i];
        //         k++;
        //     }
        // }
        // return k;

        int count=1;
        int k=0;
        int i=1;
        while(i<nums.length){
            if(nums[i]==nums[i-1]){
                i++;
                continue;
            }
            nums[k+1]=nums[i];
            i++;
            k++;
            count++;
        }
        return count;
}
}