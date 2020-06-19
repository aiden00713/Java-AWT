import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Eventgame1 extends Frame implements Runnable {
    int x1=150, y1=225, dx1, dy1, x2=150, y2=10;
    int bx, by, dbx=0, dby=-5, bflag=0, hitflag2=0;
    Image img1, img2, img3, tmp, bufferPage=null;
	AudioClip shoot,boom;
    String message="",message1="";
	int score = 0;
	
    public static void main(String args[]) {
      Eventgame1 workStart=new Eventgame1();
    }
    
    public Eventgame1() {
        super("Eventgame1");
        setSize(350,350);

        Toolkit tk = Toolkit.getDefaultToolkit();
        img1 = tk.getImage("car090.gif");
        img2 = tk.getImage("car180.gif");
        img3 = tk.getImage("hit2.gif");
		
		shoot = Applet.newAudioClip(getClass().getResource("shoot1.au"));
		boom = Applet.newAudioClip(getClass().getResource("explode.au"));

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
              switch(e.getKeyCode()) {
                   case KeyEvent.VK_RIGHT:
                          dx1 = 5; dy1 = 0;
                          break;
                   case KeyEvent.VK_LEFT:
                          dx1 = -5; dy1 = 0;
                          break;
                   case KeyEvent.VK_UP:
                          dx1 = 0; dy1 = -5; 
                          break;
                   case KeyEvent.VK_DOWN:
                          dx1 = 0; dy1 = 5;
                          break;
                   case KeyEvent.VK_SPACE:
                          dx1 = 0; dy1 = 0;
                          bx = x1 + 30;
                          by = y1 - 5;
                          bflag = 1;
                          shoot.play();
                          break;
                    default:
                          dx1 = 0; dy1 = 0;
              }
            x1 = x1 + dx1;
            y1 = y1 + dy1;
        }
    }

    public void run() {
      while(true) {
         if(by <= -10) bflag = 0;
         if(bflag == 1) by = by + dby;

         if ((bx>=x2)&&(bx<=x2+60)&&(by<=y2)&&(message=="")){
			 hitflag2 = 1;
			 score += 5;
			 tmp = img2;
			 boom.play();
             message= "Hit!! Score=" + score;
			 message1= "Score=" + score;
			 bx = -10;
			 by = -10;
         }
         repaint();
         try{
			 if(hitflag2 == 0){
				 Thread.sleep(30);
				 continue;
			 }
			 if(hitflag2 == 1){
				 Thread.sleep(1000);
				 hitflag2 = 0;
				 message = "";
				 img2 = tmp;
			 }
			 Thread.sleep(30);
		 }
         catch(InterruptedException e) {;}
      }
    }

    public void update(Graphics g) {
       paint(g);
    }

    public void paint(Graphics g) {
       Graphics bufferg;
       if(bufferPage == null)
          bufferPage = createImage(350, 350);
       bufferg = bufferPage.getGraphics();

       if (hitflag2==1) img2=img3;
	   //把用圖形覆蓋達到不覆蓋效果
	   bufferg.setColor(Color.white);
	   bufferg.fillRect(0, 0, 100, 100);
	   bufferg.setColor(Color.black);
	   
       bufferg.drawString(message, 20, 20);
	   bufferg.drawString(message1, 20, 50);

       bufferg.drawImage(img1, x1, y1, this);
       bufferg.drawImage(img2, x2, y2, this);

       bufferg.fillRect(bx, by, 3, 5);
       bufferg.setColor(Color.white);
       bufferg.fillRect(bx, by+5, 3, 5);

       bufferg.dispose();
       g.drawImage(bufferPage, getInsets().left, getInsets().top, this);
    }
}