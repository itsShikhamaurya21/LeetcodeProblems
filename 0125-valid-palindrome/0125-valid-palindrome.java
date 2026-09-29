class Solution {
    public static boolean isPalindrome(String s) {
    //     str=str.toLowerCase();
    //     int i=0,j=str.length()-1;
    // //  str=str.replaceAll([0,],"");
    // // for(int i=str.length()-1;i>=0;i++){
    // //     rev=rev+str.charAt(i);
    // // }
    // // if(rev.equals(str)){ 
    // //     return true;
    // // }
    // while(i<j){
        
    //     while (i<j && !Character.isLetterOrDigit(str.charAt(i))) i++;
    //     while(i<j && !Character.isLetterOrDigit(str.charAt(j))) j--;
    //     if(str.charAt(i)!=str.charAt(j)){
    //         return false;
    //     }  
    //     i++;
    //     j--;
    // }

    // return true;

    // approach -- this approach has O(n2) time complexity
    // convert the string into lowercase
    //  s=s.toLowerCase();
    // //  remove all the space
    // s=s.replaceAll("[^a-z0-9]","");
    
    //  String rev="";
    //  for(int i=s.length()-1;i>=0;i--){
    //     rev=rev+s.charAt(i);
    //  }
    //  if(!rev.equals(s))
    //  return false;
    //  return true;

    // this approach has O(n)  time complexity
    s=s.toLowerCase();
    //  remove all the space
    s=s.replaceAll("[^a-z0-9]","");
    int i=0;
    int j=s.length()-1;
    while(i<j){
        if(s.charAt(i)!=s.charAt(j)) return false;
        i++;
        j--;
    }
    return true;
}
}