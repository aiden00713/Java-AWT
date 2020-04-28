import java.awt.*;
import java.awt.event.*;

public class Scrollbar_work extends java.awt.Frame {

  public static void main(String args[]){
    new Scrollbar_work();
  }
  
  public Scrollbar_work() {
    super("Scrollbar Work");

    // 定義 Layout Manager 為 BorderLayout
    setLayout(new BorderLayout());
    java.awt.Scrollbar scrollbar;
	
	// 建構函式
    scrollbar = new Scrollbar();
    // 設定捲軸最大值-500
    scrollbar.setMaximum(500);
    // 設定捲軸最小值-0
    scrollbar.setMinimum(0);
    // 設定捲軸的配置方向為水平捲軸
    scrollbar.setOrientation(Scrollbar.HORIZONTAL);
    // 設定捲軸方塊的大小值-10
    scrollbar.setVisibleAmount(10);
    // 設定捲軸之目前值-300
    scrollbar.setValue(300);
	// 設定捲軸之Block-15
	scrollbar.setBlockIncrement(15);
	//// 設定捲軸之Unit-3
	scrollbar.setUnitIncrement(3);
    add(scrollbar, BorderLayout.SOUTH);

    // 建構函式
    // 設定配置方向為垂直捲軸
    //     目前值為300
    //     捲軸方塊大小值為10
    //     最小值為0
    //     最大值為500
    scrollbar = new Scrollbar(Scrollbar.VERTICAL, 300, 10, 0, 500);
	// 設定捲軸之Block-15
	scrollbar.setBlockIncrement(15);
	//// 設定捲軸之Unit-3
	scrollbar.setUnitIncrement(3);
    add(scrollbar, BorderLayout.EAST);

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