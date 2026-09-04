class Solution {
    public static int singleNumber(int[] arr) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i],map.get(arr[i])+1);
        }else{
            map.put(arr[i],1);
        }
       }
       if(arr.length==1){
        return arr[0];
       }else{
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                return arr[i];
            }
        }
       }
       return -1;
    }
}