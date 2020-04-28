import java.awt.*;
import java.awt.event.*;

public class ScrollPane_Image extends java.awt.Frame {

  // Main method
  public static void main(String[] args) {
    new ScrollPane_Image();
  }

  // �غc�禡
  public ScrollPane_Image() {
    super("ScrollPane Demo");

    // �w�q Layout Manager �� BorderLayout
    setLayout(new BorderLayout());

    // ���b���O
    ScrollPane scrollpane = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
    // �䴩�ƹ��u���\��
    scrollpane.setWheelScrollingEnabled(true);

    // �ۭq���O
    ImagePanel imagepanel = new ImagePanel();
    // �]�w���m���󤧳̨Τؤo
    imagepanel.setPreferredSize(new Dimension(1024, 768));
    
    scrollpane.add(imagepanel);

    this.add(scrollpane, BorderLayout.CENTER);

    // �]�w�������j�p
    this.setSize(300, 300);

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
    
    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });    
  }
}

class ImagePanel extends java.awt.Panel {
  Image image;

  // �غc�禡
  public ImagePanel() {
    ClassLoader cl = this.getClass().getClassLoader();
    Toolkit tk = Toolkit.getDefaultToolkit();

    // ���o�Ϲ�
    image = tk.createImage(cl.getResource("image/IMG_1.jpg"));
  }

  public void paint(Graphics g) {
    // ø�s�Ϲ�
    g.drawImage(image, 0, 0, this);
  }

  public void update(Graphics g) {
    paint(g);
  }
}
