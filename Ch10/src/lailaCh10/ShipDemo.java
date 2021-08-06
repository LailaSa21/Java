package lailaCh10;


public class ShipDemo {

   public static void main(String[] args) {

       // create an array of type ship of size

       Ship[] ships = new Ship[3];

       // initialize constructors

       ships[0] = new Ship("Britannic", 2002);

       ships[1] = new CruiseShip("Admiral", 1978, 900);

       ships[2] = new CargoShip("Calypso", 2000, 400);

       // print toString methods

       for (int i = 0; i < ships.length; i++)

           System.out.println(ships[i].toString());

   }
}