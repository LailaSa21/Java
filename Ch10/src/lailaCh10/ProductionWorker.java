package lailaCh10;

public class ProductionWorker extends Employee
{ private int Shift; // 1 = day 2 = night
private double HourlyPayRate;

public ProductionWorker()
{
   super();
   Shift = 0;
   HourlyPayRate = 0;
}
public ProductionWorker(String name, String empNo, String hDate, int shft, double rate)
{
   super(name,empNo,hDate);
   Shift = shft;
   HourlyPayRate = rate;
}
// accessor
int getShift()
{
   return Shift;
}
double getHourlyPayRate()
{
   return HourlyPayRate;
}

// mutator
void setShift(int sh)
{
   
   Shift = sh;
   
}
void setHourlyPayRate(double rate)
{
   HourlyPayRate = rate;
}
   // toString method implementation
public String toString()
{
 return ("\nInformation of the Worker --" + "\nName: " + getEmployeeName() + "\nEmployee Number: " + getEmployeeNumber() + "\nHire Date: " + getHireDate() + "\nShift (1 = day 2 = Night) : " + Shift + "\nHourly Rate Applicable: " + HourlyPayRate + "\n\n");
}


}