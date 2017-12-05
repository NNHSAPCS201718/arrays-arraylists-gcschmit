import java.util.ArrayList;

/**
 * Write a description of class ArrayListNotes here.
 *
 * @author gcschmit
 * @version 5 December 2017
 */
public class ArrayListNotes
{
    /**
     * Creates and returns an ArrayList of the specified number of
     *      Integers where each element is assigned a random value
     *      between 1 and range.
     *  
     *  @param size the number of Integers to add to the list
     *  @param range the range of rtandom values to assign to each element
     *  @return the newly created and initialized list
     */
    public static ArrayList<Integer> createRandomIntegerList( int size, int range )
    {
        /**
         * The ArrayList is a Java Generic.
         * 
         *  We have to specify the type of the elements in the list
         *      in angle brackets (i.e., <>) after every ArrayList
         *      identifier.
         *  
         *  Primitives (e.g., int, double) are not classes and cannot
         *      be specified as the type of elements in a Generic.
         *      Instead, we use the corresponding Wrapper class (e.g.,
         *      Integer, Double).
         */
        ArrayList<Integer> list = new ArrayList<Integer>();

        for( int i = 0; i < size; i++ )
        {
            int value = (int)(range * Math.random()) + 1;

            /**
             * The add method adds the specified object to the end of
             *      the list.
             *      
             *  Autoboxing
             *  
             *  Primitives are automatically converted to their
             *      corresponding wrapper class. However, type
             *      promotion does not occur.
             */
            list.add( value );
        }

        return list;
    }

    /**
     * Removes even numbers from the specified list
     * @param list the list of numbers to potentially remove
     */
    public static void removeEvens( ArrayList<Integer> list )
    {
        /**
         * The size method returns the number of elements in the list.
         */
        for( int i = 0; i < list.size(); i++ )
        {
            /**
             * The get method returns the element at the specified index.
             */
            if( list.get( i ) % 2 == 0 )
            {
                /**
                 * The remove method deletes the element at the specified
                 *      index from the list.
                 */
                list.remove( i );
                i--;
            }
        }
        
        System.out.println( list );
    }
    
    /**
     * Removes even numbers from the specified list
     * @param list the list of numbers to potentially remove
     */
    public static void removeEvens2( ArrayList<Integer> list )
    {
        for( int i = list.size() - 1; i >= 0; i-- )
        {
            if( list.get( i ) % 2 == 0 )
            {
                list.remove( i );
            }
        }
        
        System.out.println( list );
    }
    
    public static void main( String[] args )
    {
        ArrayList<Integer> myList = createRandomIntegerList( 10, 20 );
        removeEvens( myList );
    }

}


