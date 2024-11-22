//Contuct
package myproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
public class Contuct extends JFrame
{	private Container c;
	private JTextField tf1, tf2;
	private Font f, f2;	
	private JTextArea tArea1, tArea2;
	private ImageIcon img,img2,img10;
	private JLabel imgLabe2;
	private JButton backbutton; 
	
	public Contuct()
	{	
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0 ,0 ,1280 ,680);
		
		c = this.getContentPane();
		c.setLayout(null);
		
		img = new ImageIcon(getClass().getResource("Homeicon.png"));//icon img
		this.setIconImage(img.getImage());
		
		f = new Font("Arial",Font.BOLD,24);
		f2= new Font("Arial",Font.BOLD,18);
		
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
		
		
		tf1 = new JTextField();
		tf1.setBounds(710, 5, 550, 40);
		tf1.setBackground(new Color(0, 78, 162));
		tf1.setText("  Contact Us");
		tf1.setForeground(Color.WHITE);
		tf1.setFont(f);
		c.add(tf1);
		
		tArea1 = new JTextArea("\n  Address:  408/1 (Old KA 66/1), Kuratoli, Khilkhet,\n   Dhaka 1229, Bangladesh\n\n  Telephone: +88 02 841 4046-9; \n +88 02 841 4050 \n\n  Email:   info@aiub.edu\n\n  Web:   www.aiub.edu \n  Mobile:     +880 18 4411 5000\n     +880 18 8656 6666\n     +880 18 4451 5912\n\n    Facebook:     https://www.facebook.com/aiub.edu?\n  mibextid=9R9pXO; ");
		tArea1.setBounds(710, 45, 550, 400);
		tArea1.setBackground(new Color(0, 78, 162));
		tArea1.setForeground(Color.WHITE);
		tArea1.setFont(f2);
		c.add(tArea1);
	
		img2 = new ImageIcon(getClass().getResource("contuct.jpg"));//background img
		imgLabe2 = new JLabel (img2);
		imgLabe2.setBounds(0 ,0,1280,674);
		c.add(imgLabe2);
		
	
	}
	
	
	
	public static void main(String [] args)
	{
		Contuct frame = new Contuct();
		
	}
	
}
