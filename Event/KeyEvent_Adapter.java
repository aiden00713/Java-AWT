import java.awt.*;
import java.awt.event.*;

public class KeyEvent_Adapter extends java.awt.Frame {

  // Main method
  public static void main(String[] args) {
    new KeyEvent_Adapter();
  }
  
  int dx = 0;
  int dy = 0;
  // 建構函式
  public KeyEvent_Adapter() {
    super("Key Event Adapter");

    this.addKeyListener(new KeyAdapter() {
	  public void keyPressed(KeyEvent e) {
		//int dx = 0;
		//int dy = 0;

		// 判斷是否按下Alt鍵
		if (e.isAltDown()) 
			System.out.println("按下Alt鍵") ;
    
		// 判斷是否按下Ctrl鍵
		if (e.isControlDown()) 
			System.out.println("按下Control鍵") ;
    
		// 判斷是否按下Shift鍵
		if (e.isShiftDown()) 
			System.out.println("按下Shift鍵") ;
    
		// 回傳按鍵所代表的按鍵值
		int i = e.getKeyCode() ;

		System.out.println("ASCII:" + i);

		switch(i) {
			case KeyEvent.VK_UP: 
				dy = -5;
				System.out.println("方向鍵上") ;
				break;

			case KeyEvent.VK_DOWN: 
				dy = 5;
				System.out.println("方向鍵下") ;
				break;

			case KeyEvent.VK_LEFT: 
				dx = 5;
				System.out.println("方向鍵左") ;
				break;

			case KeyEvent.VK_RIGHT:
				dx = -5;
				System.out.println("方向鍵右") ;
				break;
		}
	  }
	
	public void keyReleased(KeyEvent e) {
		System.out.println("字元: " + e.getKeyChar()) ;
	}  

	public void keyTyped(KeyEvent e) {
	}  
	 
    });
	
	this.setLocation(this.getX() + dx, this.getY() + dy);
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
  }
}