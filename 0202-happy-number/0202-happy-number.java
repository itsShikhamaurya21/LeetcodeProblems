class Solution {
    public boolean isHappy(int n) {
        // HashSet<Integer> set=new HashSet<>();
        // while(n!=1){
        //     if(set.contains(n)){
        //         return false;
        //     }
        //     set.add(n);
        //     n=sumofsquares(n);
        // }
        // return true;  //TC=O(logn) SC=O(n)

        // Floyd detection algorithm
        int slow=n,fast=n;
        while(true){
            slow=sumofsquares(slow);
            fast=sumofsquares(sumofsquares(fast));
            if(fast==1) return true;
            if(slow==fast) return false;
        }
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