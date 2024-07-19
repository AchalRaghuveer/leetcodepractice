
public class Prac20 {
	
	
	class Solution {
	    public boolean isSubsequence(String s, String t) {


	        for(int i=0; i<s.length(); i++) {
	            char chOfs = s.charAt(i);
	            if(t.contains(String.valueOf(chOfs))) {
	                int indexOfChar = t.indexOf(chOfs);
	                t = t.substring(indexOfChar+1);
	            } else {
	                return false;
	            }
	             
	        }
	        return true;
	    }
	}

}
