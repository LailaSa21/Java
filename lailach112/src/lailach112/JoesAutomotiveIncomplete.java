package lailach112;

/*
 * cis315 Spring 2020 JavaFX project
 * Author:laila
 * Date: 3/6/2020
 * Project: 12-8. Joe’s Automotive 
 * Description:
 * 12-8. Joe’s Automotive 
Joe’s Automotive performs the following routine maintenance services: 
Oil change: $35.00 
Lube job: $25.00 
Radiator flush: $50.00 
Transmission flush: $120.00
Inspection: $35.00 
Muffler replacement: $200.00 
Tire rotation: $20.00 
Joe also performs other non-routine services and charges for parts and for labor ($60 per hour). 
Create a GUI application that displays the total for a customer’s visit to Joe’s.
 * 
 */
//import statements
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JoesAutomotiveIncomplete extends Application {

	// A simple class to keep track of the information for
	// services provided by Joe's automotive
	class Service {
		String sDesc = ""; // description of service
		double cost = 0.0; // cost of this service

		public Service(String desc, double c) {
			sDesc = desc;
			cost = c;
		}

		// since this is such a simple class, I am leaving the
		// member variables protected (default) for easy access from the code
	}

	public ArrayList<Service> aServices = new ArrayList(); ; // this will be filled with all the services we provide
	public ArrayList<TextField> atFields = new ArrayList();
	public Label lblTot;

	// This is a basic JavaFX-based program, so main is very simple
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launch(args);
	}

	@Override
	public void start(Stage stg) throws Exception {

		// put our form information into a nice list for later access
		// web applications would probably keep this in a database table
		// if our descriptions or costs ever change, we only need to change this

		aServices = new ArrayList<>();

		// description and cost for all services
		aServices.add(new Service("Oil change", 35));
		aServices.add(new Service("Lube job", 25));
		aServices.add(new Service("Radiator flush", 50));
		aServices.add(new Service("Transmission flush", 120));
		aServices.add(new Service("Inspection", 35));
		aServices.add(new Service("Muffler replacement", 200));
		aServices.add(new Service("Tire rotation", 20));
		aServices.add(new Service("Non-routine hourly rate", 60));

		// The rest of the program manages how this information is displayed in the GUI

		// create the gridpane to later add to the stage, label with description and
		// cost

		// Create a GridPane. - this is handy for nicely organized items in a GUI
		GridPane gridpane = new GridPane();
		gridpane.setHgap(10);
		gridpane.setVgap(10);

		TextField tField;
		int r = 1; // the row of our table as we create the GUI elements
		// the row starts at one because row 0 is just there for top spacing

		// ******** initialize the atFields variable to be an new empty ArrayList
		// ******** if you don't do it correctly, you will get a nasty runtime error

		gridpane.add(new Label(""), 0, 0);

		Label lbl; // temp variable for reference to labels created in the loop below

		// process the information stored in the ArrayList table from above
		// this loop iterates through each item in the aServices ArrayList
		for (Service oService : aServices) {

			// oService is on item (object) from the aServices ArrayList

			// lay out the information using a gridpane

			// description column
			gridpane.add(lbl = new Label(oService.sDesc + ":"), 1, r); // column 1, row r
			lbl.setAlignment(Pos.BASELINE_RIGHT);
			lbl.setMinWidth(200);

			// cost column - column 2, row r

			// description column
			gridpane.add(lbl = new Label(String.format ("$%7.2", oService.cost )), 2, r); // column 2, row r
			lbl.setAlignment(Pos.BASELINE_RIGHT);
			lbl.setMinWidth(50);

			// ******** write the code to retrieve and display the cost in a label
			// ******** see the previous code as an example

			// user-entry of quantity of this service - column 3, row r
			tField = new TextField();
			tField.setMaxWidth(40); // give this a smaller width than default (too wide)
			tField.setAlignment(Pos.BASELINE_RIGHT);

			// ******** add the code to display this textField in the fourth column
			
			gridpane.add(tField,4,r); //column 4,row r
			
			// now store the handle to the textField into which the user will type
			atFields.add(tField); // for later reference in the button click handler

			r++;
		}

		lblTot = new Label("" + 0);
		gridpane.add(lblTot, 3, r);

		Button btnTotal = new Button("Calc Total");
		gridpane.add(btnTotal, 2, r++);
		btnTotal.setOnAction(new TotalButtonHandler()); // see the handler class below

		// ******* add a spacer row at the bottom of the grid
		// ******* see how a space was added at the top

		// Label lbl = new Label("testing...");
		HBox hbCols = new HBox(10, gridpane);
		// Create a Scene with the GridPane as its root node.

		Scene scene = new Scene(hbCols);

		// Add the Scene to the Stage.
		stg.setScene(scene);

		// set the title
		stg.setTitle("In Class Firday");

		// Show the window.
		stg.show();

	}

	// handle the clicking of the total button

	class TotalButtonHandler implements EventHandler {

		@Override
		public void handle(Event arg0) {

			// add up the number of items of each * cost

			double dTotal = 0;

			// ******** write a loop that processes the user input
			// ******** The textFields are in the atFields ArrayList variable
			// ******** atFields.get(0) will return the first textfield (oil change)
			// ******** read the value, and multiply it by the cost for that service
			// ******** the cost for the service is found in the .cost variable of the
			// aServices ArrayList
			// ******** example aService.get(0).cost will return the cost of an Oil Change
			for (int i= 0; i<aServices.size(); i++) {
				Service  oService = aServices.get(i);
				try {
				double dQuantity = Double.parseDouble(atFields.get(i).getText());
				dTotal += oService.cost * dQuantity;
			} catch (Exception e) {

			}
		}
				
				lblTot.setText("" + dTotal);
		
		}
	}
}
	

