import java.awt.*;
import java.awt.event.*;

public class KeyEventapp_b1 extends Frame implements Runnable {
    int x=175, y=175, dx, dy ,set,num=0;
    Image img1,img2,img3,img4;
	Toolkit tk = Toolkit.getDefaultToolkit();

    public static void main(String args[]) {
      KeyEventapp_b1 workStart=new KeyEventapp_b1();
    }
    
    public KeyEventapp_b1() {
        super("Key Event");
        setSize(350,350);
		
		img1 = tk.getImage("image/1.png");
		img2 = tk.getImage("image/2.png");
		img3 = tk.getImage("image/3.png");
		img4 = tk.getImage("image/4.png");
		
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
		enableEvents(AWTEvent.KEY_EVENT_MASK);

        setVisible(true);
        new Thread(this).start();
    }

    public void processWindowEvent(WindowEvent e) {
        if(e.getID() == WindowEvent.WINDOW_CLOSING) {
           System.exit(0);
        }
    }

    public void processKeyEvent(KeyEvent e) {
        if(e.getID() == KeyEvent.KEY_PRESSED) {
			switch(e.getKeyCode()){
				case KeyEvent.VK_UP:  //UP
					dx = 0;
					dy = -10;
					break;
					
				case KeyEvent.VK_DOWN:  //DOWN
					dx = 0;
					dy = 10;
					break;
					
				case KeyEvent.VK_LEFT:  //LEFT
					dx = -10;
					dy = 0;
					break;
					
				case KeyEvent.VK_RIGHT:  //RIGHT
					dx = 10;
					dy = 0;
					break;
			}
        }
    }

    public void run() {
      while(true) {
		x = x + dx;
		y = y + dy;
		set = num % 4;
		num++;
        repaint();
		if(x<=0){
			dx = 10;
		}
		else if(x+50>=350){
			dx = -10;
		}
		
		if(y<=0){
			dy = 10;
		}
		else if(y+50>=350){
			dy = -10;
		}
        try{Thread.sleep(100);}
        catch(InterruptedException e) {;}
      }
    }

    public void paint(Graphics g) {
		Image bufferPage=null;
		Graphics bufferg;
		if(bufferPage == null)
			bufferPage = createImage(350, 350);
		
		bufferg =bufferPage.getGraphics();
		
		if(set==0){
			bufferg.drawImage(img1, x, y, this);
		}
		if(set==1){
			bufferg.drawImage(img2, x, y, this);
		}
		if(set==2){
			bufferg.drawImage(img3, x, y, this);
		}
		if(set==3){
			bufferg.drawImage(img4, x, y, this);
		}
		bufferg.dispose();
		g.drawImage(bufferPage, getInsets().left, getInsets().top, this);
    }
}