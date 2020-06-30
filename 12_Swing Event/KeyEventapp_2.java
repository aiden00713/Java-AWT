import java.awt.*;
import java.awt.event.*;

public class KeyEventapp_2 extends Frame implements Runnable {
    int x=175, y=175, dx, dy;
    Image img;
	Toolkit tk = Toolkit.getDefaultToolkit();

    public static void main(String args[]) {
      KeyEventapp_2 workStart=new KeyEventapp_2();
    }
    
    public KeyEventapp_2() {
        super("Key Event App");
        setSize(350,350);

		img = tk.getImage("img2.png");
		
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
					img = tk.getImage("img3.png");  //up
					dx = 0;
					dy = -10;
					break;
					
				case KeyEvent.VK_DOWN:  //DOWN
					img = tk.getImage("img4.png");  //down
					dx = 0;
					dy = 10;
					break;
					
				case KeyEvent.VK_LEFT:  //LEFT
					img = tk.getImage("img1.png");  //left
					dx = -10;
					dy = 0;
					break;
					
				case KeyEvent.VK_RIGHT:  //RIGHT
					img = tk.getImage("img2.png");  //right
					dx = 10;
					dy = 0;
					break;
			}
			x = x + dx;
			y = y + dy;
        }
    }

    public void run() {
      while(true) {
         repaint();
         try{Thread.sleep(10);}
         catch(InterruptedException e) {;}
      }
    }

    public void paint(Graphics g) {
		g.drawImage(img, x, y, this);
    }
}