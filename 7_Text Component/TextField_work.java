import java.awt.*;
import java.awt.event.*;

public class TextField_work extends java.awt.Frame {

  public static void main(String args[]){
    new TextField_work();
  }
  
  // �غc�禡
  public TextField_work() {
    super("TextField Work");

    // �w�q Layout Manager �� FlowLayout
    setLayout(new FlowLayout());

    java.awt.TextField textfield;

    // �غc�禡 1
    textfield = new TextField();
    // �]�w��r��쪺��ܤ�r
    textfield.setText("TextField 1");
    // �]�w�I���C��
    textfield.setBackground(Color.BLUE);
    // �]�w�e���C��
    textfield.setForeground(Color.MAGENTA);
    // ����Ҧ�����r���e
    textfield.selectAll();
    add(textfield);

    // �غc�禡 2
    textfield = new TextField("TextField 2");
    // �]�w�^���r��
    textfield.setEchoChar('#');
    add(textfield);

    // �غc�禡 3
    textfield = new TextField(5);
    // �]�w��r��쪺��ܤ�r
    textfield.setText("TextField 3");
    // �]�w�O�_���\�s��
    textfield.setEditable(false);
    add(textfield);

    // �غc�禡 4
    textfield = new TextField("TextField 4",10);
    // selectionStart�ҩl��m
	textfield.setSelectionStart(6);
    // selectionEnd������m
	textfield.setSelectionEnd(8);
    add(textfield);

    // �]�w�������j�p
    this.setSize(250,100);

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
