package gui;

import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class EnhancedWOM extends Application {

	@Override
	public void start(Stage primStage) throws Exception {
		
		primStage.setScene(new EWOMMainScene(new BorderPane()));
		primStage.setHeight(720);
		primStage.setWidth(1280);
		
		primStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
