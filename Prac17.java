
public class Prac17 {

	
	class Solution {
	    public int lengthOfLongestSubstring(String s) {

	        int maxLen = 0;
	        String longStr = "";
	        for(int i=0; i<s.length(); i++){

	            String charValue = Character.toString(s.charAt(i));

	            if(longStr.contains(charValue)){
	                int start = longStr.indexOf(charValue);
	                longStr = longStr.substring(start+1)+charValue;
	                
	            } else {
	                longStr = longStr + charValue;
	            }
	            System.out.println(longStr);
	            maxLen = longStr.length() > maxLen ? longStr.length() : maxLen;

	        }

	        return maxLen;
	        
	    }
	}
}
