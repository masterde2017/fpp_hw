package W2L6;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Prog_1 extends JFrame implements ActionListener  {
	private static final String EMPTY_STRING  = "";
	private  JTextField field;
	private  JTextField field2 ;
	private  JButton button1;
	private  JButton button2;
	private  JButton button3 ;
	private  JLabel inputLabel ;
	private  JLabel outputLabel ;
    
    public void function() {
    	Container contentPane;

        setSize      (600,400);
        setResizable (false);
        setTitle     ("String Utility");
        setLocation  (300, 300);


        contentPane = getContentPane( );
        contentPane.setLayout( null );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        field = new JTextField(20);
        field2 = new JTextField(20);
        
        button1 = new JButton("Count Leters");
        button2 = new JButton("Remove Letters");
        button3 = new JButton("Remove Duplicates");
        
        inputLabel = new JLabel("Input");
        outputLabel = new JLabel("Output");
        
        inputLabel.setBounds(50, 50, 40, 25);
		outputLabel.setBounds(260, 130, 80, 25);

		  
		field.setBounds(90, 50, 80, 25);
		field2.setBounds(260, 160, 200, 25);
		  
		button1.setBounds(40, 80, 180, 25);	  
		button2.setBounds(40, 120, 180, 25);
		button3.setBounds(40, 160, 180, 25);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
        
		contentPane.add(field);
		contentPane.add(field2);
		contentPane.add(button1);
		contentPane.add(button2);
		contentPane.add(button3);
		contentPane.add(inputLabel);
		contentPane.add(outputLabel);
        
		
        
    }
	
	

	@Override
	public void actionPerformed(ActionEvent event) {
		 if (event.getSource() instanceof JButton) 
	        {
	            JButton clickedButton = (JButton) event.getSource();
	            event.getActionCommand();
	            if (clickedButton == button1) 
	            {//Same Addresses.Same object
	                countLetters(field.getText());
	            } else if  (clickedButton == button2) {// reverse letters
	                reverseLetters(field.getText() );
	            }else if  (clickedButton == button3) {
	            	  removeDuplicats(field.getText());
	            }

	        } else { //the event source is inputLine
	           // addText(inputLine.getText());
	        }
		
	}
	
	private void countLetters(String s) {
		field2.setText(EMPTY_STRING);
		field2.setText(String.valueOf(s.length()));
	}
	
	private void  reverseLetters(String s) {
		field2.setText(EMPTY_STRING);
		field2.setText(new StringBuilder(s).reverse().toString());
	}
	
	private void removeDuplicats(String s) {
		StringBuilder sb = new StringBuilder();
		boolean[] charIn= new boolean[256];
		for(int i=0;i<s.length();i++) {
			if(!charIn[s.charAt(i)]) {
				charIn[s.charAt(i)]=true;
				sb.append(s.charAt(i));
			}
		}
		field2.setText(EMPTY_STRING);
		field2.setText(sb.toString());
	}

	
	public static void main(String[] args)
	{
		
		Prog_1 prog=new Prog_1();
		
		prog.function();prog.setVisible(true);
		
		
	}
}