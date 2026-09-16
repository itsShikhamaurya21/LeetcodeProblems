class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int freq=map.get(nums[i]);
                map.put(nums[i],freq+1);
            }else{
                map.put(nums[i],1);
            }
        }
        
            for(int freq: map.values()){
            if(isPrime(freq)){
                return true;
            }
        }
        
        return false;
    }
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}