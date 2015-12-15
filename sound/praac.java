import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class praac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class praac
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class praac
     */
    public static void main( String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        
        Scanner s = new Scanner(System.in);
        System.out.println("type boi");
        String word = s.next();
        
        while(word.equals("quit") == false)
        {
            words.add(word);
            word = s.next();
        }
        System.out.println( words );
        
        for( int i= words.size() -1; i>= 0; i--)
        {
            word = words.get( i );
            if(word.equals("like"))
            {
                words.remove(i);
            }
        }
        System.out.println(words);
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x+y;
    }

}
