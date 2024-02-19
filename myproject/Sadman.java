package myproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
	
	public class Sadman extends JFrame{
		
		private Container c;
		
		private ImageIcon  img,img2,img3,img10;
		private JTextArea ta;
		private JScrollPane scroll;
		private JButton regButton,backbutton ;
		private  JLabel imglabel,imglabel2,lable1,lable2,lable3,lable4,lable5,lable6,lable7,
		lable8,lable9,lable10,lable11,lable12,lable13;
		
		private JTextField textfld1,textfld2,textfld3,textfld4,textfld5,textfld6,
		textfld7,textfld8,textfld9,textfld10,textfld11;
		
		private Font f,f2,f3,f4;
		
	public	Sadman(){
		
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setBounds(0,0,1280,680);
			this.setTitle(" STUDENT INFORMATION");
			
			c=this.getContentPane();
		    c.setLayout(null);
			
		img = new ImageIcon(getClass().getResource("Homeicon.png"));//icon img
		this.setIconImage(img.getImage());	
		
		img10 = new ImageIcon(getClass().getResource("back.jpg"));
		backbutton = new JButton(img10);
		backbutton.setBounds(0 ,5 ,120 ,37);
		c.add(backbutton);
		backbutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				dispose();
				Login ab=new Login();
				ab.setVisible(true);
				
			}	
		});
		 
		img3 = new ImageIcon(getClass().getResource("sadman.jpg"));
		imglabel = new JLabel (img3);
		imglabel.setBounds(820 ,150 ,430 ,327);
		c.add(imglabel);
		
			f=new Font("Arial",Font.BOLD,18);
			f2=new Font("Arial",Font.BOLD,30);
			f3=new Font("Arial",Font.BOLD,22);
			f4=new Font("Arial",Font.BOLD,14);
			
			regButton= new JButton("Go To Registration");
			regButton.setBounds(875,500,300,60);
			regButton.setBackground(new Color(0, 78, 162));
			regButton.setForeground(Color.WHITE);
			regButton.setFont(f);
			c.add(regButton);
			
			lable12 = new JLabel(); 
			lable12.setText("WELCOME KAZI SADMAN IN AIUB ");
			lable12.setBounds(330,20,600,70);
			lable12.setForeground(Color.WHITE);
			lable12.setFont(f2);
			c.add(lable12);
			
			lable13 = new JLabel(); 
			lable13.setText("COMPLETED COURSE ");
			lable13.setBounds(420,100,300,50);
			lable13.setForeground(Color.WHITE);
			lable13.setFont(f3);
			c.add(lable13);
			
			ta=new JTextArea(" ENGLISH READING SKILLS & PUBLIC SPEAKING \n \n DIFF CALCULUS AND COORDINATE GEOMETRY\n \n INTRODUCTION TO COMPUTER STUDIES\n \n INTRODUCTION TO PROGRAMMING \n \n INTRODUCTION TO PROGRAMMING LAB\n \n PHYSICS 1 \n \n PHYSICS 1 LAB \n    \n BANGLADESH STUDIES \n \n PHYSICS 2\n  \n INTEGRAL CALCULUS & ORD. DIFF EQUATION\n \n PHYSICS 2 LAB \n  \n DISCRETE MATHEMATICS\n \n INTRODUCTION TO ELECTRICAL CIRCUITS\n \n INTRODUCTION TO ELECTRICAL CIRCUITS LAB \n \n OBJECT ORIENTED PROGRAMMING 1 (JAVA) \n \n COMPLEX VARIABLE,LAPLACE & Z-TRANSFORMATION ");
			ta.setLineWrap(true);
			ta.setWrapStyleWord(true);
			ta.setFont(f4);
			ta.setBackground(new Color(175,175,225));
			scroll = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); 
			scroll.setBounds(415,150,350,475);
			
			c.add(scroll);
			
			lable1 = new JLabel(); 
			lable1.setText(" NAME :");
			lable1.setBounds(50,110,150,40);
			lable1.setForeground(Color.WHITE);
			lable1.setFont(f);
			c.add(lable1);
			
			textfld1 = new JTextField(" KAZI SADMAN ");
			textfld1.setBounds(170,110,200,40);
			textfld1.setFont(f);
			c.add(textfld1);
			
			lable2 = new JLabel(); 
			lable2.setText(" ID :");
			lable2.setBounds(50,170,150,40);
			lable2.setForeground(Color.WHITE);
			lable2.setFont(f);
			c.add(lable2);
				
			textfld2 = new JTextField(" 23-50232-1 ");
			textfld2.setBounds(170,170,200,40);
			textfld2.setFont(f);
			c.add(textfld2);
			
			lable3 = new JLabel(); 
			lable3.setText(" CGPA :");
			lable3.setBounds(50,230,150,40);
			lable3.setForeground(Color.WHITE);
			lable3.setFont(f);
			c.add(lable3);
					
			textfld3 = new JTextField("***");
			textfld3.setBounds(170,230,200,40);
			textfld3.setFont(f);
			c.add(textfld3);
			
			lable4 = new JLabel(); 
			lable4.setText(" COM CEDIT :");
			lable4.setForeground(Color.WHITE);
			lable4.setBounds(50,290,150,40);
			lable4.setFont(f);
			c.add(lable4);
			
			textfld4 = new JTextField(" 38 ");
			textfld4.setBounds(170,290,200,40);
			textfld4.setFont(f);
			c.add(textfld4);
			
			lable5 = new JLabel(); 
			lable5.setText(" PROGRAM :");
			lable5.setForeground(Color.WHITE);
			lable5.setBounds(50,350,150,40);
			lable5.setFont(f);
			c.add(lable5);
			
			textfld5 = new JTextField("CSE");
			textfld5.setBounds(170,350,200,40);
			textfld5.setFont(f);
			c.add(textfld5);
			
			lable6 = new JLabel(); 
			lable6.setText(" EMAIL :");
			lable6.setForeground(Color.WHITE);
			lable6.setBounds(50,410,150,40);
			lable6.setFont(f);
			c.add(lable6);
			
			textfld6 = new JTextField("sadman32@gmail.com");
			textfld6.setBounds(170,410,200,40);
			textfld6.setFont(f);
			c.add(textfld6);
			
			lable7 = new JLabel(); 
			lable7.setText(" RELIGION :");
			lable7.setForeground(Color.WHITE);
			lable7.setBounds(50,470,150,40);
			lable7.setFont(f);
			c.add(lable7);
			
			textfld7 = new JTextField("ISLAM ");
			textfld7.setBounds(170,470,200,40);
			textfld7.setFont(f);
			c.add(textfld7);
			
			lable8 = new JLabel(); 
			lable8.setText(" DOB :");
			lable8.setForeground(Color.WHITE);
			lable8.setBounds(50,530,150,40);
			lable8.setFont(f);
			c.add(lable8);
			
			textfld8 = new JTextField("15/11/2002");
			textfld8.setBounds(170,530,200,40);
			textfld8.setFont(f);
			c.add(textfld8);
			
			lable9 = new JLabel(); 
			lable9.setText(" SEX:");
			lable9.setBounds(50,590,150,40);
			lable9.setForeground(Color.WHITE);
			lable9.setFont(f);
			c.add(lable9);
			
			textfld9 = new JTextField("MALE");
			textfld9.setBounds(170,590,200,40);
			textfld9.setFont(f);
			c.add(textfld9);
					
		img2 = new ImageIcon(getClass().getResource("student.jpg"));
		imglabel2 = new JLabel (img2);
		imglabel2.setBounds(0 ,0 ,1280 ,680);
		c.add(imglabel2);
		
		regButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				GotoRegistration ab=new GotoRegistration();
				ab.setVisible(true);
			}	
		});
		}
	
		public static void main (String[]args){
		
			Sadman frame=new Sadman();
			//frame.setVisible(true);
			
		}
	}
