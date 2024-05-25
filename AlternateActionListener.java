import javax.swing.*;
import java.awt.event.*;

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


/**
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


