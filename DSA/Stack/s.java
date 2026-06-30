import java.util.*;
public class s{
    public static void main(String[] args) {
        String s="(1+(2*3)+((8)/4))+1";
        Stack<Character> stack = new Stack<>();
        int ans=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                stack.push(c);
            }
            else if(c==')')
            {
                stack.pop();

            }
            ans=Math.max(ans,stack.size());
        }
        System.out.println(ans);
    }
}