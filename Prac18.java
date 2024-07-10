
public class Prac18 {

	class Solution {
	    public int romanToInt(String s) {
	        int ans = 0;
	        String[] sArray = s.split("");
	        for(int i=sArray.length - 1; i>=0; i--){
	            String r = sArray[i];
	            switch(r){
	                case "I":
	                    ans += 1;
	                    break;
	                case "V":
	                    if(i > 0){
	                        if(sArray[i-1].equals("I")){
	                        i--;
	                        ans += 4;
	                    } else {
	                        ans += 5;
	                    }
	                    } else {
	                        ans += 5;
	                    }
	                    break;
	                case "X":
	                    if(i > 0){
	                        if(sArray[i-1].equals("I")){
	                        i--;
	                        ans += 9;
	                    } else {
	                        ans += 10;
	                    }
	                    } else {
	                        ans += 10;
	                    }
	                    break;
	                case "L":
	                    if(i > 0){
	                        if(sArray[i-1].equals("X")){
	                        i--;
	                        ans += 40;
	                    } else {
	                        ans += 50;
	                    }
	                    } else {
	                        ans += 50;
	                    }
	                    break;
	                case "C":
	                    if(i > 0){
	                        if(sArray[i-1].equals("X")){
	                        i--;
	                        ans += 90;
	                    } else {
	                        ans += 100;
	                    }
	                    } else {
	                        ans += 100;
	                    }
	                    break;
	                case "D":
	                    if(i > 0){
	                        if(sArray[i-1].equals("C")){
	                        i--;
	                        ans += 400;
	                    } else {
	                        ans += 500;
	                    }
	                    } else {
	                        ans += 500;
	                    }
	                    break;
	                case "M":
	                    if(i > 0){
	                        if(sArray[i-1].equals("C")){
	                        i--;
	                        ans += 900;
	                    } else {
	                        ans += 1000;
	                    }
	                    } else {
	                        ans += 1000;
	                    }
	                    break;
	                 
	            }

	        }
	                    return ans;

	    }
	}
	
}
