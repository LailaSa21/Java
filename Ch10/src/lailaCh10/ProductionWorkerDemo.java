package lailaCh10;

	import java.util.Scanner;
	public class ProductionWorkerDemo
	{
	   // start main method
	   public static void main(String[] args)
	   {
	       // create an object for Scanner class
	       Scanner input = new Scanner(System.in);
	       char choice;
	      
	       // repeat the loop until the user wants to exit
	       do
	       {
	           // prompt the user to enter the employee name
	           System.out.print("Enter the employee name: ");
	           String empName = input.nextLine();
	          
	           // prompt the user to enter the employee number
	           System.out.print("Enter the employee number in the format XXX-L (each X is a digit within the range 0-9 and the L is a letter within the range A-M): ");
	           String empNumber = input.nextLine();
	          
	           // prompt the user to enter the employee hire date
	           System.out.print("Enter the employee hire date: ");
	           String date = input.nextLine();
	          
	           // prompt the user to enter the employee shift
	           System.out.print("Enter the employee shift (1 for day shift and 2 for night shift): ");
	           int sh = Integer.parseInt(input.nextLine());
	          
	           // prompt the user to enter the employee hourly pay rate
	           System.out.print("Enter the hourly pay rate: $");
	           double rate = Double.parseDouble(input.nextLine());
	          
	           // create an object for ProductionWorker class
	           ProductionWorker worker = new ProductionWorker(empName, empNumber, date, sh, rate);
	          
	           // display the details of the employee
	           System.out.println("\nDetails of the employee: ");
	           System.out.println(worker);
	          
	           // prompt the user to enter the repetition choice
	           System.out.print("\nDo you want to demonstrate another ProductionWorker object? (Y/N): ");
	           choice = input.nextLine().charAt(0);
	           System.out.println();
	       }while(choice == 'Y' || choice == 'y');
	   } // end of main method
	} // end of ProductionWorkerDemo class
