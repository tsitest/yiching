import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Yao {
	boolean yangyao;
	int space=5;
    int yaowidth=150;
    int yaoheight=30;
	 int guaindex;
	 int yaoindex;

	public Yao(int guaindex,int yaoindex) {
		this.guaindex=guaindex;
		this.yaoindex=yaoindex;
		// TODO Auto-generated constructor stub
		yangyao=Resource.yangyao[guaindex][yaoindex];
		
		
	}
	public void drawYao(Graphics g) {//»­³ö6¸ùØ³
		
		
		
			if(yangyao) {//»­ÑôØ³
				g.setColor(Color.RED);
				g.fillRect(100, 400-(space+yaoheight)*yaoindex, yaowidth, yaoheight);
			}
	
		else {//»­ÒõØ³
			g.setColor(Color.BLACK);
			g.fillRect(100, 400-(space+yaoheight)*yaoindex, yaowidth, yaoheight);
			g.clearRect((yaowidth-30)/2+100, 400-(space+yaoheight)*yaoindex, 30, 30);
			
		}
	
}
	
	
}