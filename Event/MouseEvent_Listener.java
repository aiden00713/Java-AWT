import java.awt.*;
import java.awt.event.*;

// ��@MouseListener��MouseMotionListener����
public class MouseEvent_Listener extends java.awt.Frame implements MouseListener,MouseMotionListener{
  
  // Main method
  public static void main(String[] args) {
    new MouseEvent_Listener();
  }

  // �غc�禡
  public MouseEvent_Listener() {
    super("Mouse Event Listener");

    // ���U MouseListener
    this.addMouseListener(this);
	this.addMouseMotionListener(this);

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
  
  public void mouseClicked(MouseEvent e){
	  if(e.getButton() == MouseEvent.BUTTON1){
		  System.out.println("�ƹ������I��");
	  }
	  else if(e.getButton() == MouseEvent.BUTTON2){
		  System.out.println("�ƹ������I��");
	  }
	  else if(e.getButton() == MouseEvent.BUTTON3){
		  System.out.println("�ƹ��k���I��");
	  }
  }
  
  public void mouseEntered(MouseEvent e){
	System.out.println("�ƹ��i�J����");
  }
  
  public void mouseExited(MouseEvent e){
	System.out.println("�ƹ����}����");
  }
  
  public void mousePressed(MouseEvent e){
	  if(e.getButton() == MouseEvent.BUTTON1){
		  System.out.println("�ƹ�������U");
	  }
	  else if(e.getButton() == MouseEvent.BUTTON2){
		  System.out.println("�ƹ�������U");
	  }
	  else if(e.getButton() == MouseEvent.BUTTON3){
		  System.out.println("�ƹ��k����U");
	  }
  }
  
  public void mouseReleased(MouseEvent e){
	  if(e.getButton() == MouseEvent.BUTTON1){
		  System.out.println("�ƹ���������");
	  }
	  else if(e.getButton() == MouseEvent.BUTTON2){
		  System.out.println("�ƹ���������");
	  }
	  else if(e.getButton() == MouseEvent.BUTTON3){
		  System.out.println("�ƹ��k������");
	  }
  }
  
  public void mouseDragged(MouseEvent e){
	System.out.println("�ƹ��즲");
  }
  
  public void mouseMoved(MouseEvent e){
	System.out.println("�ƹ����� X�G" + e.getX() +"  Y�G" + e.getY());
  }
}