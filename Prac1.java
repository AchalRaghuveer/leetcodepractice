import java.util.Stack;

class Prac1 {
    public int evalRPN(String[] tokens) {

        int total = -1;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0; i<tokens.length; i++) {
            if(tokens[i].matches( "[*]" )) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                System.out.println("inside if divide "+num1+num2);
                total = num1 * num2;
                stack.push(total);
            } else if(tokens[i].matches( "/" )) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                System.out.println("inside if divide "+num1+num2);
                total = num1 / num2;
                stack.push(total);
            }
            else if(tokens[i].matches( "[+]" )) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                System.out.println("inside if + "+num1+num2);

                total = num1 + num2;
                stack.push(total);
            }
            else if(tokens[i].matches( "-" )) {

                int num2 = stack.pop();
                int num1 = stack.pop();
                System.out.println("inside if - "+num1+num2);
                total = num1 - num2;
                stack.push(total);
            } else {
                System.out.println("inside else"+tokens[i]);
                stack.push(Integer.parseInt(tokens[i]));
            }
        }

        total = stack.pop();
        return total;

    }
}