import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class BoxLayout_work extends javax.swing.JFrame {

  // Main method
  public static void main(String[] args) {
    UIManager.put("swing.boldMetal", Boolean.FALSE);
    JDialog.setDefaultLookAndFeelDecorated(true);
    JFrame.setDefaultLookAndFeelDecorated(true);
    Toolkit.getDefaultToolkit().setDynamicLayout(true);

    try {
      UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
    }
    catch(Exception e) {
      e.printStackTrace();
    }

    new BoxLayout_work();
  }

  // 建構函式
  public BoxLayout_work() {
    super("Rigid Area work");

    // 直接定義JFrame之Layout Manager為FlowLayout
    this.setLayout(new FlowLayout());

    JPanel jpanel = new JPanel();

    // 定義Layout Manager為BoxLayout
    // 由左至右配置
    jpanel.setLayout(new BoxLayout(jpanel, BoxLayout.X_AXIS));

    // 建立Box之Rigid Area區域
    jpanel.add(Box.createRigidArea(new Dimension(100, 100)));

    jpanel.add(new JButton("Button 1"));

    // 建立Box之Rigid Area區域
    jpanel.add(Box.createRigidArea(new Dimension(150, 150)));

    jpanel.add(new JButton("Button 2"));

    // 建立Box之Rigid Area區域
    jpanel.add(Box.createRigidArea(new Dimension(50, 50)));

    this.add(jpanel);

    // Center the frame
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = this.getSize();

    if (frameSize.height > screenSize.height)
      frameSize.height = screenSize.height;

    if (frameSize.width > screenSize.width)
      frameSize.width = screenSize.width;

    this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

    this.setVisible(true);
	this.setSize(450, 200);
    
    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
}
