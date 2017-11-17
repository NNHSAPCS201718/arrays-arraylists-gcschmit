import java.util.Arrays;

public class CommonArrayAlgorithms
{
    /*
     * Create array of the specified size filled with
     *      random values based on the maximum value.
     */
    public static int[] createRandomArray( int length, int maxValue )
    {
        int[] randomArray = new int[ length ];
        for( int i = 0; i < randomArray.length; i++ )
        {
            randomArray[ i ] = (int)( Math.random() * maxValue );
        }

        return randomArray;
    }

    /*
     * Prints the specified array to System.out
     */
    public static void printArray( int[] array )
    {
        System.out.println( Arrays.toString( array ));
    }

    /*
     * Array Algorithm #1: Sum and Average
     *  creates an array filled with random numbers
     *  calculates the sum and average of the numbers
     *  prints the array and the sum and average
     *  @returns the average
     */
    public static void sumAndAverage()
    {
        double sum = 0;
        double average = 0;
        int count = 0;

        int[] array = createRandomArray( 10, 50 );

        for( int i = 0; i < array.length; i++ )
        {
            sum += array[ i ];
            count++;
        }

        average = sum / count;

        printArray( array );
        System.out.println( "sum: " + sum + " average: " + average );
    }

    /*
     * Array Algorithm #2: Print Element Separators
     *  creates an array filled with random numbers
     *  prints each element of the array with a '|' between each element
     *      but not at the beginning or end of the array
     */
    public static void printElementSeparators()
    {
        int[] array = createRandomArray( 10, 50 );

        for (int i = 0; i < array.length; i++)
        {
            if (i!=array.length-1)
            {
                System.out.print(array[i]+"|");
            }
            else
            {
                System.out.print(array[i]);
            }
        }
    }

    /*
     * Array Algorithm #3: Linear Search
     *  creates an array filled with random numbers
     *  find the index of the first element with the specified value
     *  prints the array and the index
     */
    public static void linearSearch( int valueToFind )
    {
        int[] array = createRandomArray(30, 20);
        boolean matchfound=false;
        
        printArray( array );

        for ( int i=0; i<array.length; i++)
        {
            if(array[i] == valueToFind)
            {
                System.out.println("The number is at index: " +i);
                matchfound=true;
                break;
            }

        }
        if(matchfound==false)
        {
            System.out.println("The value was not found in the array");
        }
    }

    /*
     * Array Algorithm #4: Swap Elements
     *  creates an array filled with random numbers
     *  prints the array
     *  swaps the elements at the two specified indexes
     *  prints the array
     */
    public static void swapElements( int index1, int index2 )
    {
        int[] ourArray = createRandomArray(10,50);
        printArray(ourArray);
        int firstValue = ourArray[index1];
        ourArray[index1] = ourArray[index2];
        ourArray[index2] = firstValue;
        printArray(ourArray); 
    }

    /*
     * Array Algorithm #5.1: findMax
     *  creates an array filled with random numbers
     *  prints the array and the greatest number
     */
    public static void findMax() 
    {
        int max = Integer.MIN_VALUE;
        int[] array1 = createRandomArray( 10, 50 );

        for(int i = 0; i < array1.length; i++)
        {
            if (array1[i] > max)
            {
                max = array1[i];
            }
        }

        printArray( array1 );
        System.out.println( "max: " + max );
    }

    /*
     * Array Algorithm #5.2: findMin
     *  creates an array filled with random numbers
     *  prints the array and the least number
     */
    public static void findMin()
    {
    }

    /*
     * Array Algorithm #6: Copying Arrays
     *  creates an array filled with random numbers
     *  creates a new array of the same size
     *  copies elements from the first array into the new array
     *  prints the original array and the new array
     *  returns the new array
     */
    public static int[] copyArray()
    {
        int[] George = createRandomArray(10,100);
        int[] JimmyBob = new int[George.length];
        for (int i = 0; i < JimmyBob.length; i ++){
            JimmyBob[i] = George[i];
        }
        
        printArray( George );
        printArray( JimmyBob );

        return JimmyBob;
    }

}