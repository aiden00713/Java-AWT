import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class DrawImage_work extends java.awt.Frame implements MouseListener{
  int x, y;
  Image image;
  boolean blnDrag = false;
  
  public static void main(String args[]){
    new DrawImage_work();
  }
  
  // �غc�禡
  public DrawImage_work() {
    super("Draw Image work");
    setBackground(Color.white);

    // Ū��Java Archive�ɮפ����Ϲ��ɮ�
    ClassLoader cl = this.getClass().getClassLoader();
    Toolkit tk = Toolkit.getDefaultToolkit();

    image = tk.createImage(cl.getResource("images/Java_logo.png"));

    this.addMouseListener(this);
	
    // Center the frame
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = this.getSize();

    if (frameSize.height > screenSize.height)
      frameSize.height = screenSize.height;

    if (frameSize.width > screenSize.width)
      frameSize.width = screenSize.width;

    this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

    this.setVisible(true);
	this.setSize(300, 300);
	
    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }

  public void update(Graphics g) {
    paint(g);
  }

  public void paint (Graphics g) {
    if (blnDrag) {
      // �]�wGraphics���󤧥ثe�C��
      g.setColor(Color.white);
      // ø�s�x�ΨåH�ثe���w���C��񺡭��n
      // �h�M���e��
      g.fillRect(0, 0, this.getSize().width, this.getSize().height);
      
      // ø�s�Ϲ�
      g.drawImage(image, x, y, null);
    }
  }

  // ��@MouseListener��������k
  public void mousePressed(MouseEvent e){}
  public void mouseReleased(MouseEvent e){
    blnDrag = false;
  }
  
  public void mouseEntered(MouseEvent e){}
  public void mouseExited(MouseEvent e){}
  public void mouseClicked(MouseEvent e){
	blnDrag = true;
	x = e.getX();
    y = e.getY();
    repaint();
  }
}
