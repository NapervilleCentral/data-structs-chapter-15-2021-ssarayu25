import java.util.*;
public class Removepairs
{
    private static int count;
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> a = new LinkedList<>();
        Queue<Integer> b = new LinkedList<>();
        System.out.println("How long is the list? ");
        int length = scan.nextInt();
        System.out.println("Enter List 1: ");
        for(int i = 0; i < length; i++)
        {
            a.add(scan.nextInt());
        }
        System.out.println("Enter List 2: ");
        for(int i = 0; i < length; i++)
        {
            b.add(scan.nextInt());
        }
        while(a.size() != 0)
        {
            if (check(a,b))
                remove(a,b);
            else
                rotate(a);
        }
        System.out.println(count);
    }
    public static void rotate(Queue a1)
    {
    
            int temp = (int)a1.remove();
            a1.add(temp);
            
            count++;
    }
    public static boolean check(Queue a1,Queue b1)
    {
        if (a1.peek() == b1.peek())
            return true;
        return false;
    
    }
    public static void remove(Queue a1, Queue b1)
    {
        a1.remove();
        b1.remove();
        count++;
    }
}