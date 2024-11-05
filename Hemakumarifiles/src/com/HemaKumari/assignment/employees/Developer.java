package com.HemaKumari.assignment.employees;

		public class Developer extends Employee 
		{
		    private String programmingLanguage;

		    // Constructor
		    public Developer(String name, String employeeId, double salary, String programmingLanguage) 
		    {
		        super(name, employeeId, salary);
		        this.programmingLanguage = programmingLanguage;
		    }

		    // Getter and Setter methods
		    public String getProgrammingLanguage() 
		    {
		        return programmingLanguage;
		    }

		    public void setProgrammingLanguage(String programmingLanguage) 
		    {
		        this.programmingLanguage = programmingLanguage;
		    }
        }
