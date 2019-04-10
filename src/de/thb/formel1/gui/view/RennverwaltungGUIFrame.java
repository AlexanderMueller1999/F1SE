package de.thb.formel1.gui.view;



import java.awt.*;
import javax.swing.JFrame;

import de.thb.formel1.gui.controller.WindowClosingAdapter;

/**
 * Ist  ein Fenster f�r die Rennverwaltung.
 * 
 * @author Susanne Busse
 * @version 0.1 
 * @since 03.04.2019
 * 
 */
public class RennverwaltungGUIFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private RennverwaltungGUIContentView myPanel;
	private Container c;
	
	public RennverwaltungGUIFrame(String Title) {
		super(Title);
		init();
	}
	
	public void init() {
		//Bei Swing wichtig, da Standardkomponente bereits ein Panel ist.
		c = getContentPane();  

		
		// Eigenen Inhalt als Panel hinzuf�gen
		myPanel = new RennverwaltungGUIContentView();
		c.add(myPanel);
		
	
	    pack();
		setVisible(true); /* Fenster soll sichtbar sein */
		
	
		//Listener f�r Fenster zum Schlie�en
		addWindowListener(new WindowClosingAdapter(true));
	}
	
}
