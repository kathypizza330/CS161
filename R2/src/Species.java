public class Species {	

    // Put the instance variable here.
    public String name;
    public int population;
    public int rate;

        // Create a Species constructor that takes in a String for its name, an int for
    // its population, and an int for its growth rate per year as a percent.
    public Species(String name, int population, int rate){
    	if (population <=1)
    		this.population = 1;
    	else if (population >= 1500)
    		this.population = 1500;
    	else
    		this.population = population;
    	if (rate <=1)
    		this.rate = 1;
    	else if (rate >= 20)
    		this.rate = 20;
    	else
    		this.rate = rate;
    	this.name = name;
    }
    
    // mergeSpecies adds the populations of the two species, changes the name
    // of the species to the concatenation of the two names, and the growth
    // rate to the maximum of the two growth rates.

    public void mergeSpecies(Species other) {
        this.population += other.population;
        this.name += other.name;
        this.rate = Math.max(this.rate, other.rate);
    }

    public String toString(){
        String output = "";
        output += "Name of the species: " + this.name + "\n";
        output += "Population: " + this.population + "\n";
        output += "Growth Rate: " + this.rate + "%\n";
        return output;
    }

    // Increases the population according to the growth rate of the species, i.e.
    // updates the population instance variable by adding to it the growth rate/100 times the current population.

    public void grow() {
        this.population += this.population*this.rate/100;
    }

    // Returns the population of the species in x years according to its growth rate.

    public int populationInXYears(int x){
    	int pop = this.population;
        for (int i = 0; i<x; i++){
        	pop += pop*this.rate/100;
        }
        return pop;
    }

    public static void main(String[] args) {

        // Put simple code here to test the Species class.  It is always a good idea to include
        // a main method in any class you define.

        Species a = new Species("Frog", 100, 10);
        System.out.println(a);

        a.grow();
        System.out.println(a);

        System.out.println("a.populationInXYears(10) returns " + a.populationInXYears(10));

        Species b = new Species("Rabbit", 10, 23);
        a.mergeSpecies(b);
        System.out.println("a.mergeSpecies(b) is " + a);
        
    }
}