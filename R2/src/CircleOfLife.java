public class CircleOfLife {

    public static void main(String args[]) {

        // Create a new Species object here, passing in the appropriate arguments
		Species rat = new Species("rat", 1000, 5);
		Species cat = new Species("cat", 500, 20);
		
        // Print out the species' growth rate
		System.out.println(rat.rate);
		System.out.println(cat.rate);
		
        // Use the species' toString here
		System.out.println(rat);
		System.out.println(cat);
		
        // Call populationInXYears here
		System.out.println("test populationInXYears");
		System.out.println("rat 3 years: "+rat.populationInXYears(3));
		System.out.println("cat 10 years: "+cat.populationInXYears(10));
		System.out.println();
		
        // Create a new Species object here, passing in the appropriate arguments
        // using a very large number for the population (e.g. 100000000)
		Species unknown = new Species("unknown", 100000000, 5);
		
        // Print out the species' population to make sure it is set to 1500
		System.out.println("large population: "+unknown.population);

        // Call populationInXYears here, feel free to hardcode in the int to be passed to the method
		System.out.println("unknown 1 year: "+unknown.populationInXYears(1));
		System.out.println();

        // Call mergeSpecies here. Test that mergeSpecies is doing what you expected it to
		unknown.mergeSpecies(cat);
		System.out.println(unknown);
				
    }
}