public class Prac9 {
    public boolean isHappy(int n) {
        Stack<Integer> stack = new Stack<Integer>();
        return rec(n, stack);

    }

    public boolean rec(int n, Stack<Integer> stack) {
        boolean isHappy = true;
        String numbers = Integer.toString(n);
        int temp=0;
        for(int i=0; i<numbers.length(); i++) {
            temp = temp + (Integer.parseInt(String.valueOf(numbers.charAt(i)))*Integer.parseInt(String.valueOf(numbers.charAt(i))));
        }
        System.out.println(isHappy+" "+temp+" "+stack);
        if(stack.search(temp) == -1){
            stack.push(temp);
            isHappy = rec(temp, stack);
        } else {
            isHappy = temp == 1 ? true : false;
        }
        return isHappy;
    }
}
