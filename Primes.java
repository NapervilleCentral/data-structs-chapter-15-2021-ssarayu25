 
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;
/**
   Implement a method for computing prime numbers. This method will
   compute all prime numbers up to n.
   Choose n
   Insert all numbers from 2 t n into a set
   The erase all multiples of 2 (except2) 4,6,8,10,12 ...
   Erase all mulitples of 3; 6,9,12,15
   go up to square root of n then print the set
*/
public class Primes
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Compute primes up to which integer?");
      int n = in.nextInt();
      Set <Integer> nums = new TreeSet<>();
      for (int i = 1; i <= n;i++)
      {
          nums.add(i);
      }
      for(int a = 2; a <= Math.pow(n,0.5);a++)
      {
          for(int b = 1; b <= n; b++)
          {
              if (b % a == 0)
                  nums.remove(b);
          }
      }
      
      System.out.println(nums);
   }
}