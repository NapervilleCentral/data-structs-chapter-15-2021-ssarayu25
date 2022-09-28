import java.util.*;
public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];
   private Stack <Pair> s;
   private int count;
   private boolean updated;

   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int column)
   {
      count = 1;
      s = new Stack<>();
      update (row, column, count);
      boolean control = true;
      Pair current = new Pair(row, column);
      
     while (control)
      {
          s = new Stack<>();
          row = current.getRow();
          column = current.getColumn();
          //North
          row++; count++;
          update (row, column , count);
          //east
          row--; column++; count++;
          update (row, column , count);
          //south
          column--; row--; count++;
          update (row, column , count);
          //west
          row++; column--; count++;
          update (row, column , count);
          
          if (s.size() == 0)
            control = false;
          else
            current = s.pop();
     }
   }
   
   public void update (int row, int column, int count)
   {
       boolean valid = ((row >= 0) && (column >= 0) && (row < SIZE) && (column < SIZE));
       if (valid && pixels[row] [column] == 0)
        {   
            Pair p = new Pair(row, column);
            s.push(p);
            count++;
            pixels [row][column] = count;
            
        }
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
