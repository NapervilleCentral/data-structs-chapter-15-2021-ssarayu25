import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class TwoWordsSameHashCodeDemo
{
   public static void main(String[] args) throws FileNotFoundException 
   {
         //TwoWordsSameHashCode.generateHashMap("words.txt"));


         Map<Integer, HashSet<String>> hashCodes = TwoWordsSameHashCode.generateHashMap("war-and-peace.txt");
         TwoWordsSameHashCode.printSameCodes(hashCodes);

   }
}
