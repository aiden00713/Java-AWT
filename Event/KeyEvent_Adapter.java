import java.awt.*;
import java.awt.event.*;

public class KeyEvent_Adapter extends java.awt.Frame {

  // Main method
  public static void main(String[] args) {
    new KeyEvent_Adapter();
  }
  
  int dx = 0;
  int dy = 0;
  // �غc�禡
  public KeyEvent_Adapter() {
    super("Key Event Adapter");

    this.addKeyListener(new KeyAdapter() {
	  public void keyPressed(KeyEvent e) {
		//int dx = 0;
		//int dy = 0;

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
				System.out.println("��V��W") ;
				break;

			case KeyEvent.VK_DOWN: 
				dy = 5;
				System.out.println("��V��U") ;
				break;

			case KeyEvent.VK_LEFT: 
				dx = 5;
				System.out.println("��V�䥪") ;
				break;

			case KeyEvent.VK_RIGHT:
				dx = -5;
				System.out.println("��V��k") ;
				break;
		}
	  }
	
	public void keyReleased(KeyEvent e) {
		System.out.println("�r��: " + e.getKeyChar()) ;
	}  

	public void keyTyped(KeyEvent e) {
	}  
	 
    });
	
	this.setLocation(this.getX() + dx, this.getY() + dy);
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
  }
}