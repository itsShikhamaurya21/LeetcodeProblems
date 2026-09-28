class Solution {
    public int[] searchRange(int[] nums, int tar) {
        int first=findFirst(nums,tar);
        int last=findLast(nums,tar);
        return new int[]{first,last};
        
    }
    public static int findFirst(int nums[],int tar){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==tar) {
                ans=mid;
                high=mid-1;
            }
            else if(nums[mid]>tar){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
        public static int findLast(int nums[],int tar){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==tar){

            ans= mid;
            low=mid+1;
            }
            else if(nums[mid]>tar){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}