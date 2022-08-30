import java.util.LinkedList;
import java.util.Queue;

/**
   This program simulates a print queue. Note that documents are printed
   in the same order as they are submitted.
*/
public class QueueDemo
{
   public static void main(String[] args)
   {
       //create Queue of Strings = new LinkedList<>
      Queue<String> jobs = new LinkedList<>();
      //add several "jobs"
      jobs.add("Kevin:   take mom to the doc #1"); 
      jobs.add("Ben:     do math homework    #2");
      jobs.add("Alex:    go to the gym       #3");
      jobs.add("Ted:     waste time          #4");
      jobs.add("Tammy:   get yelled at       #5");
      jobs.add("Mr. Kim: sneeze on declan    #6");
      //print jobs as you remove from the list
        System.out.println(jobs.peek());

      //display the rest of the Queue (remove as you print
      while (jobs.size() > 0)
      {
            System.out.println("Printing: " + jobs.remove());
      }
   }
}
