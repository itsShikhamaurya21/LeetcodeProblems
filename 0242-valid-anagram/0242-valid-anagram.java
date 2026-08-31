class Solution {
    public static boolean isAnagram(String str1, String str2) {
        if(str1.length()!=str2.length()) return false;
        // char[] arr1=str1.toCharArray();
        // char[] arr2=str2.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // for(int i=0;i<arr1.length;i++){
        //     if(arr1[i]!=arr2[i]) return false;
        // }
        // return true;
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(map.containsKey(ch)){
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }else{
                map.put(ch,1);
            }
        }
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            if(!map.containsKey(ch)) return false;
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0) map.remove(ch); //cleanup
        }
        return map.isEmpty();
    }

}