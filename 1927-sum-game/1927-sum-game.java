class Solution {
    public boolean sumGame(String num) {
       int leftsum=0;
       int rightsum=0;
       int leftQ=0;
       int rightQ=0;
       int n=num.length();
       for(int i=0;i<n/2;i++){
        if(num.charAt(i)=='?'){
            leftQ++;
        }else{
            leftsum=leftsum+(num.charAt(i)-'0');
        }
        if(num.charAt(n-1-i)=='?'){
            rightQ++;
        }else{
            rightsum=rightsum+(num.charAt(n-1-i)-'0');
        }
       } 
       int diff=leftsum-rightsum;
       int diffq=rightQ-leftQ;
       return Math.abs(diffq) % 2 == 1
       || diff !=9 * diffq / 2;
    }
}