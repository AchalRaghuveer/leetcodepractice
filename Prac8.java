public class Prac8 {
    public boolean backspaceCompare(String s, String t) {
        int index = 0;
        while(index < s.length()){
            if(index >0){
                if(s.charAt(index) == '#') {
                    String sub = ""+s.charAt(index-1)+s.charAt(index);
                    System.out.println(" inside if "+sub+" "+s+" "+index);
                    s = s.replace(sub, "");
                    index=index-3;
                }
            } else if(index == 0){
                if(s.charAt(index) == '#'){
                    s = s.substring(1);
                    index--;

                }
            }
            index++;
        }
        index = 0;
        while(index < t.length()){
            if(index >0){
                System.out.println("t val  "+t.charAt(index) + " " + index);
                if(t.charAt(index) == '#') {
                    String sub = ""+t.charAt(index-1)+t.charAt(index);
                    System.out.println(" inside if t "+sub+" "+t+" "+index);
                    t = t.replace(sub, "");
                    index=index-3;
                }
            } else if(index == 0){
                System.out.println("t val  else   "+t.charAt(index) + " " + index);
                if(t.charAt(index) == '#'){
                    t = t.substring(1);
                    index--;
                }
            }
            index++;
        }
        System.out.println(" hahah "+s+" "+t);
        return s.equals(t);

    }
}
