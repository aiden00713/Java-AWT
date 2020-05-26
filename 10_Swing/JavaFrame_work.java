import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class JavaFrame_work extends javax.swing.JFrame {

  // Main method
  public static void main(String[] args) {
    try {
      UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
    }
    catch(Exception e) {
      e.printStackTrace();
    }

    new JavaFrame_work();
  }

  // 建構函式
  public JavaFrame_work() {
    super("Hello MCU");

    DisplayPanel displayPanel = new DisplayPanel();
    this.setLayout(new BorderLayout());
    this.add(displayPanel, BorderLayout.CENTER);

    this.validate();
    this.setSize(new Dimension(300, 300));

    // Center the frame
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = this.getSize();
    if (frameSize.height > screenSize.height)
      frameSize.height = screenSize.height;
    if (frameSize.width > screenSize.width)
      frameSize.width = screenSize.width;
    this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

    this.setVisible(true);

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
}

class DisplayPanel extends javax.swing.JPanel {
  public DisplayPanel() {
  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);
	//(印出的字串起始 ,x 座標， y 座標)
    g.drawString("Hello MCU", 100, 100);
  }
}
