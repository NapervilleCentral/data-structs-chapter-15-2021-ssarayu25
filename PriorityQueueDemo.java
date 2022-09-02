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
      PriorityQueue<Integer> q = new PriorityQueue<>();
      //add several WorkOrder

      q.add(2);
      q.add(4);
      q.add(1);
      q.add(3);
      
      int first = q.remove();
      int second = q.remove();

      //display WorkOrder and you "finish"/remove from the list
      while (q.size() > 0)
      {

      }
   }
}
