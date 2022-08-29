 
import java.util.ListIterator;
import java.util.LinkedList;

/**
   This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
   /**
      Reverses the elements in a linked list
      @param strings the linked list to reverse
   */
   public static void reverse(LinkedList<String> strings)
   {
      
      LinkedList <String> backwards = new LinkedList<>();
    
      for(String s: strings)
      
      {
          backwards.addFirst(s);
          
      }
      strings.clear();
      for (String s: backwards)
      {
            strings.addLast(s);
      }
      
   }
}