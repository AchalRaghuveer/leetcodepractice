

public class Prac21 {
	
	class Solution {
	    public boolean canConstruct(String ransomNote, String magazine) {

	        for(int i=0; i<ransomNote.length(); i++) {
		            char chOfs = ransomNote.charAt(i);
		            if(magazine.contains(String.valueOf(chOfs))) {
		                int indexOfChar = magazine.indexOf(chOfs);
		                String t1Half = magazine.substring(0,indexOfChar);
	                    String t2Half = magazine.substring(indexOfChar+1);
	                    magazine = t1Half + t2Half;
		            } else {
		                return false;
		            }
		             
		        }
		        return true;
	        
	    }

}
