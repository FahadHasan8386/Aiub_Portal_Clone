package myproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 

public class Curriculum extends JFrame
{	
	private Container c;
	private JLabel label;
	private Font f;
	private JTable table;
	private JScrollPane scroll;
	private ImageIcon  img,img10;
	private JButton backbutton;
	private String [] cols = {"CSE Course Name", "EEE Couse Name", "BBA Course Name"};
	private String [][] rows = {
									{"Math 1", "Physics 1", "Accounting (ACT)"},
									{"math 2", "Physics 2", "Business Analytics (BA))"},
									{"Math 3", "Physics 1 Lab", "Business Economics (BECO)"},
									{"Math 4", "Physics 2 Lab", "Accounting"},
									{"Math 5", "CHEMISTRY", "Finance (FIN))"},
									{"Math 6", "Math 1", "Human Resource Management (HRM))"},
									{"INTRODUCTION TO PROGRAMMING", "BASIC MECHANICAL ENGINEERING","International Business (IB)"},
									{"INTRODUCTION TO PROGRAMMING Lab", "ELECTRICAL CIRCUITS -1 (DC)", "Investment Management (IM"},
									{"physic 1", "ELECTRICAL CIRCUITS -1 (DC) (LAB)", "Management (MGT)"},
									{"physic 2", "Math 2", "Marketing (MKT)"},
									{"physics 1 lab", "PRINCIPLES OF ACCOUNTING", "Management Information Systems (MIS)"},
									{"physics 2 lab", "Math 3", "Accounting (ACT"},
									{"Oop 1", "ELECTRICAL CIRCUITS 2 (AC)", ""},
									{"Oop 1 lab", "ELECTRICAL CIRCUITS-2 (AC) LAB", "Tourism and Hospitality Management (THM)"},
									{"DATA STRUCTURE", "ELECTRICAL MACHINES 1 LAB", "Financial Accounting"},
									{"DATA STRUCTURE Lab", "ELECTRONIC DEVICES", "Micro Economics"},
									{"INTRODUCTION TO DATABASE", "ELECTRONIC DEVICES LAB", "Principles of Management"},
									{"ALGORITHMS", "BANGLADESH STUDIES", "Quantitative Techniques"},
									{"THEORY OF COMPUTATION", "MODERN PHYSICS", "Macroeconomics"},
									{"DATA COMMUNICATION", "ELECTROMAGNETICS FIELDS AND WAVES", "Environmental Management"},
									{"SOFTWARE ENGINEERING", "DIGITAL LOGIC AND CIRCUITS", "Business Analytics"},
									{"BANGLADESH STUDIES", "DIGITAL LOGIC AND CIRCUITS Lab", "Accounting (ACT"},
									{"ARTIFICIAL INTELLIGENCE", "Physics 1", "Marketing Techniques"},
									{"COMPUTER NETWORKS", "DIGITAL SIGNAL PROCESSING", "Direct and Indirect Tax"},
									{"COMPUTER ORGANIZATION AND ARCHITECTURE", "Physics 1", "Banking and Insurance"},
									{"COMPUTER NETWORKS", "EEE ELECTIVE 1", "Human Resource Management"},
									{"OPERATING SYSTEM", "CAPSTONE PROJECT 1", "Financial & Management Accounting"},
									{"WEB TECHNOLOGIES", "MICROWAVE ENGINEERING", "Business Laws"},
									{"COMPILER DESIGN", "POWER SYSTEM PROTECTION", "Leadership and Ethics"},
									{"COMPUTER GRAPHICS", "NUCLEAR POWER ENGINEERING", "Strategic Management"},
									{"ENGINEERING MANAGEMENT", "NANOTECHNOLOGY FOR ENGINEERS", "Financial Management"},
									{"THESIS / PROJECT", "VLSI CIRCUIT DESIGN", "Consumer Behaviour"}
							};
									
	 public Curriculum()
	{
		
		this.setVisible(true);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0, 0, 1280, 680);
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(0, 78, 162));
	
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
		
		f = new Font("Arial",Font.BOLD,26);
	
		
		label = new JLabel("Subject Course Curriculum");
		label.setBounds(450, 20, 550, 50);
		label.setFont(f);
		label.setForeground(Color.WHITE);
		c.add(label);
		
		table = new JTable(rows,cols);
		scroll = new JScrollPane(table);
		scroll.setBounds(50,80, 1180, 520);
		c.add(scroll);
		
		
	
	}
	
	public static void main(String[]args)
	{
		Curriculum frame = new Curriculum(); 
		frame.setVisible(true);  
		
	}
	
} 