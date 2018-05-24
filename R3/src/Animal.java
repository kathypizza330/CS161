
public class Animal {
	
	private String name;
	private int topSpeed;
	
	//create the getters and setters for the instance variables
    //there is a shortcut by hovering over the variable names
	
// For the setter associated with topSpeed make sure the values are between 0 and 70
    // Raise an exception if it is not within these values.

	public String getName(){
		return name;
	}
	
	public int getTopspeed(){
		return topSpeed;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setTopspeed(int speed){
		if (speed>=0 && speed<=70)
			topSpeed = speed;
		else if (speed<0)
			topSpeed = 0;
		else
			topSpeed = 70;
	}
	
	//create a constructor that takes in a String for the name and an int for the topSpeed
	//use only the setters initialize the instance variables	
	public Animal(String name, int speed){
		setName(name);
		setTopspeed(speed);
	}


        //create an equals(Object other) method that returns True if the two Animal objects have 
	//top speeds that are within 2 mph of each other
	public boolean equals(Object other){
		Animal o = (Animal) other;
		if (topSpeed >= o.getTopspeed()-2 && topSpeed <= o.getTopspeed()+2)
			return true;
		else
			return false;
	}
	
	// Create a toString method
	// Formatting of the returned String should follow this example:
	// Name: elephant     Top Speed: 25
	public String toString(){
		return "Name: "+name+"\tTop Speed: "+topSpeed;
	}
	
}
