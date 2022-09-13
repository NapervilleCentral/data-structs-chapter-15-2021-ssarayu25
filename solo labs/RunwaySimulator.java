import java.util.*;
/**
   Class for simulating a runway.
*/
public class RunwaySimulator
{
   Queue<String> TakingOff;
   Queue<String> Landing;

   /**
      Constructor.
   */
   public RunwaySimulator()
   {
      TakingOff = new LinkedList<>();
      Landing = new LinkedList<>();
   }

   /**
      Add a flight symbol to the taking off queue.
      @param flightSymbol the flight symbol.
   */
   public void addTakeOff(String flightSymbol)
   {
      TakingOff.add(flightSymbol);
      System.out.println("Landing: " + Landing);
      System.out.println("Taking Off: " + TakingOff);
   }

   /**
      Add a flight symbol to the landing queue.
      @param flightSymbol the flight symbol.
   */
   public void addLanding(String flightSymbol)
   {
      Landing.add(flightSymbol);
      System.out.println("Landing: " + Landing);
      System.out.println("Taking Off: " + TakingOff);
   }

   /**
      Handle the next action.
   */
   public void handleNextAction()
   {
      if (Landing.size() != 0)
      {
          while (Landing.size() != 0)
          {
              Landing.remove();
          }
          System.out.println("Landing: " + Landing);
          System.out.println("Taking Off: " + TakingOff);
     }
     else
     {
         while (TakingOff.size() != 0)
         {
             TakingOff.remove();
         }
         System.out.println("Landing: " + Landing);
         System.out.println("Taking Off: " + TakingOff);
     }
      

   }
}
