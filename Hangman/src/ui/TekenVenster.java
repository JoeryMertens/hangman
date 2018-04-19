package ui;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import domain.*;

public class TekenVenster extends Canvas {

	private static final long serialVersionUID = 1L;
	private Tekening tekening = null;

	public TekenVenster(Tekening tekening) {
		this.setPreferredSize(new Dimension(400, 400));
		setTekening(tekening);
	}

	private void setTekening(Tekening tekening) {
		if (tekening == null)
			throw new UiException("Tekening mag niet null zijn");
		this.tekening = tekening;
	}

	public void teken() {
		
		System.out.println(tekening);
		repaint();
	}

	@Override
	public void paint(Graphics graphics) {
		for (Vorm vorm:tekening.getLijst()) {
		    if (vorm.isZichtbaar()) {
                vorm.teken(graphics);
            }
		}
	}
}
