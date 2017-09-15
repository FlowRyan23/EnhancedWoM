package gui;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import logic.StanceSelectorController;

public class StanceSelector extends Pane {
	
	public StanceSelector() {
		
		StanceSelectorController controller = new StanceSelectorController();
		
		VBox vBox = new VBox();
		HBox answerButtonTrey = new HBox();
		Text statement = new Text();
		statement.textProperty().bind(controller.getCurrentStatementProperty());
		
		vBox.getChildren().addAll(statement, answerButtonTrey);
		
		Button agreeButton = new Button("Agree");
		agreeButton.setOnAction(e->controller.setStance(1));
		Button neutralButton = new Button("neutral");
		neutralButton.setOnAction(e->controller.setStance(0));
		Button disagreeButton = new Button("disagree");
		disagreeButton.setOnAction(e->controller.setStance(-1));
		answerButtonTrey.getChildren().addAll(agreeButton, neutralButton, disagreeButton);
		
		getChildren().add(vBox);
	}
	
}
