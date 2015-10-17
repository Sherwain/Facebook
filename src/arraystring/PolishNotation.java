package arraystring;

import java.util.Stack;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class PolishNotation {
	public static void main(String[] args) throws ScriptException{
		String[] str = {"2", "1", "+", "3", "*"};
		System.out.println(notate(str));
	}
	
	public static Double notate(String[] str) throws ScriptException{
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		StringBuilder expr;
		Stack<Double> stack = new Stack<Double>();
		for(int i = 0; i < str.length; i++){
			try{
				Double temp = Double.valueOf(str[i]);
				stack.push(temp);
			}
			catch(NumberFormatException e){
				expr = new StringBuilder(stack.pop() + str[i] + stack.pop());
				Double intval = (Double) engine.eval(expr.toString());
				stack.push(intval);
			}	
		}
		return Double.valueOf(stack.pop());
	}
}
