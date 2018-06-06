package W2L6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Prog_2 extends JFrame implements ActionListener {
	private  int width=120,height=100;
//	JButton b1=new JButton("Red"),
//	b2=new JButton("ORANGE"),b3=new JButton("Yellow"),
//	b4=new JButton("GREEN"),b5=new JButton("BLUE"),
//	b6=new JButton("INDIGO"),b7=new JButton("VIOLET");
	JButton b1,
			b2,b3,
			b4,b5,
			b6,b7;
	JTextField jf;
   public void function() {
      
	   Container contentPane;

//       setSize      (200,800);
//       setResizable (false);
//       setTitle     ("String Utility");
//       setLocation  (300, 300);
	  
       contentPane = getContentPane( );
       contentPane.setLayout( null ); 
	   
	   
	  setTitle("Rainbow Color Frame");
      setBounds(0,0,1000,150);
      setLayout(new FlowLayout(FlowLayout.LEFT));
      
      b1=new JButton();
      b2=new JButton();b3=new JButton();
		b4=new JButton();b5=new JButton();
		b6=new JButton();b7=new JButton();
      b1.setPreferredSize(new Dimension(100,100));
      b2.setPreferredSize(new Dimension(100,100));
      b3.setPreferredSize(new Dimension(100,100));
      b4.setPreferredSize(new Dimension(100,100));
      b5.setPreferredSize(new Dimension(100,100));
      b6.setPreferredSize(new Dimension(100,100));
      b7.setPreferredSize(new Dimension(100,100));
      
      
      b1.setBackground(Color.red);
      b2.setBackground(Color.ORANGE);
      b3.setBackground(Color.YELLOW);
      b4.setBackground(Color.GREEN);
      b5.setBackground(Color.BLUE);
      b6.setBackground(new Color(75,0,130));
      b7.setBackground(new Color(238,130,238));
      contentPane.add(b1);
      contentPane.add(b2);
      contentPane.add(b3);
      contentPane.add(b4);
      contentPane.add(b5);
      contentPane.add(b6);
      contentPane.add(b7);
     
      
    b1.addActionListener(this);
  	b2.addActionListener(this);
  	b3.addActionListener(this);
  	b4.addActionListener(this);
  	b5.addActionListener(this);
  	b6.addActionListener(this);
  	b7.addActionListener(this);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
      }
   public static void main(String args[]) {
	   Prog_2 f = new Prog_2();
     
      f.function(); f.setVisible(true);
   }
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if (event.getSource() instanceof JButton) 
        {
            JButton clickedButton = (JButton) event.getSource();
            event.getActionCommand();
            if (clickedButton == b1) 
            {//Same Addresses.Same object
                showMessage("red signifies passionate");
            } else if  (clickedButton == b2) {// reverse letters
            	 showMessage("orange  signifies piece");
            }else if  (clickedButton == b3) {
            	 showMessage("yellow  signifies invincibility");
            }else if  (clickedButton == b4) {
           	 showMessage("green  signifies life");
           }
            else if  (clickedButton == b5) {
           	 showMessage("blue  signifies pure");
           }
            else if  (clickedButton == b6) {
           	 showMessage("indigo  signifies nothing");
           }else if  (clickedButton == b7) {
          	 showMessage("violet  signifies love");
          }

        } else { //the event source is inputLine
           // addText(inputLine.getText());
        }
	}
	private void showMessage(String message){  
		JOptionPane.showMessageDialog(this,message,"Error",JOptionPane.ERROR_MESSAGE);
	} 
	 
}

