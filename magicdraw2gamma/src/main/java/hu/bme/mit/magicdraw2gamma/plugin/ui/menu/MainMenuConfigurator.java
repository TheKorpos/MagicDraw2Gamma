/*
 *
 * Copyright (c) 2002 NoMagic, Inc. All Rights Reserved.
 */

package hu.bme.mit.magicdraw2gamma.plugin.ui.menu;

import com.nomagic.actions.AMConfigurator;
import com.nomagic.actions.ActionsCategory;
import com.nomagic.actions.ActionsManager;
import com.nomagic.magicdraw.actions.MDActionsCategory;

import hu.bme.mit.magicdraw2gamma.plugin.ui.menu.action.OpenGammaProfileAction;

public class MainMenuConfigurator implements AMConfigurator {

	String MD2G = "MD2G";

	/**
	 * Action will be added to manager.
	 */

	/**
	 * Creates configurator.
	 * 
	 * @param action
	 *            action to be added to main menu.
	 */
	public MainMenuConfigurator() {
	}

	/**
	 * @see com.nomagic.actions.AMConfigurator#configure(ActionsManager) Methods
	 *      adds action to given manager Examples category.
	 */
	@Override
	public void configure(ActionsManager manager) {
		// searching for Examples action category
		ActionsCategory category = (ActionsCategory) manager.getActionFor(MD2G);

		if (category == null) {
			// creating new category
			category = new MDActionsCategory(MD2G, MD2G);
			category.setNested(true);
			manager.addCategory(category);
		}
		
		category.addAction(new OpenGammaProfileAction("OPEN_GAMMA_PROFILE", "Import Gamma Profile"));
	}

	@Override
	public int getPriority() {
		return AMConfigurator.MEDIUM_PRIORITY;
	}
	
	

}