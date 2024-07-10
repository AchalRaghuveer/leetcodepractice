
public class Prac19 {
	
	class Solution {
	    public boolean isValid(String s) {

	        String[] sArray = s.split("");

	        Stack<String> st = new Stack<>();

	        for(int i=0; i< sArray.length; i++){
	            switch(sArray[i]){
	                case ")": if(!st.isEmpty()){
	                    String closeValue = st.pop();
	                if(!closeValue.equals("(")) {
	                    return false;
	                }
	                } else {
	                    return false;
	                }
	                break;
	                case "}": if(!st.isEmpty()){
	                    String closeValue1 = st.pop();
	                if(!closeValue1.equals("{")) {
	                    return false;
	                }
	                } else {
	                    return false;
	                }
	                break;
	                case "]": if(!st.isEmpty()){
	                    String closeValue2 = st.pop();
	                if(!closeValue2.equals("[")) {
	                    return false;
	                }
	                } else {
	                    return false;
	                }
	                break;
	                default : st.push(sArray[i]);
	            }


	        }
	        return st.isEmpty();
	        
	    }
	}

}
