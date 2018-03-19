import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import Window.MenuItemListener;

import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;

public class Window extends JFrame
	{
	private JTextField inputField;
	private JLabel displayField;
		
	public Window()
		{
		super();
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Nova Tactics! [APLHA]");
		setLayout(new GridLayout(20, 20));
		
		Soldier.army.add(new Soldier(1, 1));

		for(int i = 1; i < 400; i++)
			{
			JButton myButton = new JButton(Integer.toString(i));
			myButton.setForeground(Color.BLACK);
			myButton.setBackground(randomColor());
			myButton.addActionListener(new MenuItemListener());
			myButton.setOpaque(true);
			
			add(myButton, BorderLayout.SOUTH);	
			}
		
		JMenu mathMenu = new JMenu("Operations");
		MenuItemListener myLis = new MenuItemListener();
		
		JMenuItem square = new JMenuItem("Square");
		square.addActionListener(myLis);
		mathMenu.add(square);
		JMenuItem cube = new JMenuItem("Cube");
		cube.addActionListener(myLis);
		mathMenu.add(cube);
		JMenuItem abVal = new JMenuItem("Absolute Value");
		abVal.addActionListener(myLis);
		mathMenu.add(abVal);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(mathMenu);
		setJMenuBar(menuBar);
		}
	
	public Color randomColor()
		{
		int randomNum = (int) (Math.random() * 3);
		
		switch(randomNum)
			{
			case 0:
				{
				return Color.GREEN;	
				}
			case 1:
				{
				return Color.GREEN;		
				}
			case 2:
				{
				return Color.YELLOW;		
				}
			}
		return Color.green;
		}
	
	private class MenuItemListener implements ActionListener
	{
	
	 public void actionPerformed(ActionEvent aE)
		 {
		 try
			{
			String command = aE.getActionCommand();
			 double i = Double.parseDouble(inputField.getText());
			 if(command.equals("Square"))
				 {
				 i = Math.pow(i, 2);
				 }
			 else if(command.equals("Cube"))
				 {
				 i = Math.pow(i, 3); 
				 }
			 else
				 {
				 i = Math.abs(i);
				 }
			DecimalFormat df = new DecimalFormat("#.###");
			df.setRoundingMode(RoundingMode.CEILING);
			inputField.setText(df.format(i));	
			}
		catch(NumberFormatException e)
			{
			displayField.setText("Current Value? ");	
			} 
		 }
	}
	}
