import java.awt.*;
import java.awt.event.*;

public class TextField_Listener extends java.awt.Frame implements KeyListener, MouseListener, MouseMotionListener, TextListener{

  public static void main(String args[]){
    new TextField_Listener();
  }
  TextField textfield = new TextField();

  public TextField_Listener() {
    super("TextField Listener");

    // 定義 Layout Manager 為 FlowLayout
    setLayout(new FlowLayout());

    // 設定文字欄位的顯示文字
    textfield.setText("TextField 1");
    // 設定背景顏色
    textfield.setBackground(Color.BLUE);
    // 設定前景顏色
    textfield.setForeground(Color.MAGENTA);
    // 選取所有的文字內容
    textfield.selectAll();
	
    textfield.addKeyListener(this);
    textfield.addMouseListener(this);
    textfield.addMouseMotionListener(this);
    textfield.addTextListener(this);
	
    add(textfield);
	
    // 設定視窗的大小
    this.setSize(200,100);

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
    System.out.println("Key Pressed: " + e.getKeyCode());
  }
  
  public void keyReleased(KeyEvent e) {
    System.out.println("Char: " + e.getKeyChar());
  }
  
  public void keyTyped(KeyEvent e) {}
  
  public void mouseClicked(MouseEvent a) {
    System.out.println("按下滑鼠按鍵：" + a.getButton() + "  X: " + a.getX() + ", Y: " + a.getY());
  }
  
  public void mouseEntered(MouseEvent a) {
    System.out.println("滑鼠移至物件上方　X: " + a.getX() + ", Y: " + a.getY());
  }
  
  public void mouseExited(MouseEvent a) {
    System.out.println("滑鼠離開物件　X: " + a.getX() + ", Y: " + a.getY());
  }
  
  public void mousePressed(MouseEvent a) {
    System.out.println("按下滑鼠按鍵：" + a.getButton() + "  X: " + a.getX() + ", Y: " + a.getY());
  }
  
  public void mouseReleased(MouseEvent a) {
    System.out.println("滑鼠釋放物件　X: " + a.getX() + ", Y: " + a.getY());
  }
  
  public void mouseDragged(MouseEvent a) {
    System.out.println("按下滑鼠按鍵並拖曳滑鼠　X: " + a.getX() + ", Y: " + a.getY());
  }
  
  public void mouseMoved(MouseEvent a) {
    System.out.println("在物件上移動滑鼠　X: " + a.getX() + ", Y: " + a.getY() + ", ID: " + a.getID());
  }
  
  public void textValueChanged(TextEvent d) {
    System.out.println("文字欄位內容改變"); 
  }
}