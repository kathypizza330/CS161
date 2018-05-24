public class Programmer extends Employee{
	
	int linesofCodePerDay = 0;
		
	public Programmer(String name, int id, int linesofCodePerDay) {
		super(name, id);
		this.linesofCodePerDay = linesofCodePerDay;
		}

	public int work() {
		int i = (int) (0.5+(int)(Math.random()*1.5))*linesofCodePerDay;
		return i;
	}
	
	public String toString(){
		return super.toString();

	}
	
}
