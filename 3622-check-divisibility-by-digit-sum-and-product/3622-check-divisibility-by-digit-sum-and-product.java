class Solution {
    public boolean checkDivisibility(int n) {
        int N=n;
        int sum=0;
        int prod=1;
        while(N>0){
            int ld=N%10;
            sum=sum+ld;
            prod=prod*ld;
            N=N/10;

        }
        if(n%(sum+prod)==0) return true;
        return false;
}
}