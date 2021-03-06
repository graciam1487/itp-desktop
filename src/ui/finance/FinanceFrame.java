package ui.finance;

import java.awt.EventQueue;

import ui.components.KFrame;
import ui.components.KTab;
import ui.components.TabNavPanel;
import ui.components.TabPanel;
import ui.components.TabStruct;
import ui.finance.tabs.CreateExpenses;
import ui.finance.tabs.ExpensesDetails;
import ui.finance.tabs.FinanceCalculation;
import ui.finance.tabs.GraphicalViews;
import ui.finance.tabs.UpdateExpenses;


public class FinanceFrame extends KFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinanceFrame frame = new FinanceFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FinanceFrame() {
		
		TabStruct[] ts = {
				new TabStruct(CreateExpenses.class, "Create"),
				new TabStruct(UpdateExpenses.class, "Manage Expenses"),
				new TabStruct(ExpensesDetails.class, "View"),
				new TabStruct(FinanceCalculation.class,"Calculation"),
				new TabStruct(GraphicalViews.class,"Graphical View")
				
		};
		
		setStruct(ts);
		
//		KTab[] tabs  =  new KTab[2];
//		tabs[0] = new CreateExpenses();
//		tabs[1] = new UpdateExpenses();
//		
//		
//		new TabPanel(this, tabs, new TabNavPanel(this));

	}

}
