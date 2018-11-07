import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Gua {
int guaindex;
String guaming;
String guaci;

Yao[] yao=new Yao[6];
	public Gua(int guaindex) {
		// TODO Auto-generated constructor stub
		this.guaindex=guaindex;
		this.guaming=Resource.guaming[guaindex];
		//guaci=Resource.guaci[guaindex];
		for(int i=0;i<6;i++) {
		yao[i]=new Yao(guaindex,i);//创建6个爻对象
		}
	}
	public void drawMessage(Graphics g) {//
		drawGuaming(g);
		for(int i=0;i<6;i++) {//画出6根爻
		yao[i].drawYao(g);
		
		}
	}
	public void drawGuaming(Graphics g) {//画卦名
	g.setColor(Color.BLACK);
	Font f=new Font(Font.SERIF,Font.BOLD,50);
	g.setFont(f);
	g.drawString(guaindex+1+"   "+guaming, 100, 100);
	/**
	g.setColor(Color.BLACK);
	Font f1=new Font(Font.SANS_SERIF,Font.CENTER_BASELINE,25);
	g.setFont(f1);
	g.setColor(Color.RED);
	g.drawString(guaci, 100, 150);
	**/
	}
	
}
