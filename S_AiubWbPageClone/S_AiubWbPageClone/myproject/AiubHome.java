package myproject;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon; 
import java.awt.event.*;
public class AiubHome extends JFrame {
		 
		 private Container c;
		 private JLabel imgLabel ,imgLabe2 ,L1 ,L2  ;
		 private JTextField tf1 ,tf2;
		 private JPasswordField Jp1;
		 private ImageIcon img , img2 ,img3;
		 private JButton bt1 ,bt2, bt3,bt4,bt5;
		 private Font font;
		
	//COnstructor	 
	public AiubHome()
	{
	    //this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0,0,1280,680);
		this.setTitle("AIUB HOME");
		
		c = this.getContentPane();
		c.setBackground(Color.WHITE); 
		c.setLayout(null);
		font = new Font("Arial",Font.BOLD,16);
		
		img = new ImageIcon(getClass().getResource("Homeicon.png"));//icon img
		this.setIconImage(img.getImage());
		
		img2 = new ImageIcon(getClass().getResource("Aiubbackground.jpg"));//background img
		img3 = new ImageIcon(getClass().getResource("aiubmiddellogo.png"));//logo img
		
		imgLabel = new JLabel (img3);
		imgLabel.setBounds(550 ,0 ,110 ,110);
		c.add(imgLabel);
		
		imgLabe2 = new JLabel (img2);
		imgLabe2.setBounds(0 ,80 ,1280,600);
		c.add(imgLabe2);
		
		tf1 = new JTextField ();
		tf1.setBounds(0, 30 ,220 ,40);
		tf1.setBackground(new Color(0, 78, 162));
		c.add(tf1);
		
		L1 = new JLabel ("American International University-Bangladesh");
		L1.setBounds(0, 0 ,500 ,20);
		L1.setFont(font);
		c.add(L1);
		
		bt1=new JButton("ABOUT");
		bt1.setBounds(150,30,200,40);
		bt1.setBackground(new Color(0 ,78 ,162));
		bt1.setForeground(Color.WHITE);
		bt1.setFont(font);
		c.add(bt1);
			
		bt2=new JButton("ADMISSION");
		bt2.setBounds(350,30,205,40);
		bt2.setBackground(new Color(0 ,78 ,162));
		bt2.setForeground(Color.WHITE);
		bt2.setFont(font);
		c.add(bt2);
			
		bt3=new JButton("LOG IN");
		bt3.setBounds(655,30,200,40);
		bt3.setBackground(new Color(0 ,78 ,162));
		bt3.setForeground(Color.WHITE);
		bt3.setFont(font);
		
		c.add(bt3);
			
		bt4=new JButton("CONTACT");
		bt4.setBounds(855,30,200,40);
		bt4.setBackground(new Color(0 ,78 ,162));
		bt4.setForeground(Color.WHITE);
		bt4.setFont(font);
		c.add(bt4);
		
		bt5=new JButton("CURRICULUM");
		bt5.setBounds(1055,30,220,40);
		bt5.setBackground(new Color(0 ,78 ,162));
		bt5.setForeground(Color.WHITE);
		bt5.setFont(font);
		c.add(bt5);
		
		bt5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				Curriculum nf=new Curriculum();
				nf.setVisible(true);
			}	
		});
		bt3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				Login nf=new Login();
				nf.setVisible(true);
			}	
		});
		bt1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				about ab=new about();
				ab.setVisible(true);
				
			}	
		});
  
	bt2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				Admission ab=new Admission();
				ab.setVisible(true);
				
			}	
		});
		
		bt4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				Contuct ab=new Contuct();
				ab.setVisible(true);
				
			}	
		});
	
	}
	
	
    
	//Main 
	public static void main (String []args){
		AiubHome aiubHome = new AiubHome();
		aiubHome.setVisible(true);
		//aiubHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//aiubHome.setBounds(0,0,1280,680);
		//aiubHome.setTitle("AIUB HOME");
		
	} 
}