public class Prac5 {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for(int i=0;i< moves.length(); i++){
            if(moves.charAt(i) == 'U') {
                y++;
            } else if(moves.charAt(i) == 'D') {
                y--;
            } else if(moves.charAt(i) == 'L') {
                x--;
            } else {
                x++;
            }
        }
        boolean val = false;
        if(x == 0 && y == 0) {
            val= true;
        }
        return val;

    }
}
