package lailach112;

	import com.sun.glass.ui.Screen;

import javafx.application.Application;

	import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;

	import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.layout.HBox;

	import javafx.scene.layout.VBox;

	import javafx.stage.Stage;

	public class test extends Application {


		public static void main(String[] args) {

			// TODO Auto-generated method stub

			launch(args);

		}

		@Override

		public void start(Stage stg) throws Exception {

			// TODO Auto-generated method stub

			// create a Button with YOUR NAME displayed
			Button aButton = new Button("Laila");
			

			Node hbx = null;
			// create an HBox container named hbx with the button inside
			HBox hbox = new HBox(hbx);			
			
			Button bhx = new Button();
			

			((Labeled) hbx).setAlignment(Pos.BASELINE_RIGHT);// this code is mostly correct.  Fix it
			Scene scn = new Scene(  bhx, 300, 100);
			// create a 300 by 100 Scene named scn containing the hbx

			stg.setScene(scn);

			// set the title of the Stage to also be your full name
			
			stg.setTitle("Laila kashkash");

			stg.show();

		}

	}


