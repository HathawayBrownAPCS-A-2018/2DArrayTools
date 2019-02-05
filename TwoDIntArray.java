
/**
 * A two-dimensional array of integers
 * 
 * @author APCS@HB
 */
public class TwoDIntArray
{
    private int[][]  nums;
    private final int NUM_ROWS = 6;
    private final int NUM_COLS = 10;
    
    public TwoDIntArray ()
    {
        nums = new int[NUM_ROWS][NUM_COLS];
        fillRandom (0, 100);
    }
    
    /**  
     *   Fills the 2-D array with random integers between min and max, inclusive
     *   
     *   @param min  The smallest possible value for the array
     *   @param max  The largest possible value for the array
     */
    public void fillRandom (int min, int max)
    {
        for (int row = 0; row < nums.length; row++)
        {
            for (int col = 0; col < nums[row].length; col++)
            {
                nums[row][col] = 0; // fill this in!
            }
        }
    }
    
    /**
     *    Calculates the sum of the items in the 2D array
     *    
     *    @return  The sum of all integers in the array
     */
    public int getSum()
    {
        return 0;   // placeholder.  Your code will replace this
    }

    /** 
     *    Calculates the average of the integers in the 2D array
     *    
     *    @return the average of all integers in the array
     */
    public double getAverage()
    {    
        return 0.0;   // placeholder.  Your code will replace this
    }
    
    /**   
     *    Finds the largest value in the 2D array
     *    
     *    @return  the largest value in the 2D array
     */
    public int getMaxValue ()
    {
        return 0;   // placeholder.  Your code will replace this
    }
    
    /**
     *     Finds the index of the target value in the 2D array.
     *     
     *     @param  n  The number to look for in the array
     *     @return  .... WHAT ????  How to do this?
     */
    public int[] indexOf (int n)
    {
        return new int[2];   // placeholder.  Your code will replace this
    }
    
    /**
     *  Finds the sum of row r of the array.
     *  
     *  @param r  The row to sum
     *  @return   The sum of the elements in row r
     */
    public int rowSum (int r)
    {
        return 0;   // placeholder.  Your code will replace this
    }
    
    /**
     *  Finds the sum of column c of the array
     *  
     *  @param  c  The column to sum
     *  @return    The sum of the elements in column c
     */
    public int colSum (int c)
    {
        return 0;   // placeholder.  Your code will replace this
    }
       
    /**
     *  Returns a String representing the 2-D array.
     *  Formatted nicely so it's easy to see rows and columns
     *  
     *  @return a String representing the 2-D array.
     */
    public String toString()
    {
        return "";   // placeholder.  Your code will replace this
    }
    
    public static void main (String[] args)
    {
        TwoDIntArray myArray = new TwoDIntArray();
        System.out.println(myArray);
        System.out.println("The sum of the elements is " + myArray.getSum());
        System.out.println("The average value is " + myArray.getAverage());
        System.out.println("The largest element is " + myArray.getMaxValue() +
           " in row " + " and column " );
           
        System.out.println("The sum of row #3 is " + myArray.rowSum(3));
        System.out.println("The sum of column #4 is " + myArray.colSum(4));
    }
}
