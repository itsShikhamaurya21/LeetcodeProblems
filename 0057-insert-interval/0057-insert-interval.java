class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> list=new ArrayList<>();
        boolean isinsert=false;
        for(int i=0;i<intervals.length;i++){
            int start1=intervals[i][0];
            if(isinsert==false && start1>=newInterval[0]){
                list.add(Arrays.asList(newInterval[0],newInterval[1]));
                isinsert=true;
            }
            list.add(Arrays.asList(intervals[i][0],intervals[i][1]));
        }
        if(!isinsert){
    list.add(Arrays.asList(newInterval[0], newInterval[1]));
}

        

        int res[][]=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            res[i][0]=list.get(i).get(0);
            res[i][1]=list.get(i).get(1);
        }

        List<List<Integer>> arr=new ArrayList<>();
        int start1=res[0][0];
        int end1=res[0][1];
        for(int i=1;i<res.length;i++){
            int start2=res[i][0];
            int end2=res[i][1];
            if(start2<=end1){
                end1=Math.max(end1,end2);
            }else{
                arr.add(Arrays.asList(start1,end1));
                start1=start2;
                end1=end2;
            }
            
        }
        arr.add(Arrays.asList(start1,end1));
        int result[][]=new int[arr.size()][2];
        for(int i=0;i<arr.size();i++){
            result[i][0]=arr.get(i).get(0);
            result[i][1]=arr.get(i).get(1);
        }
        return result;
    }
}