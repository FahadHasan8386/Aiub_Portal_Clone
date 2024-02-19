package myproject;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon; 
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Laboratory extends JFrame {
		 
		 private Container c;
		 private JLabel imgLabe2;
		 private ImageIcon img,img2,img10;
		 private JButton nextButton ;
		 private JButton backbutton;
	public Laboratory()
	{    
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0,0,1280,680);
		this.setTitle("Laboratory");
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		img = new ImageIcon(getClass().getResource("Homeicon.png"));
		this.setIconImage(img.getImage());
		
		img10 = new ImageIcon(getClass().getResource("back.jpg"));
		backbutton = new JButton(img10);
		backbutton.setBounds(0 ,5 ,120 ,37);
		c.add(backbutton);

		
		nextButton= new JButton("NEXT PAGE");
			nextButton.setBounds(540,535,200,40);
			nextButton.setBackground(new Color(0, 78, 162));
			nextButton.setForeground(Color.WHITE);
			c.add(nextButton);
		
		img2 = new ImageIcon(getClass().getResource("Laboratory.png"));//background img
		imgLabe2 = new JLabel (img2);
		imgLabe2.setBounds(0 ,0,1280,513);
		c.add(imgLabe2);
		
			
		nextButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				Technology ab=new Technology();
				ab.setVisible(true);
				
			}	
		});
		backbutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				dispose();
				Resources ab=new Resources();
				ab.setVisible(true);
				
			}	
		});
		
	}	
	public static void main (String []args){
		
		Laboratory ab = new Laboratory();
		//ab.setVisible(true);
		
	}
}