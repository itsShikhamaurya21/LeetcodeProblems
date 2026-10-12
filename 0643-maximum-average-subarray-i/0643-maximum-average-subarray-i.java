class Solution {
    public double findMaxAverage(int[] nums, int k) {



        double sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        int i=k;
        double max=sum;
        while( i>=k&&i<nums.length){
            sum=sum+nums[i]-nums[i-k];
            max=Math.max(max,sum);
            i++;
        }
        return max/k;

        // time complexity-- O(n)
    }
}