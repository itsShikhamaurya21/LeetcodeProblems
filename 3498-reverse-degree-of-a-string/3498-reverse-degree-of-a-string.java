class Solution {
    public int reverseDegree(String s) {
        // char str[]={'a','b','c'};
        // int index[]={26,25,24};
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
               int  val=26-(s.charAt(i)-'a');
                sum=sum+((i+1)*val);
            }
        }
    return sum;
    }
}