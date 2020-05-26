import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class SpringLayout_work extends javax.swing.JFrame {

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

    new SpringLayout_work();
  }

  // �غc�禡
  public SpringLayout_work() {
    super("Spring Layout work");

    // �����w�qJFrame��Layout Manager��BorderLayout
    this.setLayout(new BorderLayout());

    // ���o�ثe��Class Loader
    ClassLoader cl = this.getClass().getClassLoader();
    
    JPanel jpanel = new JPanel();
    // �w�qJPanel��Layout Manager��SpringLayout
    jpanel.setLayout(new SpringLayout());

    // ���oJPanel��Layout Manager
    SpringLayout layout = (SpringLayout)jpanel.getLayout();
    
    // JButton 1
    JButton jbutton1 = new JButton(new ImageIcon(cl.getResource("images/github.png")));
    jpanel.add(jbutton1);
    
    // �]�wSpring����A�N����t�����̨ζZ��
    Spring x = Spring.constant(10);
    Spring y = Spring.constant(10);
    // ���o���󪺭���
    SpringLayout.Constraints spConstraints = layout.getConstraints(jbutton1);
    // �]�wSpring�������ݩʭ�
    spConstraints.setX(x);
    // �]�wSpring�������ݩʭ�
    spConstraints.setY(y);

    // JButton 2-5
	for(int i=0;i<4;i++){
		
		JButton jbutton = new JButton(new ImageIcon(cl.getResource("images/github.png")));
		jpanel.add(jbutton);
    
		// �H��Spring���󪺬ۥ[�w�qSpring����
		x = Spring.sum(Spring.constant(20), spConstraints.getConstraint(SpringLayout.EAST)); 
		y = Spring.sum(Spring.constant(20), spConstraints.getConstraint(SpringLayout.SOUTH)); 
		// ���o���󪺭���
		spConstraints = layout.getConstraints(jbutton);
		// �]�wSpring�������ݩʭ�
		spConstraints.setX(x);
		// �]�wSpring�������ݩʭ�
		spConstraints.setY(y);
	}
	
    this.add(jpanel, BorderLayout.CENTER);

    // Center the frame
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = this.getSize();

    if (frameSize.height > screenSize.height)
      frameSize.height = screenSize.height;

    if (frameSize.width > screenSize.width)
      frameSize.width = screenSize.width;

    this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

    // ��ܵ���
    this.setVisible(true);
    this.setSize(600, 500);
	
    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
}