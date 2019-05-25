package swingcalc;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Calculater_UI {
	JFrame frame = new JFrame("Calculater");
	JPanel panel = new JPanel(new FlowLayout());
	
	JTextArea text = new JTextArea(1,20);
	JButton but1 = new JButton("1");
	JButton but2 = new JButton("2");
	JButton but3 = new JButton("3");
	JButton but4 = new JButton("4");
	JButton but5 = new JButton("5");
	JButton but6 = new JButton("6");
	JButton but7 = new JButton("7");
	JButton but8 = new JButton("8");
	JButton but9 = new JButton("9");
	JButton but0 = new JButton("0");

	JButton butadd = new JButton("+");
	JButton butsub = new JButton("-");
	JButton butmulti = new JButton("*");
	JButton butdiv = new JButton("/");
	JButton buteq = new JButton("=");
	
	JButton butclear = new JButton("C");
	
	public void ui() {
		frame.setVisible(true);
		frame.setSize(250,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		panel.add(text);
		panel.add(but1);
		panel.add(but2);
		panel.add(but3);
		panel.add(but4);
		panel.add(but5);
		panel.add(but6);
		panel.add(but7);
		panel.add(but8);
		panel.add(but9);
		panel.add(but0);
		
		panel.add(butadd);
		panel.add(butsub);
		panel.add(butmulti);
		panel.add(butdiv);
		panel.add(buteq);
		panel.add(butclear);
		
	}
}
