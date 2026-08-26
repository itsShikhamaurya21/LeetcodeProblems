class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(n!=1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            n=sumofsquares(n);
        }
        return true;
    }
    public static int sumofsquares(int n){
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum=sum+ld*ld;
            n/=10;
        }
        return sum;
    }
}