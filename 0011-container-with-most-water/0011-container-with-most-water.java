class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int low=0;
        int high=height.length-1;
        while(low<=high){
            int width=high-low;
            if(height[low]<height[high]){
                int area=height[low]*width;
                max=Math.max(max,area);
                low++;
            }else{
                int area=height[high]*width;
                max=Math.max(max,area);
                high--;
            }
            
        }
        return max;
    }
}