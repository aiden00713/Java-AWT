import java.awt.*;
import java.awt.event.*;

// 實作KeyListener介面
public class KeyEvent_Listener extends java.awt.Frame implements KeyListener {
  
  // Main method
  public static void main(String[] args) {
    new KeyEvent_Listener();
  }

  // 建構函式
  public KeyEvent_Listener() {
    super("Key Event Listener");

    // 註冊 KeyListener
    this.addKeyListener(this);    

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
  
  public void keyPressed(KeyEvent e) {
    int dx = 0;
    int dy = 0;

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
		System.out.println("上移視窗") ;
        break;

      case KeyEvent.VK_DOWN: 
        dy = 5;
		System.out.println("下移視窗") ;
        break;

      case KeyEvent.VK_LEFT: 
        dx = -5;
		System.out.println("左移視窗") ;
        break;


      case KeyEvent.VK_RIGHT: 
        dx = 5;
		System.out.println("右移視窗") ;
        break;
    }
    this.setLocation(this.getX() + dx, this.getY() + dy);
  }  

  public void keyReleased(KeyEvent e) {
    System.out.println("字元: " + e.getKeyChar()) ;
  }  

  public void keyTyped(KeyEvent e) {
  }  
}
