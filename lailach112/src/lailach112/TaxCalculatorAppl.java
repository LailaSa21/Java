package lailach112;

/*
 * cis315 Spring 2020 JavaFX project
 * Author:laila
 * Date: 3/15/2020
 * Project: Total, Sale Tax, Tip Calculator
 * Description:
 * Create a JavaFX application that lets the user enter the food charge for a meal at a restaurant.
 * When a button is clicked, the application should calculate and display 
 * the amount of an 18 percent tip on the total food charge,
 * 7 percent sales tax, and the total of all three amounts.
 */

//import statements
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TaxCalculatorAppl extends Application {

	// class for tax calculator
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Calculator");

		GridPane rootNode = new GridPane();
		rootNode.setPadding(new Insets(15));
		rootNode.setHgap(5);
		rootNode.setVgap(5);
		rootNode.setAlignment(Pos.CENTER);

		Scene myScene = new Scene(rootNode, 300, 200);
		
		//calculate meal charge, tax amount, tip amount, and total bill
	
		rootNode.add(new Label("Amount:"), 0, 0);  //user has to enter the charge for the meal
		TextField firstValue = new TextField();
		rootNode.add(firstValue, 1, 0); 
		rootNode.add(new Label("Toatal is:"), 0, 5);
		Button aButton = new Button("Calculate"); //Button name Calculate
		rootNode.add(aButton, 1, 2);
		GridPane.setHalignment(aButton, HPos.LEFT);
		TextField result = new TextField();
		result.setEditable(false);
		rootNode.add(result, 1, 5);
		TextField tax = new TextField();
		rootNode.add(new Label("Tax:"), 0, 3); // Calculate the tax
		tax.setEditable(false);
		rootNode.add(tax, 1, 3);
		TextField tip = new TextField();
		rootNode.add(new Label("Tip:"), 0, 4); // Calculate the Tip
		tip.setEditable(false);
		rootNode.add(tip, 1, 4);

		aButton.setOnAction(e -> {
			Float value1 = Float.valueOf(firstValue.getText());

			Float value2 = (value1 * 18) / 100; //Amount of an 18 percent tip on the total food charge
			Float value3 = (value1 * 7) / 100; //7 percent sales tax, and the total of all three amounts
			Float r = value1 + value2 + value3;
			tax.setText(value3.toString());
			tip.setText(value2.toString());
			result.setText(r.toString());
		});

		// Add the Scene to the Stage.
		primaryStage.setScene(myScene);

		primaryStage.show(); //Displaying the contents of the stage.
	} 

	//the main basic JavaFX-based program
	public static void main(String[] args) {
		launch(args); 
	}
} // end class Tax Calculator Application.