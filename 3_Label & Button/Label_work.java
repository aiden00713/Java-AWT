import java.awt.*;
import java.awt.event.*;

public class Label_work extends java.awt.Frame {

  public static void main(String args[]){
    new Label_work();
  }

  // �غc�禡
  public Label_work() {
    super("Label Work");

    final int row = 2;    // �C
    final int column = 3; // ��

    // �w�q Layout Manager �� GridLayout
    setLayout(new GridLayout(row, column));
    java.awt.Label label;
 
    label = new Label("�V�����");
    label.setAlignment(Label.LEFT); //�V�����
    add(label);

    label = new Label("�V�����������");
    label.setAlignment(Label.CENTER); //�V�����������
    add(label);

    label = new Label("�V�k���", Label.RIGHT);  //�V�k���
    add(label);


    label = new Label("Serif����15pt", Label.CENTER);
    label.setFont(new Font("Serif",Font.BOLD,15));  //�]�w�r��P�r��
    add(label);

    // �]�w�C��
    label = new Label("����¦�", Label.CENTER);
    // �]�w�I���C��
    label.setBackground(new Color(255,255,0));  //����
    // �]�w�e���C��
    label.setForeground(new Color(0,0,0));  //�¦�
    add(label);

    // �]�w�ƹ�����
    label = new Label("�ƹ�����", Label.CENTER);
    // ��ܵ��ݷƹ�����
    label.setCursor(new Cursor(Cursor.WAIT_CURSOR));
    add(label);

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