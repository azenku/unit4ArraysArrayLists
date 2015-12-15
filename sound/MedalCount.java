


public class MedalCount
{
    final int COUNTRIES = 7;
    final int MEDALS = 3;
    
    int[][] counts = 
        {
            {1,0,1},
            {1,1,0},
            {0,0,1},
            {1,0,0},
            {0,1,1},
            {0,1,1},
            {1,1,0}
        };

    /**
     * Default constructor for objects of class MedalCount
     */
    public MedalCount()
    {
        //counts = new int [COUNTRIES]{MEDALS};
        
    }

    public String toString()
    {
        String str = "";
        // good; for(int i = 0; i< COUNTRIES; i++)
        for( int i = 0; i< counts.length; i++)
        {
            for(int j = 0; j< counts[0].length; j++)
            {
                str += counts[i][j] + "\t";
            }
            str+= "\n";
        }
        System.out.println(str);
        return str;
    }
    
    public int medalCount(int countryIndex)
    {
        int total = 0; 
       
        for(int j = 0; j< counts[countryIndex].length; j++)
        {
            total += counts[countryIndex][j];
        }
        return total;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
