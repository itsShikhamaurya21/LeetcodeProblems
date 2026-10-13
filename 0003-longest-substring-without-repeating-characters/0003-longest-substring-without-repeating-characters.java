class Solution {
    public int lengthOfLongestSubstring(String str) {
        int max=0;
        int arr[]=new int[128];
        int j=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            arr[ch]++;
            while(arr[ch]>1){
                arr[str.charAt(j)]--;
                j++;
            }
                max= Math.max(max,i-j+1);
            
        }
        return max;
    }
}