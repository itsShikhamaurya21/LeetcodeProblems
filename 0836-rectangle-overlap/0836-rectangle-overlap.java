class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // int rec3[]=new int[rec1.length];
        // int k=0;
        // for(int i=0;i<rec1.length;i++){
        //     rec3[k++]=Math.abs(rec1[i]+rec2[i]);
        // }
        // for(int i=1;i<rec3.length;i++){
        //     if(rec3[i]==rec3[i-1]) return true;
        // }
        // return false;

        if((rec1[0]<rec2[2]) && rec1[2]>rec2[0] && rec1[1]<rec2[3] && rec1[3]>rec2[1] ) return true ;
        return false;
    }
}