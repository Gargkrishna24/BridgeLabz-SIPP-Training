package Class_and_Object;
import java.util.*;
public class Books {
	String name;
    int id;
    double salary;
    
    public Books(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
	public void displayDetails() {
		 System.out.println("Employee Details:");
	        System.out.println("Name   : " + name);
	        System.out.println("ID     : " + id);
	        System.out.println("Salary : ₹" + salary);
	}
	public static void main(String args[]) {
	Books emp= new Books("Aman", 218,230000.00);
	emp.displayDetails();

}
}