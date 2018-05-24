import java.util.Arrays;

public class Recursion {
	
	/* Precondition: n >= 1
           Postcondition:  returns the nth number in a sequence where each element is twice its predecessor, and starts with 1.
	*/
	public int sequence1(int n){
		if (n == 1){
			return 1;
		}
		else{
			return 2*sequence1(n-1);
		}
	}
	
	/* Precondition: n >= 1
           Postcondition:  returns the nth number in a sequence where each element is the sum of the previous 3, and starts with 1,2,3
	*/
	public int sequence2(int n){
		if (n<=3){
			return n;
		}
		else{
			return sequence2(n-1)+sequence2(n-2)+sequence2(n-3);
		}
		
	}
		
        /* Precondition:  word is an instance of String
           Postcondition:  returns true if word is a palindrome, and false otherwise
        */
	public boolean palindrome(String word){
		if (word.length()<=1)
			return true;
		else{
			if (word.charAt(0) == word.charAt(word.length()-1)){
				return palindrome(word.substring(1, word.length()-1));
			}
			else
				return false;
		}
		
	}

    /*Precondition:  list is an array of size at least 1
      Postcondition:  return value is the largest element in the array
     */
    public int maximum(int [] list) {
        if (list.length == 1)
        	return list[0];
        else
        	return Math.max(maximum(Arrays.copyOfRange(list, 0,list.length/2)), maximum(Arrays.copyOfRange(list, list.length/2,list.length)));
        	//return Math.max(list[0], maximum(Arrays.copyOfRange(list, 1,list.length)));
    }
    
	/* Precondition: x >= 1
           Postcondition: returns the appropriate star pattern for the value of x
	 */
	public String starPattern(int x){
		if (x == 0)
			return "";
		else
			return "*"+helpStar(x-1)+
					starPattern(x-1);
	}
	
	public String helpStar(int x){
		//System.out.println("help index is "+x);
		if (x == 0)
			return "\n";
		else
			return "*"+helpStar(x-1);
	}
	
	public static void main(String args[]){

            Recursion rec = new Recursion();

            System.out.println("sequence1(int x):");
            System.out.println("Answer: " + rec.sequence1(5) + "   Expecting: 16");
            System.out.println("Answer: " + rec.sequence1(7) + "   Expecting: 64\n");
            
            System.out.println("sequence2(int x):");
            System.out.println("Answer: " + rec.sequence2(5) + "   Expecting: 11");
            System.out.println("Answer: " + rec.sequence2(6) + "   Expecting: 20\n");
            
            System.out.println("\'car\' is a palindrome?: " + rec.palindrome("car"));
            System.out.println("\'racecar\' is a palindrome?: " + rec.palindrome("racecar"));
            System.out.println("\'hannah\' is a palindrome?: " + rec.palindrome("hannah"));
            System.out.println("\'banana\' is a palindrome?: " + rec.palindrome("banana") + "\n");
            
            int [] first = {1,2,3,4,5};
            int [] second = {5,9,6,1,3,8};
            System.out.println("Max 1 = "+rec.maximum(first));
            System.out.println("Max 2 = "+rec.maximum(second)+ "\n");

            
            System.out.println(rec.starPattern(5));
	}
}
