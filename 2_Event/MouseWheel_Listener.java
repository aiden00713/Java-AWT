import java.awt.*;
import java.awt.event.*;

// ��@MouseWheelListener����
public class MouseWheel_Listener extends java.awt.Frame implements MouseWheelListener{
  
  // Main method
  public static void main(String[] args) {
    new MouseWheel_Listener();
  }
  
  // �غc�禡
  public MouseWheel_Listener() {
    super("MouseWheel Event Listener");

    // ���U MouseWheelListener
	this.addMouseWheelListener(this);

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
  
  public void mouseWheelMoved(MouseWheelEvent e){
	    if (e.getScrollType() == MouseWheelEvent.WHEEL_BLOCK_SCROLL) {
            System.out.println("�HBLOCK����챲��");
        }
        if (e.getScrollType() == MouseWheelEvent.WHEEL_UNIT_SCROLL) {
            System.out.println("�HUNIT����챲��");
        }
         
        System.out.println("�u�ʳ���: " + e.getScrollAmount());
		
		if(e.getWheelRotation() == -1){
			System.out.println("�u�ʤ�V���W");
		}
		else if(e.getWheelRotation() == 1){
			System.out.println("�u�ʤ�V���U");
		}
    }
}