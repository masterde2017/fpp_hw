package W2L7;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MetricConversion extends JFrame   {
	private static final String EMPTY_STRING  = "";
	private  JTextField fieldMile;
	private  JTextField fieldKM;
	private  JTextField fieldPound ;
	private  JTextField fieldKG ;
	
	private  JTextField fieldGallon;
	private  JTextField fieldLiters;
	private  JTextField fieldF;
	private  JTextField fieldC;
	
	private  JLabel  mile;
	private  JLabel  km;
	private  JLabel  pound;
	private  JLabel  kg;
	private  JLabel  gl;
	private  JLabel  liter;
	private  JLabel  fh;
	private  JLabel  cd;
	
	private  JButton buttonConverse;
    
    public void function() {
    	Container contentPane;

        setSize      (500,400);
        setResizable (false);
        setTitle     ("Metrics Conversion Assistant");
        setLocation  (300, 300);


        contentPane = getContentPane( );
        contentPane.setLayout( null );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fieldMile = new JTextField(20);	fieldKM = new JTextField(20);
        fieldPound = new JTextField(20);	fieldKG = new JTextField(20);
        fieldGallon = new JTextField(20);	fieldLiters = new JTextField(20);
        fieldF = new JTextField(20);	fieldC = new JTextField(20);
        
        mile = new JLabel("Mile:"); km= new JLabel("Kilometer:");
        pound= new JLabel("Pound:");kg = new JLabel("Kilogram:");
    	gl = new JLabel("Gallon:"); liter= new JLabel("Liters:");
    	fh= new JLabel("Fahrenhreit:");cd =  new JLabel("Centrigrate:");
    	
       
        
    	buttonConverse = new JButton("Convert");
       
    	
    	mile.setBounds(50, 50, 50, 25);fieldMile.setBounds(100, 50, 100, 25);km.setBounds(200, 50, 100, 25);fieldKM.setBounds(250, 50, 100, 25);
    	pound.setBounds(50, 100, 50, 25);fieldPound.setBounds(100, 100, 100, 25);kg.setBounds(200, 100, 100, 25);fieldKG.setBounds(250, 100, 100, 25);
    	gl.setBounds(50, 150, 50, 25); fieldGallon.setBounds(100, 150, 100, 25);liter.setBounds(200, 150, 100, 25);fieldLiters.setBounds(250, 150, 100, 25);
    	fh.setBounds(50, 200, 50, 25); fieldF.setBounds(100, 200, 100, 25);cd.setBounds(200, 200, 100, 25);fieldC.setBounds(250, 200, 100, 25);
        
        

		  
    	buttonConverse.setBounds(200, 250, 80, 25);
    	buttonConverse.addActionListener(event -> {
    		if (event.getSource() instanceof JButton) 
	        {
	            JButton clickedButton = (JButton) event.getSource();
	            event.getActionCommand();
	            if (clickedButton ==  buttonConverse) 
	            {
	            	if(!fieldMile.getText().equals("")) fieldKM.setText(String.valueOf(Double.valueOf(fieldMile.getText())/0.62137));
	            	else fieldKM.setText("");
	            	if(!fieldPound.getText().equals("")) fieldKG.setText(String.valueOf(Double.valueOf(fieldPound.getText())/2.21));
	            	else fieldKG.setText("");
	            	if(!fieldGallon.getText().equals("")) fieldLiters.setText(String.valueOf(Double.valueOf(fieldGallon.getText())*3.785));
	            	else fieldLiters.setText("");
	            	if(!fieldF.getText().equals("")) fieldC.setText(String.valueOf((Double.valueOf(fieldF.getText())-32)/1.8));
	            	else fieldC.setText("");
	            
	            }

	        } 
    	});
		
        
		contentPane.add(fieldMile);
		contentPane.add(fieldKM);
		contentPane.add(fieldPound);
		contentPane.add(fieldKG);
		contentPane.add(fieldGallon);
		contentPane.add(fieldLiters);
		
		contentPane.add(fieldF);
		contentPane.add(fieldC);
		contentPane.add( mile);
		contentPane.add( km);
		
		contentPane.add( pound);
		contentPane.add( kg);
		contentPane.add( gl);
		contentPane.add( liter);
		contentPane.add( fh);
		contentPane.add( cd);
		contentPane.add( buttonConverse);
        
		
        
    }
	
		
	
	
	public static void main(String[] args)
	{
		
		MetricConversion prog=new MetricConversion();
		
		prog.function();prog.setVisible(true);
		
		
	}
}