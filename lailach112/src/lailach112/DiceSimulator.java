package lailach112;

/*cis315 Spring 2020 JavaFX project
 * Author:laila
 * Date: 3/18/2020
 * Project: 12-6. Dice Simulator
 * Description:
 * Create a JavaFX application that simulates rolling a pair of dice.
 * When the user clicks a button, the application should generate two random numbers, 
 * each in the range of 1 through 6,
 * to represent the value of the dice. Use ImageView controls to display the dice.
 * 
 */

// import statements
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.*;
import java.util.Random;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class DiceSimulator extends Application {
	// Create image object
	private int d1, d2;
	private ImageView viewer1, viewer2;
	private Label label1, label2;
	private String one, two;
	private Image ie1, ie2, ie3, ie4, ie5, ie6;
	private Image imgArray[] = null;
	HBox hbox = null;
	VBox vbox = null;

	//the main basic JavaFX-based program
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// call the 6 images
		imgArray = new Image[6]; 
		imgArray[0] = new Image("file:image/Die1.bmp");
		imgArray[1] = new Image("file:image/Die2.bmp");
		imgArray[2] = new Image("file:image/Die3.bmp");
		imgArray[3] = new Image("file:image/Die4.bmp");
		imgArray[4] = new Image("file:image/Die5.bmp");
		imgArray[5] = new Image("file:image/Die6.bmp");
		ie1 = new Image("file:image/Die1.bmp");
		ie2 = new Image("file:image/Die2.bmp");
		ie3 = new Image("file:image/Die3.bmp");
		ie4 = new Image("file:image/Die4.bmp");
		ie5 = new Image("file:image/Die5.bmp");
		ie6 = new Image("file:image/Die6.bmp");

		 //Setting the image view

		viewer1 = new ImageView();
		viewer2 = new ImageView();
		hbox = new HBox(10);
		Button rollButton = new Button("Roll"); // user clicks a button

		// generate two random numbers in the range of 1 through 6 for d1 and d2
		rollButton.setOnAction(event -> {
			d1 = (int) (Math.random() * 6) + 1;
			d2 = (int) (Math.random() * 6) + 1;

			one = Integer.toString(d1);
			two = Integer.toString(d2);
			label1.setText(one);
			label2.setText(two);
			viewer1 = new ImageView(imgArray[d1 - 1]); //Use ImageView controls to display the dice
			viewer2 = new ImageView(imgArray[d2 - 1]);
			viewer1.setFitWidth(200);
			viewer1.setPreserveRatio(true); //Setting the preserve ratio of the image view 
			viewer2.setFitWidth(200);  //setting the width of the image view 
			viewer2.setPreserveRatio(true); 
			vbox.getChildren().remove(hbox);
			hbox = new HBox(10);
			hbox.getChildren().addAll(viewer1, viewer2);

			// vbox.getChildren().remove(hbox);
			vbox.getChildren().addAll(hbox);
		});

		label1 = new Label();
		label2 = new Label();

		hbox.getChildren().addAll(viewer1, viewer2);
		vbox = new VBox(10, rollButton, label1, label2);
		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().addAll(hbox);
		Scene scene = new Scene(new Group(), 450, 350); //Creating a Group object 
		Group root = (Group) scene.getRoot();
		root.getChildren().add(vbox);
		primaryStage.setScene(scene); // Add the Scene to the Stage.

		primaryStage.setTitle("Dice Simulator"); // set the title

		primaryStage.show();  //Displaying the contents of the stage.
	}
} // end class Dice Simulator
