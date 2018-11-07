import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class GuaCanvas extends Canvas implements MouseListener{
	Gua gua=null;
	public GuaCanvas(int guaindex) {
		// TODO Auto-generated constructor stub
		 gua=new Gua(guaindex);
		addMouseListener(this);
		//MyButton b1=new MyButton("Дэид");
		 
		
		
		
		
	}
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 500, 500);
		gua.drawMessage(g);
		
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getButton()==MouseEvent.BUTTON1) {
			 int privious=gua.guaindex-1;
			 if(privious<0) {
				 privious=63;
			 }
			 gua=null;
			gua=new Gua(privious);
			repaint();
		}
		if(e.getButton()==MouseEvent.BUTTON3) {
			 int next=gua.guaindex+1;
			 if(next>63) {
				 next=0;
			 }
			 
			 gua=null;
			gua=new Gua(next);
			repaint();
		}
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
