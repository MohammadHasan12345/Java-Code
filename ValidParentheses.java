import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // push opening brackets
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // check closing brackets
            else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();
        System.out.println(solution.isValid("()"));      // true
        System.out.println(solution.isValid("()[]{}")); // true
        System.out.println(solution.isValid("(]"));     // false
        System.out.println(solution.isValid("([)]"));   // false
        System.out.println(solution.isValid("{[]}"));   // true
    }
}
