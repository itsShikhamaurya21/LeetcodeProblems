class Solution {
    public int subarraySum(int[] nums, int k) {
        // int count=0;
        // int max=0; 
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum==k){
        //            max=Math.max(max,j-i+1);
        //         }
        //     }
        // }
        // return max;

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int freq=sum-k;
            if(map.containsKey(freq)){
                count+=map.get(freq);
            } 
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}