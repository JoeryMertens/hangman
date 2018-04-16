package ui;

import javax.swing.*;

import domain.DomainException;
import domain.Speler;

public class Launcher {

	
	public static void main(String[] args) throws DomainException {
		
		JFrame f = new JFrame();
		String speler = JOptionPane.showInputDialog(f, "Welkom! \nHoe heet je?");
		Speler player = new Speler(speler);
		Object[] shapes = { "Cirkel", "Rechthoek" };
		Object keuze = JOptionPane.showInputDialog(null, "Wat wilt u tekenen", "input", JOptionPane.INFORMATION_MESSAGE,
				null, shapes, null);
		JOptionPane.showMessageDialog(f, player.toString()+" heeft als score: "+player.getScore());
		new PictionaryUi(player);
	}
}
