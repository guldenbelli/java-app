package assessment2;

import java.io.*;
   
public class Service implements Serializable
{	
	private static final long serialVersionUID = 1L;

	// declare variables
	String ServName;
	
	// default constructor
		public Service()
		{
			setName("?");
		}
	// parameter constructor
		public Service(String ServName)
		{
			setName(ServName);
		}
	
	// set methods
		public void setName(String ServName)
		{
			this.ServName=ServName;
		}
		
	// get methods
	public String getName()
	{
		return ServName;
	
	}
	// ask method
	public void ask()
	{
		ServName = Console.askString("Please enter Service name: ");
	}
	
	// ask name method
	public String askName(String prompt)
	{
		setName(Console.askString("Enter Service Name: "));
		return ServName;
		}

	
	// print method
	public void print()
	{
		System.out.println("Service name: " +ServName);
	}
	
	// toString() method
	public String toString()
	{
		return ServName +"\t";
	}
	public void addservice(Service service) {
	
		
	}
}