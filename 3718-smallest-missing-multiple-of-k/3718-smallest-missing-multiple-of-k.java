class Solution {
    public int missingMultiple(int[] nums, int k) {
        // HashSet<Integer> set=new HashSet<>();
        // for(int num : nums){
        //     set.add(num);

        // }
        // int multiple=k;
        // while(set.contains(multiple)){
        //     multiple+=k;
        // }
        // return multiple;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int multiple=k;
        while(map.containsKey(multiple)){
            multiple+=k;
        }
        return multiple;
    }
}