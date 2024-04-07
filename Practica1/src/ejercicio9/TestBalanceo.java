package ejercicio9;

import java.util.Stack;

/**
 * This class contains a method to validate the balance of an expression using a stack data structure.
 */
public class TestBalanceo {
    /**
     * Validates the balance of an expression containing parentheses, brackets, and curly braces.
     * @param expression The expression to be validated
     * @return true if the expression is balanced, false otherwise
     */
    public static boolean validarExpresion(String expression){
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;

        for (int i = 0; i < expression.length(); i++) {
            char character = expression.charAt(i);

            if (character == '(' || character == '[' || character == '{') {
                stack.push(character);
            } else if (character == ')' || character == ']' || character == '}') {
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                } else {
                    char top = stack.pop();
                    if ((character == ')' && top != '(') ||
                        (character == ']' && top != '[') ||
                        (character == '}' && top != '{')) {
                        isValid = false;
                        break;
                    }
                }
            }
        }

        if (!stack.isEmpty()) {
            isValid = false;
        }

        return isValid;
    }

    public static void main(String[] args){
        String expression = "[({})]";
        boolean isBalanced = TestBalanceo.validarExpresion(expression);
        
        if (isBalanced) {
            System.out.println("La expresion esta balanceada.");
        } else {
            System.out.println("La expresion no esta balanceada.");
        }
    }
}
