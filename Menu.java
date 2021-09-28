package assessment2;

public class Menu 
{

	public static void main(String[] args) 
	{
		Catalogue catalogue= new Catalogue();
		Service service;
		boolean finish = false;
		char option;
		while (!finish)
		{
			option = Console.askChar("Welcome to Golden Pet Grooming. Please choose from A)dd a service, F)ind a service, P)rint - Show a list of all services, S)ave, L)oad and Q)uit the application. (c) 2019 Golden Pet Grooming. All rights reserved.");

			switch(option)
			{
			case 'A':
				service = new Service();
				service.ask();
				catalogue.addService(service);
				break;
			case 'F':
				service = new Service ();
				String ServName = service.askName("Enter Service name: ");
					// check to see if service is already in container
				if ( catalogue.find(ServName) !=null)
					System.out.println("Service found! " +catalogue.find(ServName));
				else
					System.out.println("Error: Service not found!");
				break;
			case 'P':
				System.out.println("Service name: ");
				catalogue.printE();
				break;
			case 'S':
				catalogue.fileWrite();
				break;
			case 'L':
				catalogue.fileRead();
				break;
			case 'Q':
				System.out.println("End of the application");
				finish = true;
				break;

			}
		}

	}

}