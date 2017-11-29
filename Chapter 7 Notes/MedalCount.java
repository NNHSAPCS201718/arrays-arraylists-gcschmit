
/**
 * Write a description of class MedalCount here.
 *
 * @author gcschmit
 * @version 28 November 2017
 */
public class MedalCount
{
    final int COUNTRIES = 7;
    final int MEDALS = 3;
    
    private int[][] counts =
        {
            { 1, 0, 1 },
            { 1, 1, 0 },
            { 0, 0, 1 },
            { 1, 0, 0 },
            { 0, 1, 1 },
            { 0, 1, 1 },
            { 1, 1, 0 }
        };

    /**
     * Constructor for objects of class MedalCount
     */
    public MedalCount()
    {
        /*
         * Alternative way to create a new 2D array. This would be
         *      followed by nested for loops to initialize each element.
         */
        //this.counts = new int[COUNTRIES][MEDALS];
    }

    /**
     * Prints the entire medal table
     */
    public void printTable()
    {
        // good: for( int row = 0; row < COUNTRIES; row++ )
        // better:
        for( int row = 0; row < this.counts.length; row++ )
        {
            // good: for( int col = 0; col < MEDALS; col++ )
            // better: for( int col = 0; col < this.counts[0].length; col++ )
            // best:
            for( int col = 0; col < this.counts[row].length; col++ )
            {
                System.out.print( this.counts[row][col] + "\t" );
            }
            
            System.out.println();
        }
    }
    
    /**
     * Sum the medals for the specified country index
     *
     * @param  countryIndex  the index of the country in the table whose
     *                          medals to sum
     * @return the sum of the medals for the specified country index
     */
    public int sumMedalsForCountry(int countryIndex)
    {
        int sum = 0;
        
        for( int col = 0; col < this.counts[countryIndex].length; col++ )
        {
            sum += this.counts[countryIndex][col];
        }
        
        return sum;
    }
    
    /**
     * Sum the medals of a given type specified by the medal index
     *
     * @param  medalIndex  the indesx of a given type of medal to sum
     * @return the sum of the medals of a given type specified by the
     *              medal index
     */
    public int sumMedalsForType(int medalIndex)
    {
        int sum = 0;
        
        for( int row = 0; row < this.counts.length; row++ )
        {
            sum += this.counts[row][medalIndex];
        }
        
        return sum;
    }


}
