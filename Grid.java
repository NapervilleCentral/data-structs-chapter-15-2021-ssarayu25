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
     Pair current = new Pair(row, column);
     count = 1;
     s = new Stack<>();
     boolean valid = true;
     valid = ((row >= 0) && (column >= 0) && (row < SIZE) && (column < SIZE));
     if (valid && pixels[row] [column] == 0)
        {   
            Pair p = new Pair(row, column);
            s.push(p);
            pixels [row][column] = count;
            count++;
        }
      boolean control = true;
      int area = SIZE *SIZE;
      s = new Stack<>();
      
     while (count <= area)
      {
          
          row = current.getRow();
          column = current.getColumn();
          //North
          row--; 
          valid = ((row >= 0) && (column >= 0) && (row < SIZE) && (column < SIZE));
          if (valid && pixels[row] [column] == 0)
            {   
                Pair p = new Pair(row, column);
                s.push(p);
                pixels [row][column] = count;
                count++;
            }
          //east
          row++; column++; 
          valid = ((row >= 0) && (column >= 0) && (row < SIZE) && (column < SIZE));

          if (valid && pixels[row] [column] == 0)
            {   
                Pair p = new Pair(row, column);
                s.push(p);
                pixels [row][column] = count;
                count++;
            }
          //south
          column--; row++; 
          valid = ((row >= 0) && (column >= 0) && (row < SIZE) && (column < SIZE));

          if (valid && pixels[row] [column] == 0)
            {   
                Pair p = new Pair(row, column);
                s.push(p);
                pixels [row][column] = count;
                count++;
            }
          //west
          row--; column--; 
          valid = ((row >= 0) && (column >= 0) && (row < SIZE) && (column < SIZE));

          if (valid && pixels[row] [column] == 0)
            {   
                Pair p = new Pair(row, column);
                s.push(p);
                pixels [row][column] = count;
                count++;
            }
          column++;
          if (s.size() !=0) current = s.pop();
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
