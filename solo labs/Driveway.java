import java.util.Stack;
/**
 * Write a description of class Driveway here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driveway
{
    Stack<Integer> drive;
    Stack<Integer> street;
    /**
     * Constructor for objects of class Driveway
     */
    public Driveway()
    {
        drive = new Stack();
        street = new Stack();
    }

    /**
     * adds car to driveway and prints stacks
     *
     * @param license plate number
     */
    public void add(int license)
    {
        drive.push(license);
        System.out.println("Driveway: " + drive);
        System.out.println("Street: " + street);
    }
    /**
     * removes car from driveway and prints stacks
     *
     * @param  license plate number
     */
    public void remove(int license)
    {
        int car = drive.pop();
        if (car != license)
        {
            street.push(car);
            remove(license);
        }
        else
        {
            System.out.println("Driveway: " + drive);
            System.out.println("Street: " + street);
            while(street.size() > 0)
            {
                car = street.pop();
                drive.push(car);
            }
            System.out.println("Driveway: " + drive);
            System.out.println("Street: " + street);
        }
    }
}
