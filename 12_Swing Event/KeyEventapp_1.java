import java.awt.*;
import java.awt.event.*;

public class KeyEventapp_1 extends Frame implements Runnable {
    int x=150, y=235, dx, dy;
    Image img;

    public static void main(String args[]) {
      KeyEventapp_1 workStart=new KeyEventapp_1();
    }
    
    public KeyEventapp_1() {
        super("Key Event App");
        setSize(350,350);

        Toolkit tk = Toolkit.getDefaultToolkit();
        img = tk.getImage("patrick-star.png");

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
				case KeyEvent.VK_I:  //UP
					dx = 0;
					dy = -10;
					break;
					
				case KeyEvent.VK_M:  //DOWN
					dx = 0;
					dy = 10;
					break;
					
				case KeyEvent.VK_J:  //LIFT
					dx = -10;
					dy = 0;
					break;
					
				case KeyEvent.VK_L:  //RIGHT
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