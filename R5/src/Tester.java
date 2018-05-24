
public class Tester extends Employee {	
	
	int linesofCodePerDay = 0;
	
	public Tester(String name, int id, int linesofCodePerDay) {
		super(name, id);
		this.linesofCodePerDay = linesofCodePerDay;
		}

	public int work() {
		int i = (int) (0.75+(int)(Math.random()*1.25))*linesofCodePerDay;
		return i;
	}
	
	public String toString(){
		return super.toString();

	}

}
