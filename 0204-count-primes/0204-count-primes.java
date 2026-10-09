class Solution {
    public int countPrimes(int n) {
        int count=1;
        if(n<3){
            return 0;
        }
       
        for(int i=3;i<n;i+=2){
             boolean isPrime=true;
            for(long j=3;j*j<=i;j+=2){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
            count++;
        }
        }
        
        return count;
    }
}