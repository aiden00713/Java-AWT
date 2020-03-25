import java.awt.*;
import java.awt.event.*;

public class Button_work extends java.awt.Frame {

  public static void main(String args[]){
    new Button_work();
  }
  
  // 建構函式
  public Button_work() {
    super("Button Work");

    final int row = 1;    // 列
    final int column = 2; // 行

    // 定義 Layout Manager 為 GridLayout
    setLayout(new GridLayout(row, column));
    java.awt.Button button;

    // 設定字型 - 粗斜體字型
    button = new Button("Consolas粗斜體15pt");
    button.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC,15));
    add(button);

    // 設定顏色
    button = new Button("綠色藍色");
    // 設定背景顏色
    button.setBackground(new Color(0,255,0));  //綠色
    // 設定前景顏色
    button.setForeground(new Color(0,0,255));  //藍色
    add(button);

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
}