import java.util.Scanner;
import java.util.Stack;
/**
   Class for splitting an integer into its individual digits.
*/
public class IntegerSplitter
{
   /**
      Splits the given integer into its individual digits
      and prints them to the screen.
      @param number Integer to be split.
   */
   public static void split(int number)
   {
      // Complete this method. Use a Stack
      Stack<Integer> q = new Stack<>();
     
      Integer x = new Integer(number);
      while (x > 0)
      {
          Integer temp = new Integer(x%10);
          q.add(temp);
          x = x/10;
    }
    while (q.size() > 0)
    {
        System.out.print(q.pop() + " ");
    }
    


   }
}
