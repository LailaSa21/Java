package lailaCh10;

public class testShiftSupervisor {

    public static void main(String []args)
    {
        ShiftSupervisor ShiftSupervisorObject = new ShiftSupervisor();
        
        ShiftSupervisorObject.setEmployeeName("Mohmed");
        ShiftSupervisorObject.setEmployeeNumber("345-A");
        ShiftSupervisorObject.setHireDate("12/Jan/2020");
        ShiftSupervisorObject.setAnnualSalary(99000);
        ShiftSupervisorObject.setAnnualProductionBonus(11000);
        System.out.println(ShiftSupervisorObject.toString());
    
        ShiftSupervisor ShiftSupervisorObject1 = new ShiftSupervisor("Ali","A45-M","10/December/2020",77000,6000);
        System.out.println(ShiftSupervisorObject1.toString());
    
      
    }
}
