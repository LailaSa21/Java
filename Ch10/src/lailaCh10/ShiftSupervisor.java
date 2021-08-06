package lailaCh10;

public class ShiftSupervisor extends Employee
{
	private double AnnualSalary;
    private double AnnualProductionBonus;

    public ShiftSupervisor()
    {
       super();
       AnnualSalary = 0;
       AnnualProductionBonus = 0;
    }
    public ShiftSupervisor(String name, String empNo, String hDate, double sal, double bonus)
    {
       super(name,empNo,hDate);
       AnnualSalary = sal;
       AnnualProductionBonus = bonus;
    }
    // accessor
    double getAnnualSalary()
    {
       return AnnualSalary;
    }
    double getAnnualProductionBonus()
    {
       return AnnualProductionBonus;
    }

    // mutator
    void setAnnualSalary(double sal)
    {
       
       AnnualSalary = sal;
       
    }
    void setAnnualProductionBonus(double bonus)
    {
       AnnualProductionBonus = bonus;
    }
       // toString method implementation
    public String toString()
    {
     return ("\nShift Supervisor Information of the Worker --" + "\nName: " + getEmployeeName() + "\nEmployee Number: " + getEmployeeNumber() + "\nHire Date: " + getHireDate() + "\nAnnual Salary : " + AnnualSalary + "\nAnnual Production Bonus: " + AnnualProductionBonus + "\n\n");
    }

    
}