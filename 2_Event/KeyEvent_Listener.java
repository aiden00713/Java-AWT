import java.awt.*;
import java.awt.event.*;

// ��@KeyListener����
public class KeyEvent_Listener extends java.awt.Frame implements KeyListener {
  
  // Main method
  public static void main(String[] args) {
    new KeyEvent_Listener();
  }

  // �غc�禡
  public KeyEvent_Listener() {
    super("Key Event Listener");

    // ���U KeyListener
    this.addKeyListener(this);    

    // �]�w�������j�p
    this.setSize(300,300);

    // Center the frame
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = this.getSize();

    if (frameSize.height > screenSize.height)
      frameSize.height = screenSize.height;

    if (frameSize.width > screenSize.width)
      frameSize.width = screenSize.width;

    this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

    // ��ܵ���
    this.setVisible(true);

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });    
  }
  
  public void keyPressed(KeyEvent e) {
    int dx = 0;
    int dy = 0;

    // �P�_�O�_���UAlt��
    if (e.isAltDown()) 
      System.out.println("���UAlt��") ;
    
    // �P�_�O�_���UCtrl��
    if (e.isControlDown()) 
      System.out.println("���UControl��") ;
    
    // �P�_�O�_���UShift��
    if (e.isShiftDown()) 
      System.out.println("���UShift��") ;
    
    // �^�ǫ���ҥN�������
    int i = e.getKeyCode() ;

    System.out.println("ASCII:" + i);

    switch(i) {
      case KeyEvent.VK_UP: 
        dy = -5;
		System.out.println("�W������") ;
        break;

      case KeyEvent.VK_DOWN: 
        dy = 5;
		System.out.println("�U������") ;
        break;

      case KeyEvent.VK_LEFT: 
        dx = -5;
		System.out.println("��������") ;
        break;


      case KeyEvent.VK_RIGHT: 
        dx = 5;
		System.out.println("�k������") ;
        break;
    }
    this.setLocation(this.getX() + dx, this.getY() + dy);
  }  

  public void keyReleased(KeyEvent e) {
    System.out.println("�r��: " + e.getKeyChar()) ;
  }  

  public void keyTyped(KeyEvent e) {
  }  
}
