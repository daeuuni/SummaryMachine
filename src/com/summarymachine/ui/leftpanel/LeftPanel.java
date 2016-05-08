package com.summarymachine.ui.leftpanel;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class LeftPanel extends JPanel {
	private int panelWidth;
	private int panelHeight;

	public LeftPanel(int panelWidth, int panelHeight) {
		this.panelWidth = panelWidth + 20;
		this.panelHeight = panelHeight;
	}

	public void leftComponents(Container contentPane) {
		this.setPreferredSize(new Dimension(panelWidth, panelHeight));
		this.setLayout(new GridLayout(6, 0));

	}

}