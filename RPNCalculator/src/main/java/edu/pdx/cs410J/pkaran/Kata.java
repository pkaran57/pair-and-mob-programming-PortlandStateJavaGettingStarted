package edu.pdx.cs410J.pkaran;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * RPN Calculator
 * <p>
 * An RPN calculator computes expressions written in Reverse Polish Notation.
 * http://codingdojo.org/kata/RPN/
 */
public class Kata {


    public static void main(String[] args) throws Exception {
        String expression = "3 5 8 * 7 + *";

        System.out.println(calculateRPNExpression(expression));
    }

    static double calculateRPNExpression(String expression) throws Exception {
        Stack<String> stack = tokenizeExpression(expression);
        return evaluateRPNStack(stack);
    }

    private static Stack<String> tokenizeExpression(String expression) {
        List<String> expressionTokens = Arrays.asList(expression.split(" "));

        Stack<String> stack = new Stack<>();

        for (String token : expressionTokens) {
            stack.push(token);
        }
        return stack;
    }

    private static double evaluateRPNStack(Stack<String> rpnStack) throws Exception {
        String token = rpnStack.pop();
        double a, b;

        try {
            a = Double.parseDouble(token);
        } catch (Exception e) {
            b = evaluateRPNStack(rpnStack);
            a = evaluateRPNStack(rpnStack);

            switch (token) {
                case "+":
                    a += b;
                    break;
                case "-":
                    a -= b;
                    break;
                case "*":
                    a *= b;
                    break;
                case "/":
                    a /= b;
                    break;
                default:
                    throw new Exception("Encountered an error trying to evaluate the token " + token);
            }
        }
        return a;
    }
}