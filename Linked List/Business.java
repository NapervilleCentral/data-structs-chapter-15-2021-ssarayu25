import java.util.LinkedList;

/**
   Business utility methods.
*/
public class Business
{
   /**
      Removes every nth element from the linked list
      @param employeeNames the linked list to remove from
      @param n the parameter to determine "nth"
    */
   public static void downsize(LinkedList<String> employeeNames, int n)
   {
      int count = 1;
      while (count <= (employeeNames.size() + n))
      {
          if (count%n==0)
          {
              employeeNames.removeFirst();
            }
          else
          {
               String first = employeeNames.removeFirst();
               employeeNames.addLast(first);
          }
          count++;
          }
       
    }
      
}
     

