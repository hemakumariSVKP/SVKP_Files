package com.HemaKumari.assignment;

		import com.HemaKumari.assignment.employees.Manager;
		import com.HemaKumari.assignment.employees.Developer;
		import com.HemaKumari.assignment.utilities.UtilityClass;

		public class Main {
		    public static void main(String[] args)
		    {
		        Manager manager = new Manager("satya", "Mng001", 80000, "Sales");
		        Developer developer = new Developer("sankar", "Dev001", 60000, "Java");

		        UtilityClass.printEmployeeDetails(manager.getName(), manager.getEmployeeId(), manager.getSalary());
		        UtilityClass.printEmployeeDetails(developer.getName(), developer.getEmployeeId(), developer.getSalary());
		    }
}
