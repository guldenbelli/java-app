package assessment2;

import java.io.*;
import java.util.ArrayList;

//import java.util.ArrayList;

public class Catalogue 
{

	// declare ArrayList
	ArrayList<String> keys; 
	ArrayList<Service> catalogue;

	// Construct Container
	public Catalogue() 
	{
		catalogue = new ArrayList<Service>();
		keys = new ArrayList<String>(); 
	}
	
	// Adding services
	
	public void addService(Service aService)
	{
		catalogue.add(aService);
		keys.add(aService.getName());
	}
	// finding services
	public Service find(String servName)
	{
		int index = keys.indexOf(servName);
		if (index == -1) // if item is not found
			return null;
		else
			return catalogue.get(index);
	}

	// Printing services
	public void print() {
		for (int i = 0; i < catalogue.size(); i++) {
			System.out.println(catalogue.get(i));
		}
	}

	// printing using enhanced For Loop
	public void printE() {
		for (Service nTemp : catalogue) {
			System.out.println(nTemp);
		}
	}

	// Work out size of container
	public int getSize() {
		return catalogue.size();
	}

	// To write objects to a file
	public void fileWrite() 
	{
		try 
		{
			FileOutputStream fos = new FileOutputStream("catalogue.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(catalogue);
			oos.close();
			fos.close();
			System.out.println("File has been written");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	// To write objects to a file
	public void fileRead() 
	{
		try 
		{
			FileInputStream fis = new FileInputStream("catalogue.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			catalogue = (ArrayList) ois.readObject();

			System.out.println("File loaded");
		}

		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}

}