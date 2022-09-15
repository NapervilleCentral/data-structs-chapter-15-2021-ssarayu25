import java.util.PriorityQueue;

/**
   This program demonstrates a priority queue of work orders. The
   most important work orders are removed first.
*/
public class PriorityQueueDemo
{
   public static void main(String[] args)
   {
      //create PriorityQueue of WorkOrder
      PriorityQueue<WorkOrder> q = new PriorityQueue<>();
      //add several WorkOrder

      q.add(new WorkOrder(2, "Go to Riot Fest"));
      q.add(new WorkOrder(1, "Bike Home"));
      q.add(new WorkOrder(3, "Finish reccomendation"));
      
      int test = q.peek().hashCode();
      System.out.println(test);
      //WorkOrder first = q.remove();
      //WorkOrder second = q.remove();

      //display WorkOrder and you "finish"/remove from the list
      //while (q.size() > 0)
      //{
              
      //}
   }
}
