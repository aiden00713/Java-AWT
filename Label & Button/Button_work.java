import java.awt.*;
import java.awt.event.*;

public class Button_work extends java.awt.Frame {

  public static void main(String args[]){
    new Button_work();
  }
  
  // �غc�禡
  public Button_work() {
    super("Button Work");

    final int row = 1;    // �C
    final int column = 2; // ��

    // �w�q Layout Manager �� GridLayout
    setLayout(new GridLayout(row, column));
    java.awt.Button button;

    // �]�w�r�� - �ʱ���r��
    button = new Button("Consolas�ʱ���15pt");
    button.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC,15));
    add(button);

    // �]�w�C��
    button = new Button("����Ŧ�");
    // �]�w�I���C��
    button.setBackground(new Color(0,255,0));  //���
    // �]�w�e���C��
    button.setForeground(new Color(0,0,255));  //�Ŧ�
    add(button);

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