class Solution {
    public static int[] sortedSquares(int[] arr) {
        int k=0;
        int l=0;
        
        int neg[]=new int[arr.length];
        int pos[]=new int[arr.length];
        int negCount = 0, posCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                pos[posCount++]=arr[i];
            }else{
                neg[negCount++]=arr[i];
            }
        }
        for(int i=0;i<negCount;i++){
            neg[k]=neg[i]*neg[i];
            k++;
        }
        for(int i=0;i<posCount;i++){
            pos[l]=pos[i]*pos[i];
            l++;
        }
        int i=0;
        int j=negCount-1;
        while(i<j){
            int temp=neg[i];
            neg[i]=neg[j];
            neg[j]=temp;
            i++;
            j--;
        }
        int a=0;
        int b=0;
        int m=0;
        int res[]=new int[arr.length];
        while(a<negCount && b<posCount){
            if(neg[a]<=pos[b]){
                res[m]=neg[a];
                m++;
                a++;
            }else{
                res[m]=pos[b];
                m++;
                b++;
            }
        }
        while (a < negCount) {
    res[m++] = neg[a++];
}
while (b < posCount) {
    res[m++] = pos[b++];
}
        
        
    return res;
    
}
}