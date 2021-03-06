package hu.bme.mit.md2g.ui.browser;

import com.nomagic.actions.AMConfigurator;
import com.nomagic.actions.ActionsManager;
import com.nomagic.magicdraw.actions.BrowserContextAMConfigurator;
import com.nomagic.magicdraw.actions.MDActionsCategory;
import com.nomagic.magicdraw.ui.browser.Node;
import com.nomagic.magicdraw.ui.browser.Tree;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.StateMachine;

import hu.bme.mit.md2g.ui.browser.action.PerfomrCheckAction;
import hu.bme.mit.md2g.ui.browser.action.TransformCompositeStatemachineAction;
import hu.bme.mit.md2g.ui.browser.action.TransfromSingleStatemachineAction;

public class GammaBrowserConfigurator implements BrowserContextAMConfigurator{

	private static final String EXPORT_STATE_MACHINE_AS_GCL = "Export State Machine as gcl";
	private static final String EXPORT_AS_GCL_NAME = "Export block structure as gcl";
	private static final String GAMMA_TRA_SINGLE = "GAMMA_TRA_SINGLE";
	private static final String GAMMA_TRA_COMP = "GAMMA_TRA_COMP";

	@Override
	public int getPriority() {
		return AMConfigurator.MEDIUM_PRIORITY;
	}

	@Override
	public void configure(ActionsManager manager, Tree tree) {
		
		MDActionsCategory category = new MDActionsCategory("GAMMA_BROWSER", "Gamma Transformation");
		category.setNested(true);
		manager.addCategory(category);
		
		for (final Node node: tree.getSelectedNodes()) {
			Object userObject = node.getUserObject();
			
			//selected object is a class
			if (userObject instanceof Class) {
				Class selectedClass = (Class) userObject;
				if (selectedClass.getAppliedStereotypeInstance() != null) {
					try {	
						InstanceSpecification instancespec = selectedClass.getAppliedStereotypeInstance();
						
						if (instancespec.getClassifier().stream().filter(it -> "Block".equals(it.getName())).findAny().isPresent()) {
							category.addAction(new TransfromSingleStatemachineAction(GAMMA_TRA_SINGLE, EXPORT_STATE_MACHINE_AS_GCL, selectedClass));
							category.addAction(new TransformCompositeStatemachineAction(GAMMA_TRA_COMP, EXPORT_AS_GCL_NAME, selectedClass));
							//category.addAction(new PerfomrCheckAction("GAMMA_CHECK_ACTION", "Perform Formal Verification on model", selectedClass));
						}
					} catch (Exception e) {
						e.printStackTrace();
					}	
				}
			}
		}
	}
}