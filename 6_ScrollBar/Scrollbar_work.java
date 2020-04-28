import java.awt.*;
import java.awt.event.*;

public class Scrollbar_work extends java.awt.Frame {

  public static void main(String args[]){
    new Scrollbar_work();
  }
  
  public Scrollbar_work() {
    super("Scrollbar Work");

    // �w�q Layout Manager �� BorderLayout
    setLayout(new BorderLayout());
    java.awt.Scrollbar scrollbar;
	
	// �غc�禡
    scrollbar = new Scrollbar();
    // �]�w���b�̤j��-500
    scrollbar.setMaximum(500);
    // �]�w���b�̤p��-0
    scrollbar.setMinimum(0);
    // �]�w���b���t�m��V���������b
    scrollbar.setOrientation(Scrollbar.HORIZONTAL);
    // �]�w���b������j�p��-10
    scrollbar.setVisibleAmount(10);
    // �]�w���b���ثe��-300
    scrollbar.setValue(300);
	// �]�w���b��Block-15
	scrollbar.setBlockIncrement(15);
	//// �]�w���b��Unit-3
	scrollbar.setUnitIncrement(3);
    add(scrollbar, BorderLayout.SOUTH);

    // �غc�禡
    // �]�w�t�m��V���������b
    //     �ثe�Ȭ�300
    //     ���b����j�p�Ȭ�10
    //     �̤p�Ȭ�0
    //     �̤j�Ȭ�500
    scrollbar = new Scrollbar(Scrollbar.VERTICAL, 300, 10, 0, 500);
	// �]�w���b��Block-15
	scrollbar.setBlockIncrement(15);
	//// �]�w���b��Unit-3
	scrollbar.setUnitIncrement(3);
    add(scrollbar, BorderLayout.EAST);

    // �]�w�������j�p
    this.setSize(300,300);

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