
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
        this.counts = new int[COUNTRIES][MEDALS];
    }

    /**
     * Prints the entire medal table
     */
    public void printTable()
    {
        for( int row = 0; row < COUNTRIES; 
    }
}
