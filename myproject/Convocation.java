package myproject;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon; 
import java.awt.event.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
public class Convocation extends JFrame {
		 
		 private Container c;
		 private JLabel imgLabe2;
		 private ImageIcon img,img2,img10;
		 private JButton backbutton;
	public Convocation()
	{    
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0,0,1280,680);
		this.setTitle("Convocation");
		
		c = this.getContentPane();
		c.setLayout(null);
		
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

		
		img = new ImageIcon(getClass().getResource("Homeicon.png"));
		this.setIconImage(img.getImage());
		
		img2 = new ImageIcon(getClass().getResource("convocation.png"));//background img
		imgLabe2 = new JLabel (img2);
		imgLabe2.setBounds(0 ,0,1275,674);
		c.add(imgLabe2);
		
	}	
	public static void main (String []args){
		
		Convocation ab = new Convocation();
		//ab.setVisible(true);
		
	}
}