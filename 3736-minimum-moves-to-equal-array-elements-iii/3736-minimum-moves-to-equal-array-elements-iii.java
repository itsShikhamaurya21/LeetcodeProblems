class Solution {
    public int minMoves(int[] nums) {
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
            for(int j=0;j<nums.length;j++){
                count=count+max-nums[j];
            }

        
        return count;
    }
}