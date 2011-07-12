package org.freeplane.core.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class OptionPanelButtonListener implements ActionListener {
	private static List<ActionListener> list = new ArrayList<ActionListener>();
	
	public static void addButtonListener(ActionListener listener) {
		System.out.println("DOCEAR addButtonListener");
		list.add(listener);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("DOCEAR: actionPerformed: "+list.size());
		for(ActionListener listener : list) {
			listener.actionPerformed(e);
		}

	}

}