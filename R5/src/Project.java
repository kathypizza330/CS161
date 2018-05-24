import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Project {
	
	int linesOfCode;
	int linesOfCodeWritten = 0;
	int linesOfCodeTested = 0;
	int duration;
	ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public Project(int linesOfCode, int duration){
		this.linesOfCode = linesOfCode;
		this.duration = duration;
	}
	
	public void addEmployee(Employee e){
		employees.add(e);
	}
	
	public int doProject(){
		int day = 0;
		for (Employee e : employees){
			if (e instanceof Programmer){
				linesOfCodeWritten += e.work();
				e = (Programmer) e;
			}
			else if (e instanceof Tester){
				linesOfCodeTested += e.work();}
			else return 0;
		}
		int total = linesOfCodeWritten+linesOfCodeTested;
		
		while (linesOfCode<= total){
			day++;
			doProject();
		}
		return day;
	}
	
	public String toString(){
		String s = "The time consumed to do the Project is: "+doProject()+"\n";
		for (Employee e : employees){
			s += e.toString()+"\n";
		}
		return s;
	}
	
    public static void main(String args[]) throws FileNotFoundException {
    	Project p = new Project(100, 5);
    	Employee a = new Programmer("May", 2333, 10);
    	Employee b = new Tester("bad", 5555, 9); 
    	p.addEmployee(a);
    	p.addEmployee(b);
    	System.out.println(p.toString());
    	
    }
}
