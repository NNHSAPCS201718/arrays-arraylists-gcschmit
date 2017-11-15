
/**
 * Write a description of class Notes here.
 * 
 * @author @gcschmit
 * @version 15 November 2017
 */
public class Notes
{
    public static void createArrayOfEvens()
    {
        /*
         * An array stores an ordered list of multiple elements of the
         *      same type. The type can be a primitive type (e.g. int)
         *      or a class (e.g., Turtles).
         *  
         *  An array is like an object in that it must be declared and
         *      initialized.
         *  
         *  Here's an example that creates an array that contains 10 int
         *      values.
         *      
         *   The number in the square brackets specifies the number of
         *      elements in the array.
         *      
         *   All elements are initialized to 0 (or false, null)
         */
        int[] evens = new int[ 10 ];
        
        /*
         * Set the value of all the elements in the array
         *      to the first 10 positive even integers.
         *      
         *  "length" is used to query the number of elements in the array
         *  
         *  square brackets (i.e., []) are used to reference a specific 
         *      element in the array
         */
        for( int i = 0; i < evens.length; i++ )
        {
            evens[ i ] = (i + 1) * 2;
        }
        
        // print the array
        for( int i = 0; i < evens.length; i++ )
        {
            System.out.println( i + ": " + evens[ i ] );
        }
        
        System.out.println( evens );
    }
    
    public static void createArrayOfOdds()
    {
        /*
         * An array literal (i.e., curly brackets and comm-separated values)
         *      can be used to initialze an array but only when the array
         *      is declared. The size of the array is determined based on 
         *      the number of elements in the literal.
         */
        int[] odds = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        
        // this won't compile
        //odds = { 1, 3, 5 };
        
        for( int i = 0; i <= odds.length; i++ )
        {
            System.out.println( i + ": " + odds[ i ] );
        }
    }
}




