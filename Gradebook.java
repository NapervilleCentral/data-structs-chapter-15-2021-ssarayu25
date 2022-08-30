import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
/**
   A program to add, remove, modify or print
   student names and grades.
*/
public class Gradebook
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      Map<String, String> gradebook = new TreeMap<>();
         

      boolean done = false;
      while(!done)
      {
         System.out.println("A)dd R)emove M)odify P)rint Q)uit");
         String input = in.next().toUpperCase();
         if (input.equals("Q"))
         {
            done = true;
         }
         else if (input.equals("A"))
         {
            System.out.println("Enter Name: ");
            String name = in.next();
            System.out.println("Enter Grade");
            String grade = in.next();
            gradebook.put(name, grade);
         }
         else if (input.equals("R"))
         {
            System.out.println("Enter Name: ");
            gradebook.remove(in.next());
         }
         else if (input.equals("M"))
         {
            System.out.println("Enter Name: ");
            String name = in.next();
            System.out.println("Enter New Grade");
            String grade = in.next();
            gradebook.put(name, grade);
         }
         else if (input.equalsIgnoreCase("P"))
         {
            System.out.println(gradebook);
         }
         else
         {
            done = true;
         }
      }
   }
}
