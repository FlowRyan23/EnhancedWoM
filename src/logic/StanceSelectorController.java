package logic;

import basic.BaseKit;
import data.Data;
import dataHandling.DuplicateKeyException;
import dataHandling.InputManager;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;

public class StanceSelectorController {

	private int curStatementInex;
	private SimpleStringProperty curStatement = new SimpleStringProperty();
	
	public StanceSelectorController() {
		try {
			InputManager.instance.add("user_Stance", new SimpleListProperty<Integer>());
		} catch (DuplicateKeyException dke) {
			System.out.println(dke.getMessage());
		}
		curStatementInex = 0;
		curStatement.set(Data.statements[curStatementInex]);
	}
	
	public void setStance(int stance) {
		InputManager.instance.get("user_Stance", new SimpleListProperty<>()).set(curStatementInex, stance);
		nextStatement(); 
	}
	
	public void nextStatement() {
		curStatementInex = BaseKit.bound(0, ++curStatementInex, Data.statements.length -1);
		curStatement.set(Data.statements[curStatementInex]);
	}
	
	public void previousStatement() {
		curStatementInex = BaseKit.bound(0, --curStatementInex, Data.statements.length -1);
		curStatement.set(Data.statements[curStatementInex]);
	}
	
	public void setStatement(int index) {
		curStatementInex = BaseKit.bound(0, index, Data.statements.length -1);
		curStatement.set(Data.statements[curStatementInex]);
	}
	
	public SimpleStringProperty getCurrentStatementProperty() {
		return curStatement;
	}
	
}
