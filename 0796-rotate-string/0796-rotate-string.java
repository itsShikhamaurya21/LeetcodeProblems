class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        // if(s.length()==1 && goal.length()==1 && ) return true;
        String str=s+s;
        return str.contains(goal);
    }
}