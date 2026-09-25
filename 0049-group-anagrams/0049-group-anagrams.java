class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String str=new String(ch);
            if(!map.containsKey(str)){
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(strs[i]);
        }
        ans.addAll(map.values());
        return ans;
    }
}