package lailaCh10;

/* 
 * Design a CargoShip class that extends the Ship class. 
 * The CargoShip class should have the following members: 
A field for the cargo capacity in tonnage (an int). 
A constructor and appropriate accessors and mutators. 
A toString method that overrides the toString method in the base class. 
The CargoShip class’s toString method 
should display only the ship’s name and the ship’s cargo capacity. 
 */
public class CargoShip extends Ship {

	   int noOfTonns;  // field for the cargo capacity in tonnage (an int)


	   public CargoShip(String name, int year, int noOfTonns) {
	       super(name, year);

	       this.noOfTonns = noOfTonns;

	   }

	   public int getNoOfTonns() {  
	       return noOfTonns;
	   }

	// toString method implementation
	   public String toString() {

	       return "\n Ship name :" + getShipName() +

	       "\nShip Capacity :" + getNoOfTonns();
	   }
	}