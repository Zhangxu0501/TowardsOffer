package problem21;
import java.util.Stack;
public class Solution {
	public static Stack s1=new Stack();
	public static Stack s2=new Stack();
    public void push(int node) {
        s1.push(node);
        if(s2.empty())
        	s2.push(node);
        else
        	s2.push(Math.min(node, (int) s2.peek()));
    }
    
    public void pop() {
        s1.pop();
        s2.pop();
    }
    
    public int top() {
        return (int)s1.peek();
    }
    
    public int min() {
        return (int)s2.peek();
    }
}