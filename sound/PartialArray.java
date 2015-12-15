

/**
 * Write a description of class PartialArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PartialArray
{
   private int[] values;
   private int size;
    /**
     * Default constructor for objects of class PartialArray
     */
    public PartialArray()
    {
        // initialise instance variables
        values =new int[100];
        for (size = 0;
             size <20;
             size++)
        {
            values[size] = size *size;
        }
    }

//     public void remove( int pos)
//     {
//         for ( int i = pos+1;
//         i < size;
//         i++)
//         {
//             values[ i - 1]= values[i];
//         }
//         size--;
//     }
   
    public void insert( int pos, int value)
    {
        if(size<values.length)
        {
            size++;
            for( int i = size -1;
            i> pos;
            i--)
            {
                values[i] = values[i-1];
            }
        }
    }
    
    public void remove( int pos)
    {
        
    }
}
