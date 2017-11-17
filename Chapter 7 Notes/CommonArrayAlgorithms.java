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
        int[] array = createRandomArray(5, 10);
        int iterationCount = 0;

        for(int i : array)
        {
            System.out.print(i);
            iterationCount ++;
            if(iterationCount < array.length)
            {
                System.out.print(" | ");
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
        int[] array = createRandomArray( 10, 50 );
        int count = -1;
        boolean mark = false;
        for(int num2:array)
        {
            count++;
            if(valueToFind == num2)
            {
                System.out.println(valueToFind + " Can be found at index: " + count);
                printArray( array );
                mark = true;
            }
        }

        if(mark == false)
        {
            System.out.println("Specified Value Not Found");
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
        int[] array = createRandomArray( 10, 50 );
        int indice = 0;
        for ( int number : array )
        {
            System.out.println( "number: " + number + ", " + "indice: " + indice );
            indice++;
        }

        System.out.println( "" );

        int switch1 = array[ index1 ];
        int switch2 = array[ index2 ];

        array[ index2 ] = switch1;
        array[ index1 ] = switch2;

        indice = 0;
        for ( int number : array )
        {
            System.out.println( "number: " + number + ", " + "indice: " + indice );
            indice++;
        }
    }

    /*
     * Array Algorithm #5.1: findMax
     *  creates an array filled with random numbers
     *  prints the array and the greatest number
     */
    public static void findMax() 
    {
        int[] array = createRandomArray( 10, 50 );
        int max =0;
        for( int num:array)
        {
            if( num > max){
                max = num;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(max);
    }

    /*
     * Array Algorithm #5.2: findMin
     *  creates an array filled with random numbers
     *  prints the array and the least number
     */
    public static void findMin()
    {
        int[] array = createRandomArray( 10, 50 );
        int min = 50;
        for( int i:array)
        {
            if(i<min)
            {
                min = i;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("The lowest value in the array is :\t"+min);
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
        int[] array = createRandomArray( 10, 50 );
        int [] copyarray = new int[ array.length ];

        for( int i = 0; i < array.length; i++)
        {
            copyarray[i] = array[i];
        }

        for(int number: copyarray ){
            System.out.println( number );
        }

        return copyarray;
    }

}