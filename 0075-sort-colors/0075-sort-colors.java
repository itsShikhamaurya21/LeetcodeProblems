class Solution {
    public void sortColors(int[] nums) {
        
        // int mid=0,high=nums.length-1,low=0;
        // while(mid<=high){
        //     if(nums[mid]==0){
        //         int temp=nums[mid];
        //         nums[mid]=nums[low];
        //         nums[low]=temp;
        //         mid++;
        //         low++;
        //     }else if(nums[mid]==1){
        //         mid++;
        //     }else{
        //         int temp=nums[mid];
        //         nums[mid]=nums[high];
        //         nums[high]=temp;
        //         high--;
        //     }
        // }

        int zero=0;
        int ones=0;
        int two=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zero++;
            else if(nums[i]==1) ones++;
            else two++;
        }
        int k=0;
       for(int i=0;i<zero;i++){
            nums[k++]=0;
        }
        for(int i=0;i<ones;i++){
            nums[k++]=1;
        }
        for(int i=0;i<two;i++){
            nums[k++]=2;
        }

            }
}