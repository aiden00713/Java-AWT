import java.awt.*;
import java.awt.event.*;

public class Label_MouseMotionListener_work extends java.awt.Frame implements MouseListener,MouseMotionListener{

  public static void main(String args[]){
    new Label_MouseMotionListener_work();
  }

  // 建構函式
  public Label_MouseMotionListener_work() {
    super("Label Mouse Motion Listener Work");
	
	//註冊MouseListener
	this.addMouseListener(this);
	this.addMouseMotionListener(this);
	
    final int row = 2;    // 列
    final int column = 3; // 行

    // 定義 Layout Manager 為 GridLayout
    setLayout(new GridLayout(row, column));
    java.awt.Label label;
 
    label = new Label("向左對齊");
    label.setAlignment(Label.LEFT); //向左對齊
    add(label);

    label = new Label("向水平中央對齊");
	label.addMouseListener((MouseListener)this);
    label.addMouseMotionListener((MouseMotionListener)this);
    label.setAlignment(Label.CENTER); //向水平中央對齊
    add(label);

    label = new Label("向右對齊", Label.RIGHT);  //向右對齊
    add(label);


    label = new Label("Serif粗體15pt", Label.CENTER);
    label.setFont(new Font("Serif",Font.BOLD,15));  //設定字體與字型
    add(label);

    // 設定顏色
    label = new Label("黃色黑色", Label.CENTER);
    // 設定背景顏色
    label.setBackground(new Color(255,255,0));  //黃色
    // 設定前景顏色
    label.setForeground(new Color(0,0,0));  //黑色
    add(label);

    // 設定滑鼠指標
    label = new Label("滑鼠指標", Label.CENTER);
    // 選擇等待滑鼠指標
    label.setCursor(new Cursor(Cursor.WAIT_CURSOR));
    add(label);

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
		  System.out.println("滑鼠左鍵點擊 X："+ e.getX() +"  Y：" + e.getY());
	  }
	  else if(e.getButton() == MouseEvent.BUTTON2){
		  System.out.println("滑鼠中鍵點擊 X："+ e.getX() +"  Y：" + e.getY());
	  }
	  else if(e.getButton() == MouseEvent.BUTTON3){
		  System.out.println("滑鼠右鍵點擊 X："+ e.getX() +"  Y：" + e.getY());
	  }
  }
  
  public void mouseEntered(MouseEvent e){
	System.out.println("滑鼠進入物件 X："+ e.getX() +"  Y：" + e.getY());
  }
  
  public void mouseExited(MouseEvent e){
	System.out.println("滑鼠離開物件 X："+ e.getX() +"  Y：" + e.getY());
  }
  
  public void mousePressed(MouseEvent e){
	  if(e.getButton() == MouseEvent.BUTTON1){
		  System.out.println("滑鼠左鍵按下 X："+ e.getX() +"  Y：" + e.getY());
	  }
	  else if(e.getButton() == MouseEvent.BUTTON2){
		  System.out.println("滑鼠中鍵按下 X："+ e.getX() +"  Y：" + e.getY());
	  }
	  else if(e.getButton() == MouseEvent.BUTTON3){
		  System.out.println("滑鼠右鍵按下 X："+ e.getX() +"  Y：" + e.getY());
	  }
  }
  
  public void mouseReleased(MouseEvent e){
	  if(e.getButton() == MouseEvent.BUTTON1){
		  System.out.println("滑鼠左鍵釋放 X："+ e.getX() +"  Y：" + e.getY());
	  }
	  else if(e.getButton() == MouseEvent.BUTTON2){
		  System.out.println("滑鼠中鍵釋放 X："+ e.getX() +"  Y：" + e.getY());
	  }
	  else if(e.getButton() == MouseEvent.BUTTON3){
		  System.out.println("滑鼠右鍵釋放 X："+ e.getX() +"  Y：" + e.getY());
	  }
  }
  
  public void mouseDragged(MouseEvent e){
	System.out.println("滑鼠拖曳 X："+ e.getX() +"  Y：" + e.getY());
  }
  
  public void mouseMoved(MouseEvent e){
	System.out.println("滑鼠移動 X：" + e.getX() +"  Y：" + e.getY());
  }
}