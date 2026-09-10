class Solution{
    public int[] twoSum(int arr[],int target){
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]+arr[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{-1,-1};

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int tar=target-arr[i];
            if(map.containsKey(tar)){
                return new int[]{map.get(tar),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}