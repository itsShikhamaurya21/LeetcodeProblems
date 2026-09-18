class Solution {
    public static String reverseWords(String s) {
    int right=s.length()-1;
    String str="";
    
    while(right>=0){
        while(right>=0 && s.charAt(right)==' '){
            right--;
        }
        String word="";
        while(right>=0 && s.charAt(right)!=' '){
            word=s.charAt(right)+word;
            right--;
        }
        if(!word.isEmpty()){
            if(!str.isEmpty()){
                str=str+" ";
            }
            str=str+word;
        }
    }
    return str;
}
}