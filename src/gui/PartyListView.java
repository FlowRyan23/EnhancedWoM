package gui;

import data.Data.Party;
import dataHandling.InputManager;
import gui.Number.NumberType;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import logic.PartyListController;

public class PartyListView extends ScrollPane {

	private GridPane rootGridPane;
	private PartyListController controller;
	
	private Text[] partys = new Text[Party.count];
	private Number[] compatabilities = new Number[Party.count];
	private HBox[] buttonTrays = new HBox[Party.count];
	
	public PartyListView() {
		
		controller = new PartyListController(this);
		rootGridPane = new GridPane();
		
		for(int i=0; i<partys.length; i++) {
			Party p = Party.values()[i];
			
			partys[i] = new Text(p.toString());
			compatabilities[i] = new Number("0", NumberType.PERCENT);
			SimpleDoubleProperty compatI = InputManager.instance.get("compat_" + p, new SimpleDoubleProperty());
			final int index = i;
			compatI.addListener(c->{
				compatabilities[index].set("" + compatI.get());
			});;
			buttonTrays[i] = new HBox();
			
			Button increaseButton = new Button("+");
			increaseButton.setOnAction(e->controller.increaseCompatability(p));
			
			Button decreaseButton = new Button("-");
			decreaseButton.setOnAction(e->controller.decreaseCompatablility(p));
			
			Button selStanceButton = new Button("^");
			selStanceButton.setOnAction(e->controller.selectStance(p));
			
			buttonTrays[i].getChildren().addAll(increaseButton, decreaseButton, selStanceButton);
			buttonTrays[i].getChildren().forEach(c->{
				HBox.setMargin(c, new Insets(0, 2, 0, 2));
			});
		}
		
		rootGridPane.addColumn(0, partys);
		rootGridPane.addColumn(1, compatabilities);
		rootGridPane.addColumn(2, buttonTrays);
		rootGridPane.setHgap(5);
		
		setContent(rootGridPane);
		setPadding(new Insets(5, 0, 0, 5));
		setPrefSize(300, 720);
	}
	
}
