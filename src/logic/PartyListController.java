package logic;

import data.Data.Party;
import dataHandling.DuplicateKeyException;
import dataHandling.InputManager;
import gui.PartyListView;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.ListChangeListener;

public class PartyListController {

	private final PartyListView partyListView;
	
	public PartyListController(PartyListView partyListView) {
		this.partyListView = partyListView;
		
		for(Party p: Party.values())
			try {
				InputManager.instance.add("compat_" + p , new SimpleDoubleProperty(0.0d));
			} catch (DuplicateKeyException dke) {
				System.out.println(dke.getMessage());
			}
		
		InputManager.instance.get("user_Stance", new SimpleListProperty<Integer>()).addListener(new ListChangeListener<Integer>() {
			@Override
			public void onChanged(Change c) {
				update();
			}
		});
		
	}
	
	public void increaseCompatability(Party party) {
		//TODO
	}
	
	public void decreaseCompatablility(Party party) {
		//TODO
	}
	
	public void selectStance(Party party) {
		SimpleListProperty<Integer> userStance = InputManager.instance.get("user_stance", new SimpleListProperty<Integer>());
		for(int i=0; i<party.stance.length; i++)
			userStance.set(i, party.stance[i]);
	}
	
	private void sort() {
		//TODO
	}
	
	private void update() {
		EWOMCalculator ewomCalc = new EWOMCalculator();
		int[] userStance = new int[Party.count];
		SimpleListProperty<Integer> userStanceProp = InputManager.instance.get("user_Stance", new SimpleListProperty<Integer>());
		
		for(int i=0; i<Party.count; i++)
			userStance[i] = userStanceProp.get(i).intValue();
		
		for(int i=0; i<Party.count; i++)
			InputManager.instance.get("compat_" + Party.values()[i], new SimpleDoubleProperty()).set(ewomCalc.compatibility(userStance, Party.values()[i].stance));
		
		sort();
	}
	
}
