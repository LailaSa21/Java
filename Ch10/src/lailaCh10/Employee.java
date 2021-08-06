package lailaCh10;

/*
 * The class should keep the following information in fields: 
Employee name 
Employee number in the format XXX–L, where each X is a digit within the range 0–9 and the L is a letter within the range A–M. 
Hire date  
 */

public class Employee {
	private String EmployeeName;
	   private String EmployeeNumber; // format XXX-L, where each X is a digit within the range (0-9) and the letter L is a letter within the range (A-M).
	   private String HireDate;
	  
	   //default constructor
	   public Employee()
	   {
	           EmployeeName = "";
	           EmployeeNumber = "";
	           HireDate = "";
	   }
	   // parameterized constructor
	   public Employee(String name, String empNo, String hDate)
	   {
	       EmployeeName = name;
	       if (validateEmployeeNumber(empNo) == true)
	       {
	           EmployeeNumber = empNo;
	       }
	       else
	       {
	          System.out.println("\nInvalid Employee Number Format. Assigning default Employee number.");
	          EmployeeNumber = "999-M";
	       }
	       HireDate = hDate;
	   }
	   
	   // accesors
	   String getEmployeeName()
	   {
	       return EmployeeName;
	   }
	   String getEmployeeNumber()
	   {
	       return EmployeeNumber;
	   }
	   String getHireDate()
	   {
	       return HireDate;
	   }
	            
	   // mutators
	   void setEmployeeName(String nm)
	   {
	       EmployeeName = nm;
	   }
	   void setEmployeeNumber(String num)
	   {
	       
	       if ( validateEmployeeNumber(num) == true)
	       {
	           EmployeeNumber = num;
	       }
	       else
	       {
	          System.out.println("\n Invalid Employee Number Format. Assigning default Employee number.");
	          EmployeeNumber = "999-M";
	       }
	   }
	   void setHireDate(String dt)
	   {
	       HireDate = dt;
	   }
	   boolean validateEmployeeNumber(String num)
	   {
	       // format XXX-L, where each X is a digit within the range (0-9) and
	       // the letter L is a letter within the range (A-M).
	   
	       String[] arrOfStr = num.split("-");
	       int number;
	       char c;
	       
	       if  (arrOfStr.length == 2)
	       {
	         
	            try {
	  
	                 number = Integer.valueOf(arrOfStr[0]);
	                 // number = Integer.parseInt(arrOfStr[0]);
	            }
	            catch (Exception e) {
	                 return false;
	            }
	  
	            if ( (number >= 0) && (number <= 999) )
	            {
	                 c = arrOfStr[1].charAt(0);
	        
	                 if ( (c >= 'A') && ( c <= 'M') )
	                     return true;
	                 else
	                     return false;
	            }
	            else
	            {
	                 return false;
	            }
	      }
	      else
	      {
	            return false;
	      }
	   }
	} // end of class Employee