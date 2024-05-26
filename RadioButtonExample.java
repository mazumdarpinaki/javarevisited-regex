import javax.swing.*;
import java.awt.event.*;

public class RadioButtonExample{
	public static void main(String ...args){
		JFrame frame =new JFrame("RadioButton Example");
		JPanel panel=new JPanel();

		JRadioButton   halfEmptyButton = new JRadioButton("Half Empty");
		JRadioButton   halfFullButton  = new JRadioButton("Half Full");
		JRadioButton twiceTheSizeButton = new JRadioButton("Twice the needed size");
		JTextField  positiveField = new JTextField("Positive statement about the glass");
		JTextField  negativeField = new JTextField("Negative statement about the glass");

		ButtonGroup group= new ButtonGroup();
		group.add(halfEmptyButton);
		group.add(halfFullButton);
		group.add(twiceTheSizeButton);
		

		panel.add(halfEmptyButton);
		panel.add(halfFullButton);
		panel.add(twiceTheSizeButton);
		panel.add(positiveField);
		panel.add(negativeField);

		halfEmptyButton .addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				if (e.getStateChange() ==ItemEvent.SELECTED)
					positiveField.setText("The glass is half empty.");
				else
					negativeField.setText("And it's not half empty");
			}
		});

		halfFullButton.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				if (e.getStateChange() == ItemEvent.SELECTED)
					positiveField.setText("The glass is half full");
				else
					negativeField.setText("And it's not half full");
			}
		});

		twiceTheSizeButton.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				if (e.getStateChange() == ItemEvent.SELECTED)
					positiveField.setText("The glass is twice the needed size");
				else
					negativeField.setText("The glass is not twice the needed size");
			}
		});





		frame.add(panel);
		frame.setSize(350,200);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


	}
}
/**
public class CheckBoxExample{
	public static void main(String [] args){
		JFrame frame=new JFrame("CheckBox Example");
		JPanel panel= new JPanel();

		JCheckBox nastyCheckBox=new JCheckBox("Nasty");
		JCheckBox brutishCheckBox =new JCheckBox("Brutish");
		JCheckBox shortCheckBox=new JCheckBox("Short");
		JTextField field = new JTextField("Here is what is your life like");
		
		nastyCheckBox.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				if (e.getStateChange()==ItemEvent.SELECTED)
					field.setText("Your life is nasty");
				else
					field.setText("Your life is not nasty");
			}
		});

		
		nastyCheckBox.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (nastyCheckBox.isSelected())
					field.setText("Your life is nasty");
				else
					field.setText("Your life is not nasty");
			}
		});
		brutishCheckBox.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				if (e.getStateChange()==ItemEvent.SELECTED)
					field.setText("Your life is brutish");
				else
					field.setText("Your life is not Brutish");
			}
		});

		shortCheckBox.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				if (e.getStateChange() ==ItemEvent.SELECTED)
					field.setText("Your life is short");
				else
					field.setText("Your life is not short");
			}
		});

		panel.add(nastyCheckBox);
		panel.add(brutishCheckBox);
		panel.add(shortCheckBox);
		panel.add(field);

		frame.add(panel);
		frame.setSize(350,200);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);



	}
}
/**
public class AlternateActionListener implements  ActionListener{
	private JFrame frame=new JFrame("Button Eamples");
	private JPanel panel=new JPanel();
	private JButton thisButton=new JButton("This");
	private JButton thatButton =new JButton("That");
	private JButton exitButton=new JButton ("Exit");
	private JTextField field=new JTextField("Text input and output area");
	private JTextArea area=new JTextArea("Text input and output area in detail");
	private JPasswordField passwordButton=new JPasswordField("password");

	public AlternateActionListener(){
		thisButton.addActionListener(this);
		thatButton.addActionListener(this);
		exitButton.addActionListener(this);
		field.addActionListener(this);
		//area.addActionListener(this);
		passwordButton.addActionListener(this);

		panel.add(thisButton);
		panel.add(thatButton);
		panel.add(exitButton);
		panel.add(field);
		panel.add(area);
		panel.add(passwordButton);

		frame.add(panel);
		frame.setSize(350,200);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e){
		Object button= e.getSource();
		if (button==thisButton)
			field.setText("You can get with this");
		else if (button==thatButton) 
			field.setText("Or you can do with that");
		else{
			System.out.println("Exit");
			frame.dispose();
		}
		
		
	}
	public static void main(String[] args){
		new AlternateActionListener();
	}
}


public class FrameWithPanelAndActions{
	public static void main(String [] args){
		JFrame frame=new JFrame("Button Example");
		JPanel panel=new JPanel();
		
		
		JButton thisButton =new JButton("This");
		JButton thatButton =new JButton("That");
		JButton exitButton=new JButton("Exit");
		JTextField field=new JTextField("Text input and output area");
		JTextArea area=new JTextArea("Text input and output area in detail");
		JPasswordField passwordfield=new JPasswordField("Enter your password here!");

		panel.add(thisButton);
		panel.add(thatButton);
		panel.add(field);
		panel.add(area);
		panel.add(passwordfield);
		panel.add(exitButton);
		frame.add(panel);

		thisButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				field.setText("You can get with this");}
		});

		thatButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				field.setText("or you can get with that");
			}
		});

		exitButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Exit");
				frame.dispose();
			}
		});

		frame.setVisible(true);
		frame.setSize(350,200);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}

*/


