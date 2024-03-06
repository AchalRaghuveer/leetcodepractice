public class Prac14 {

    public boolean isPalindrome(int x) {

        String xS = ""+x;
        for(int i=0, j=xS.length() -1; i<xS.length(); i++,j--){
            if(xS.charAt(i) != xS.charAt(j)){
                return false;
            }
        }
        return true;

    }

}
