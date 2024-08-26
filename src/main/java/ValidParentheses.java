import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String string = "{([])}";
        System.out.println(isValidParentheses(string));

    }

    public static boolean isValidParentheses(String s){

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != '(' && ch != '[' && ch != '{' && ch != ')' && ch != ']' && ch != '}'){
                continue;
            }

            if (ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
                continue;
            }
            if (stack.isEmpty()) return false;

            switch (ch){
                case ')':
                    if (stack.pop() != '(') return false;
                    break;
                case ']':
                    if (stack.pop() != '[') return false;
                    break;
                case '}':
                    if (stack.pop() != '{') return false;
                    break;
            }
        }

        return stack.isEmpty();

    }

}
