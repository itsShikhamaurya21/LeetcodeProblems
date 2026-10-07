class Solution {
    public int lengthOfLongestSubstring(String str) {
        int max=0;
        
        int arr[]=new int [128];
        int left=0;
        for(int right=0;right<str.length();right++){
            char ch=str.charAt(right);
            arr[ch]++;
            while(arr[ch]>1){
                arr[str.charAt(left)]--;
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}