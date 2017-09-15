package gui;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class EWOMMainScene extends Scene {

	public EWOMMainScene(Parent parent) {
		super(parent);
		
		BorderPane rootBP = (BorderPane) parent;
		
		rootBP.setCenter(new StanceSelector());
		rootBP.setRight(new PartyListView());
		
	}

}
