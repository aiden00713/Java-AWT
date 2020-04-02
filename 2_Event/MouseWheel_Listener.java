import java.awt.*;
import java.awt.event.*;

// 實作MouseWheelListener介面
public class MouseWheel_Listener extends java.awt.Frame implements MouseWheelListener{
  
  // Main method
  public static void main(String[] args) {
    new MouseWheel_Listener();
  }
  
  // 建構函式
  public MouseWheel_Listener() {
    super("MouseWheel Event Listener");

    // 註冊 MouseWheelListener
	this.addMouseWheelListener(this);

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
  
  public void mouseWheelMoved(MouseWheelEvent e){
	    if (e.getScrollType() == MouseWheelEvent.WHEEL_BLOCK_SCROLL) {
            System.out.println("以BLOCK為單位捲動");
        }
        if (e.getScrollType() == MouseWheelEvent.WHEEL_UNIT_SCROLL) {
            System.out.println("以UNIT為單位捲動");
        }
         
        System.out.println("滾動單位數: " + e.getScrollAmount());
		
		if(e.getWheelRotation() == -1){
			System.out.println("滾動方向為上");
		}
		else if(e.getWheelRotation() == 1){
			System.out.println("滾動方向為下");
		}
    }
}