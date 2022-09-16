//********************************************************************
//  CDCollection.java       Author: Lewis/Loftus/Cocking
//
//  Represents a collection of compact discs.
//********************************************************************

import java.text.NumberFormat;
import java.util.*;

public class CDCollectionLL
{
   //private collection;// make LL
   private int count;
   private double totalCost;
   private ListIterator <CD> iter;
   private LinkedList<CD> CDs;
   /**
   *  Creates an initially empty collection.
   */
   public CDCollectionLL ()
   {
      CDs = new LinkedList();
      iter = CDs.listIterator();
      count = 0;
      totalCost = 0.0;
   }

   /**
   *  Adds a CD to the collection, keeping list in order according to
         rating.
   *  @param
   */
   public void addCD (CD album)
   {
       
       if (!iter.hasNext()) 
       {
           CDs.add(album);
           iter = CDs.listIterator();
        }
       else
       {
           CD next = iter.next();
           if (album.compareTo(next) == 1)
           {
               iter.previous();
               iter.add(album);
               iter = CDs.listIterator();
           }
           else
           {
                addCD (album);
           }
           
       }
       
       
       
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
      for (CD album: CDs)
      {
          report +=album + "\n";
      }

         //report += //CDtoString() + "\n";

      return report;
   }


}







