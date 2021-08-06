package lailaCh10;

import java.util.*;
public class testProductionWorker {

	
	
public static void main(String []args)
{
    ProductionWorker productionWorkerObject = new ProductionWorker();
    
    productionWorkerObject.setEmployeeName("Mohmed");
    productionWorkerObject.setEmployeeNumber("345-A");
    productionWorkerObject.setHireDate("12/Jan/2020");
    productionWorkerObject.setShift(1);
    productionWorkerObject.setHourlyPayRate(15);
    System.out.println(productionWorkerObject.toString());

    ProductionWorker productionWorkerObject1 = new ProductionWorker();
    productionWorkerObject1.setEmployeeName("Ahmed");
    productionWorkerObject1.setEmployeeNumber("W34-A");
    productionWorkerObject1.setHireDate("12/Jan/2020");
    productionWorkerObject1.setShift(1);
    productionWorkerObject1.setHourlyPayRate(35);
    System.out.println(productionWorkerObject1.toString());

    ProductionWorker productionWorkerObject2 = new ProductionWorker();
    productionWorkerObject2.setEmployeeName("Nour");
    productionWorkerObject2.setEmployeeNumber("123-6");
    productionWorkerObject2.setHireDate("12/Jan/2020");
    productionWorkerObject2.setShift(2);
    productionWorkerObject2.setHourlyPayRate(30);
    System.out.println(productionWorkerObject2.toString());

}
}


