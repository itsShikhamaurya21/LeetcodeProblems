class Solution {
    public boolean uniformArray(int[] nums1) {
       int nums2[]=new int[nums1.length];
       int j=0;
       for(int i=0;i<nums1.length;i++){
            if(i!=j && nums1[0]%2==0){
                nums2[j]=nums1[i]-nums1[i+1];
            }else{
                nums2[j]=nums1[i];
            }
            j++;
       } 
       for(int i=0;i<nums2.length;i++){
        if(nums2[i]%2==0){
            return true;
        }
        else {
            return true;
        }
       }
       return false;
    }
}