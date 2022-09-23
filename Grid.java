import java.util.*;
public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];
   private Stack <Integer> s = new Stack<>();
   private int count = 0;

   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int column)
   {
      count++;
      update (row, column, count);
      row++; count++;
      update (row, column , count);
      row--; column++; count++;
      update (row, column, count);
      column--;
   }
   
   public void update (int row, int column, int count)
   {
       boolean valid = row >= 0 && column >= 0 && row < SIZE && column < SIZE;
       if (pixels[row] [column] == 0 && valid)
        pixels [row][column] = count;
    }

   @Override
   public String toString()
   {
      String r = "";
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
            r = r + String.format("%4d", pixels[i][j]);
         r = r + "\n";
      }
      return r;
   }
}
