import java.util.*;
/**
 * change the class name to your firstlast_parentheses
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SarayuSureshparentheses
{

    /**
     * A quiz
     * Exam whether an expression is correctly formed with Parentheses
     * thus are balanced
     *
     * Use a queue or a stack to push and pop parenthesis from a String
     * If the opening and closing parentheses don't match
     *      The parentheses are unbalanced. Exit
     * If at the end the stack/queue is empty
     *      The parentheses are balanced.
     * Else
     *      The parentheses are not balanced
     *
     * Write the code to test the the strings below
     * You should create at least one test of your own
     */
    public static void  main(String args[])
    {
        //Test if stack is empty balanced
        String quiz1 = "-((b*b-(4*a*c))/(2*a))";//balanced
        
        //Test if parentheses don't match
        String quiz2 = "-{[b*b-(4*a*c)]/(2*a)}";//balanced

        //Test if stack is empty balanced
        String quiz3 = "-((b*b-(4*a*c))/(2*a)";//unbalanced
        
        //Test if parentheses don't match
        String quiz4 = "-{[b*b-(4*a*c)]/(2*a}";//unbalanced
        
        String quiz5 = "{()[]{()}";//unbalanced
        
        
        System.out.println(balanced(quiz1));
        System.out.println(balanced(quiz2));
        System.out.println(balanced(quiz3));
        System.out.println(balanced(quiz4));
        System.out.println(balanced(quiz5));
    }
    
    public static boolean balanced (String expression)
    {
        Stack <Character> s = new Stack<>();
        //add all parantheses into stack
        for (int i = 0; i < expression.length(); i++)
        {
            char c = expression.charAt(i);
            if (c == '(' || c == ')' || c == '[' || c ==']' || c == '{' || c == '}')
            {
                s.push(c);
            }
        }
        
        boolean control = true;
        while (control)
        {
            char check = s.pop(); //paranthese to test
            Stack <Character> copy = new Stack<>();
            char opp;
            //find opposite parentheses
            if (check == ')') opp = '(';
            else if (check == ']') opp = '[';
            else if (check == '}') opp = '{';
            else if (check == '(') opp = ')';
            else if (check == '[') opp = ']';
            else  opp = '}';
          
            boolean done = true;
            while (s.size() != 0 && done)
            {
                char copying = s.pop();
                if (copying != opp) //copy over stack until match identified
                    copy.push(copying);
                else
                    done = false; //match identified
            }
            while (s.size() != 0) //continue copying over
            {
                copy.push(s.pop());
            }
            
            
            if (done) //if no matches found 
                return false;
            
            //redo process but move from copy to s this time
            check = copy.pop();
            if (check == ')') opp = '(';
            else if (check == ']') opp = '[';
            else if (check == '}') opp = '{';
            else if (check == '(') opp = ')';
            else if (check == '[') opp = ']';
            else  opp = '}';
            
            done = true;
            while (copy.size() != 0 && done)
            {
                char copying = copy.pop();
                if (copying != opp) 
                    s.push(copying);
                else
                    done = false;
            }
            while (copy.size() != 0)
            {
                s.push(copy.pop());
            }
            
            if (done)
                return false;
                
            
            if (s.size() == 0) //if stack is empty after processing everythng has a match
            {
                control = false;
            }
        }
        
        return true;
    }
}
