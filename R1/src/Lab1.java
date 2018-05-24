
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
//Lab1
// Author: Lingyang Zhu
// Date:   1/25/2016
// Class:  CS161
// Email:  lyzhu@rams.colostate.edu
public class Lab1 {

    // instance variable to be populated by numbers that are divisible by seven
    private int [] divisibleBySeven;

    // BEGIN PART 1

    /**
     * Test if x is divisible by y
     * @param x integer 
     * @param y integer 
     * @return true if x is divisible by y, false otherwise
     */
    public boolean isDivisibleBy(int x, int y)
    {
    	if (x%y == 0)
        return true;
    	else
        return false;
    }


    /**
     * Populates the instance variable divisibleBySeven with all the numbers that are 
     * divisible by seven in the range of the numbers begin and end
     * @param begin first integer to start the test range, inclusive
     * @param end last integer in the test range, not inclusive, i.e. end-1
     * is the last integer to be tested.
     */
    public void divisorsInRange(int begin, int end)
    {
    	int count = 0;
    	for (int i = begin; i < end; i++){
    		Lab1 l1 = new Lab1();
    		if (l1.isDivisibleBy(i,7))
    			count ++;
    	}
    	divisibleBySeven = new int [count];
    	int index = 0;
    	for (int i = begin; i < end; i++){
    		Lab1 l1 = new Lab1();
    		if (l1.isDivisibleBy(i,7)){
    			divisibleBySeven[index] = i;
    			index++;
    		}

    	}

    }

    // END PART 1

    // BEGIN PART 2

    /**
     * Extract all positive integers from the array provided as input.  The length of
     * the returned array should have a length that equals the number of positive
     * elements in the input array.
     * @param intArray array of integers
     * @return array containing all of the positive integers from the input array
     */

    public int[] extractPositives(int[] intArray)
    {
        int count = 0;
        for (int i = 0; i<intArray.length; i++){
        	if (intArray[i] >= 0)
        		count++;
        }
        int [] newArray = new int [count];
        int index = 0;
        for (int j = 0; j<intArray.length; j++){
        	if (intArray[j] >=0){
        		newArray[index] = intArray[j];
        		index++;
        	}
        }
        return newArray;
    }

    // END PART 2

    // BEGIN PART 3

    /**
     * Read in data from a file; print out the data in the specified format - 
     * "Name: *name*, Age:*age*" 
     *
     * @param filename the file name containing the input data
     */
    public void readAndPrint(String fileName) throws IOException
    {
    	String sString = "", sInt = "";
    	int count = 0;
    	File file = new File(fileName);
    	Scanner scanner = new Scanner(file);
    	while (scanner.hasNextLine()) {
    	    String line = scanner.nextLine();
    	    String[] tokens = line.split(" ");
    	    sString +=tokens[0]+",";
    	    sInt +=tokens[1]+",";
    	    count++;
    	}
    	scanner.close();

		String[] name = sString.split(",");
		String [] age = sInt.split(",");
    	for (int i = 0; i<count; i++){
    		System.out.println("Name: "+name[i]+", Age: "+age[i]);
    	}
    }

    // END PART 3

    public static void main(String[] args) throws IOException
    {
        Lab1 lab = new Lab1();

        System.out.println("Test part 1");
        System.out.println("10 is divisible by 3?  " + lab.isDivisibleBy(10, 3));
        System.out.println("24 is divisible by 3?  " + lab.isDivisibleBy(24, 3));
        lab.divisorsInRange(1, 99);
        System.out.println(Arrays.toString(lab.divisibleBySeven));

        System.out.println("Test part 2");
        int [] values = {-1,2,9,100,-60,-80,5,99};
        System.out.println(Arrays.toString(lab.extractPositives(values)));

        System.out.println("Test part 3");
        lab.readAndPrint(args[0]);
    }

}
