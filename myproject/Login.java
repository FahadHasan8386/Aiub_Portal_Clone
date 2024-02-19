package myproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
	
	public class Login extends JFrame {
			
			private ImageIcon img,img3,img10;
			private Container c;
			private JLabel imglabel, userLabel,passLabel,lable,lable2;
			private JPasswordField pf;
			private JTextField tf,tf3;
			private JButton loginButton,clearButton,backbutton;
			private Font f,f2;
			private JTextArea extralabel;
		
		public Login(){
	
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0,0,1280,680);
		this.setTitle("STUDENT LOGING PAGE");

	     img = new ImageIcon(getClass().getResource("Homeicon.png"));
		this.setIconImage(img.getImage());
		
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.white);
		f2=new Font("Arial",Font.BOLD,22);
		
		img3 = new ImageIcon(getClass().getResource("ab.png"));
		imglabel = new JLabel (img3);
		imglabel.setBounds(565 ,100 ,150 ,150);
		c.add(imglabel);
		
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
		
	lable= new JLabel("AMERICAN INTERNATIONAL UNIVERSITY-");
		lable.setFont(f2);
		lable.setBounds(420,230,500,100);
		c.add(lable);
			
	lable2= new JLabel("BANGLADESH");
		lable2.setFont(f2);
		lable2.setBounds(580,265,200,100);
		c.add(lable2);
		
		f=new Font("Arial",Font.BOLD,18);	 
	
		userLabel =new JLabel("Username:  ");
		userLabel.setBounds(440,360,130,50);
		userLabel.setFont(f);
		c.add(userLabel);
		
		extralabel =new JTextArea("1st Username :tanvir & password:1111\n2nd Username :fahad & password:2222\n3rd Username:sadman & password:3333\n4th Username :zoita & password:4444 ");
		extralabel.setBounds(1030,5,250,170);
		c.add(extralabel);
		
		tf= new JTextField();
		tf.setFont(f);
		tf.setBounds(580,360,200,50);
		c.add(tf);
		
		passLabel =new JLabel("Password:  ");
		passLabel.setBounds(440,430,130,50);
		passLabel.setFont(f);
		c.add(passLabel);
		
		pf=new JPasswordField(); 
		pf.setBounds(580,430,200,50);
		pf.setEchoChar('*');
		pf.setFont(f);
		c.add(pf);
		
		loginButton= new JButton("Login");
		loginButton.setBounds(550,500,90,40);
		loginButton.setFont(f);
		loginButton.setBackground(new Color(0, 78, 162));
		loginButton.setForeground(Color.WHITE);
		c.add(loginButton);
		
		clearButton= new JButton("Clear");
		clearButton.setBounds(660,500,90,40);
		clearButton.setFont(f);
		clearButton.setBackground(new Color(0, 78, 162));
		clearButton.setForeground(Color.WHITE);
		c.add(clearButton);	
		
		clearButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				
				tf.setText("");
				pf.setText("");
			}	
		});
		loginButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ae){
				
				String userName =tf.getText();
				String password =pf.getText();
				
				if(userName.equals("tanvir")&& password.equals("1111")){
					JOptionPane.showMessageDialog(null ,"You are successfully loged");
					
					Tanvir ta=new Tanvir();
					ta.setVisible(true);
				}
				
				else if(userName.equals("fahad")&& password.equals("2222")){
					JOptionPane.showMessageDialog(null ,"You are successfully loged");
					
					Fahad fa=new Fahad();
					fa.setVisible(true);
				}
				else if(userName.equals("sadman")&& password.equals("3333")){
					JOptionPane.showMessageDialog(null ,"You are successfully loged");
					Sadman sa=new Sadman();
					sa.setVisible(true);
				}
				else if(userName.equals("zoita")&& password.equals("4444")){
					JOptionPane.showMessageDialog(null ,"You are successfully loged");
					
					Zoita zo=new Zoita();
					zo.setVisible(true); 
				}
				else{
					JOptionPane.showMessageDialog(null,"Invalids usernames or passwords");	
				}
			
			}  
			
	   });  
	}
	
	public static void main(String []args)
	{
		Login login = new Login();
		//login.setVisible(true);
  
	}
}