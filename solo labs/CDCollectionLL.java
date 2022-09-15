//********************************************************************
//  CDCollection.java       Author: Lewis/Loftus/Cocking
//
//  Represents a collection of compact discs.
//********************************************************************

import java.text.NumberFormat;

public class CDCollectionLL
{
   //private collection;// make LL
   private int count;
   private double totalCost;

   /**
   *  Creates an initially empty collection.
   */
   public CDCollectionLL ()
   {

      count = 0;
      totalCost = 0.0;
   }

   /**
   *  Adds a CD to the collection, keeping list in order according to
   	  rating.
   *  @param
   */
   public void addCD (String title, String artist, double cost,
                      int tracks)
   {
   }

   /**
   *  Returns a report describing the CD collection.
   */
   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      String report = "******************************************\n";
      report += "My CD Collection\n\n";

      report += "Number of CDs: " + count + "\n";
      report += "Total cost: " + fmt.format(totalCost) + "\n";
      report += "Average cost: " + fmt.format(totalCost/count);

      report += "\n\nCD List:\n\n";

	  //loop thru collection and display all the CD

         //report += //CDtoString() + "\n";

      return report;
   }


}







