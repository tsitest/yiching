import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NewFrame extends JFrame{

	public NewFrame() {
		// TODO Auto-generated constructor stub
		this.setTitle("Ò×¾­1.0");
		this.setSize(1200, 500);
		this.setLocation(800, 300);
		this.setResizable(true);
		this.setVisible(true);
		GuaCanvas gc=new GuaCanvas(0);
		//JButton jb=new JButton("´íØÔ");
		//jb.setSize(20, 20);
		
		this.add(gc);
		//this.add(jb);
		
		
		
		
	}
	
}
