import java.awt.*;
import java.awt.event.*;

// 實作MouseListener及MouseMotionListener介面
public class MouseEvent_Listener extends java.awt.Frame implements MouseListener,MouseMotionListener{
  
  // Main method
  public static void main(String[] args) {
    new MouseEvent_Listener();
  }

  // 建構函式
  public MouseEvent_Listener() {
    super("Mouse Event Listener");

    // 註冊 MouseListener
    this.addMouseListener(this);
	this.addMouseMotionListener(this);

    // 設定視窗的大小
    this.setSize(300,300);

    // Center the frame
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = this.getSize();

    if (frameSize.height > screenSize.height)
      frameSize.height = screenSize.height;

    if (frameSize.width > screenSize.width)
      frameSize.width = screenSize.width;

    this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

    // 顯示視窗
    this.setVisible(true);

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });    
  }
  
  public void mouseClicked(MouseEvent e){
	  if(e.getButton() == MouseEvent.BUTTON1){
		  System.out.println("滑鼠左鍵點擊");
	  }
	  else if(e.getButton() == MouseEvent.BUTTON2){
		  System.out.println("滑鼠中鍵點擊");
	  }
	  else if(e.getButton() == MouseEvent.BUTTON3){
		  System.out.println("滑鼠右鍵點擊");
	  }
  }
  
  public void mouseEntered(MouseEvent e){
	System.out.println("滑鼠進入視窗");
  }
  
  public void mouseExited(MouseEvent e){
	System.out.println("滑鼠離開視窗");
  }
  
  public void mousePressed(MouseEvent e){
	  if(e.getButton() == MouseEvent.BUTTON1){
		  System.out.println("滑鼠左鍵按下");
	  }
	  else if(e.getButton() == MouseEvent.BUTTON2){
		  System.out.println("滑鼠中鍵按下");
	  }
	  else if(e.getButton() == MouseEvent.BUTTON3){
		  System.out.println("滑鼠右鍵按下");
	  }
  }
  
  public void mouseReleased(MouseEvent e){
	  if(e.getButton() == MouseEvent.BUTTON1){
		  System.out.println("滑鼠左鍵釋放");
	  }
	  else if(e.getButton() == MouseEvent.BUTTON2){
		  System.out.println("滑鼠中鍵釋放");
	  }
	  else if(e.getButton() == MouseEvent.BUTTON3){
		  System.out.println("滑鼠右鍵釋放");
	  }
  }
  
  public void mouseDragged(MouseEvent e){
	System.out.println("滑鼠拖曳");
  }
  
  public void mouseMoved(MouseEvent e){
	System.out.println("滑鼠移動 X：" + e.getX() +"  Y：" + e.getY());
  }
}