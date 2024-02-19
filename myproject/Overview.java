package myproject;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon; 
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Overview extends JFrame {
		 
		 private Container c;
		 private JLabel imgLabe2,imgLabe;
		 private ImageIcon img,img2,img10;
		 private JButton backbutton; 
		 
	public Overview()
	{    
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0,0,1280,680);
		this.setTitle("Overview");
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		img = new ImageIcon(getClass().getResource("Homeicon.png"));
		this.setIconImage(img.getImage());
				
	    img10 = new ImageIcon(getClass().getResource("back.jpg"));
		backbutton = new JButton(img10);
		backbutton.setBounds(0 ,5 ,120 ,37);
		c.add(backbutton);
		backbutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				dispose();
				about ab=new about();
				ab.setVisible(true);
				
			}	
		});

		img2 = new ImageIcon(getClass().getResource("Overview.png"));//background img
		imgLabe2 = new JLabel (img2);
		imgLabe2.setBounds(0 ,0,1280,603);
		c.add(imgLabe2);
		
	}	
	public static void main (String []args){
		
		Overview ab = new Overview();
		//ab.setVisible(true);
		
	}
}