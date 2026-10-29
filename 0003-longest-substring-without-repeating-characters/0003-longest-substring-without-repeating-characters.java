class Solution {
    public int lengthOfLongestSubstring(String s) {


        int max=0;
        int j=0;
        int arr[]=new int[128];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch]++;
            while(arr[ch]>1){
                arr[s.charAt(j)]--;
                j++;
            }
            max=Math.max(max,i-j+1);
        }
        return max;

    }
}