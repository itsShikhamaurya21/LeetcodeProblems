class Solution {
    public int maxProduct(int[] nums) {
        // int max=Integer.MIN_VALUE;
        // int leftprod=1;
        // int rightprod=1;
        // for(int i=0;i<nums.length;i++){
        //     leftprod=leftprod*nums[i];
        //     rightprod=rightprod*nums[nums.length-1-i];
        //     if(max<leftprod) max=leftprod;
        //     if(max<rightprod) max=rightprod;
        //     if(leftprod==0) leftprod=1;
        //     if(rightprod==0) rightprod=1;
        // }
        // return max;

        int ans=nums[0];
        int maxEnd=nums[0];
        int minEnd=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2=maxEnd*nums[i];
            int v3=minEnd*nums[i];
            maxEnd=Math.max(v1,Math.max(v2,v3));
            minEnd=Math.min(v1,Math.min(v2,v3));
            ans=Math.max(ans,Math.max(maxEnd,minEnd));
        }
        return ans;
    }

   
}