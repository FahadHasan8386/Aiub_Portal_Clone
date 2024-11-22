package myproject;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon; 
import java.awt.event.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
public class about extends JFrame {
		
		 private Container c;
		 private JLabel l1 ,l2 ,l3 ,l4 ,imgLabe2 ;
		 private JTextField tf1 ,tf2 ,tf3 ,tf4;
		 private ImageIcon img,img2,img10;
		 private JButton ta1 ,ta2 ,ta3 ,ta4, ta5 ,ta6,backbutton;
		 private Font font ,font2;
		 
	public about()
	{   
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0,0,1280,680);
		this.setTitle("About");
		
		c = this.getContentPane();
		//c.setBackground(Color.WHITE);
		c.setLayout(null);
		 
		font = new Font("Arial",Font.BOLD,26);
		font2 = new Font("Arial",Font.BOLD,46);
		
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
				AiubHome ab=new AiubHome();
				ab.setVisible(true);
				
			}	
		});
		

		l1 = new JLabel ("ABOUT");
		l1.setBounds(540, 30 ,250 ,50);
		l1.setFont(font2);
		l1.setForeground(Color.WHITE);
		c.add(l1);
		
		ta1 = new JButton("Information");
		ta1.setBounds(100 ,140 ,320 ,220);
		ta1.setFont(font);
		ta1.setForeground(Color.WHITE);
		ta1.setBackground(new Color (0 ,115 ,183));
		c.add(ta1);
		
		ta2 = new JButton("General Information");
		ta2.setBounds(480 ,140 ,320 ,220);
		ta2.setFont(font);
		ta2.setForeground(Color.WHITE);
		ta2.setBackground(new Color (0 ,192 ,239));
		c.add(ta2);
		
		ta3 = new JButton("Resources");
		ta3.setBounds(100 ,380 ,320 ,220);
		ta3.setFont(font);
		ta3.setForeground(Color.WHITE);
		ta3.setBackground(new Color (0 ,166 ,90));
		c.add(ta3);
		
		ta4 = new JButton("Convacation");
		ta4.setBounds(480 ,380 ,320 ,220);
		ta4.setFont(font);
		ta4.setForeground(Color.WHITE);
		ta4.setBackground(new Color (0 ,178 ,158));
		c.add(ta4);
		
		ta5 = new JButton("Why Study At AIUB?");
		ta5.setBounds(860 ,140 ,320 ,220);
		ta5.setFont(font);
		ta5.setForeground(Color.WHITE);
		ta5.setBackground(new Color (186 ,121 ,203));
		c.add(ta5); 
		
		ta6 = new JButton("Career Opportunity");
		ta6.setBounds(860 ,380 ,320 ,220);
		ta6.setFont(font);
		ta6.setForeground(Color.WHITE);
		ta6.setBackground(new Color (220 ,94 ,75));
		c.add(ta6);
		
		img2 = new ImageIcon(getClass().getResource("about.jpg"));//background img
		imgLabe2 = new JLabel (img2);
		imgLabe2.setBounds(0 ,0,1280,680);
		c.add(imgLabe2);
		
		ta1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				Overview ab=new Overview();
				ab.setVisible(true);
				
			}	
		});
		
		
		ta2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				Information ab=new Information();
				ab.setVisible(true);
				
			}	
		}); 
		
		ta3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				Resources ab=new Resources(); 
				ab.setVisible(true);
				
			}	
		});
		
		ta4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				Convocation ab=new Convocation();
				ab.setVisible(true);
				
			}	
		});
		ta5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				why ab=new why();
				ab.setVisible(true);
				
			}	
		});
	}	
	public static void main (String []args){
		
		about ab = new about();
		
		
	}
}