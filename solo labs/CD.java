//********************************************************************
//  CD.java       Author: Lewis/Loftus/Cocking
//
//  Represents a compact disc.
//********************************************************************

import java.text.NumberFormat;

public class CD
{
   private String title, artist;
   private double cost;
   private int tracks;
   private double rating;
   private String genre;

   //-----------------------------------------------------------------
   //  Creates a new CD with the specified information.
   //-----------------------------------------------------------------
   public CD (String name, String singer, double price, int numTracks)
   {
      title = name;
      artist = singer;
      cost = price;
      tracks = numTracks;
      rating = 0;
   }
   //-----------------------------------------------------------------
      //  Creates a new CD with the specified information.
      //-----------------------------------------------------------------
      public CD (String name, String singer, double price, int numTracks, double rate)
      {
         title = name;
         artist = singer;
         cost = price;
         tracks = numTracks;
         rating = rate;
   }
   public String getTitle() {return title;}
   public String getArtist() {return artist;}
   public double getCost() {return cost;}
   public int getTracks() {return tracks;}
   public double getRating() {return rating;}
   
   public int compareTo(CD other)
   {
       if (this.rating < other.rating) return -1;
       if (this.rating > other.rating) return 1;
       return 0;
   }
   

   //-----------------------------------------------------------------
   //  Returns a description of this CD.
   //-----------------------------------------------------------------
   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();

      String description;

      description = fmt.format(cost) + "\t" + tracks + "\t";
      description += title + "\t" + artist+ "\t"+ rating;

      return description;
   }
}
