package javagit;

public class Employee {
	int ep_id;
	String name;
	boolean isMale;
	static String COMPANY_NAME="Bajaj"; 
	/* comapnany name is permanent and
	will be same every where we use */
	Employee(){
		ep_id = 932;
		name = "satyam";
		isMale = true;
	}
	
	void display() {
		System.out.println(name);
		System.out.println("His employee id is " + ep_id);
		}
}

