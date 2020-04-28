import java.awt.*;
import java.awt.event.*;

public class TextArea_Listener extends java.awt.Frame implements KeyListener, MouseListener, MouseMotionListener, TextListener{

  public static void main(String args[]){
    new TextArea_Listener();
  }
  TextArea textarea = new TextArea();
  Panel panel1 = new Panel();
  public TextArea_Listener() {
    super("TextArea Listener");

    // �w�q Layout Manager �� FlowLayout
    setLayout(new FlowLayout());
	textarea.setText("Hello world");
    // �]�wTextArea����ܦC��
    textarea.setRows(5);
    // �]�wTextArea����ܦ��
    textarea.setColumns(10);

    panel1.add(textarea);
    add(panel1);
   
    textarea.addKeyListener(this);
    textarea.addMouseListener(this);
    textarea.addMouseMotionListener(this);
    textarea.addTextListener(this);

    // �]�w�������j�p
    this.setSize(200,200);

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
  
  public void keyPressed(KeyEvent e) {
    System.out.println("Key Pressed: " + e.getKeyCode());
  }
  
  public void keyReleased(KeyEvent e) {
    System.out.println("Char: " + e.getKeyChar());
  }
  
  public void keyTyped(KeyEvent e) {}
  
  public void mouseClicked(MouseEvent a) {
    System.out.println("���U�ƹ�����G" + a.getButton() + "  X: " + a.getX() + ", Y: " + a.getY());
  }
  
  public void mouseEntered(MouseEvent a) {
    System.out.println("�ƹ����ܪ���W��@X: " + a.getX() + ", Y: " + a.getY());
  }
  
  public void mouseExited(MouseEvent a) {
    System.out.println("�ƹ����}����@X: " + a.getX() + ", Y: " + a.getY());
  }
  
  public void mousePressed(MouseEvent a) {
    System.out.println("���U�ƹ�����G" + a.getButton() + "  X: " + a.getX() + ", Y: " + a.getY());
  }
  
  public void mouseReleased(MouseEvent a) {
    System.out.println("�ƹ����񪫥�@X: " + a.getX() + ", Y: " + a.getY());
  }
  
  public void mouseDragged(MouseEvent a) {
    System.out.println("���U�ƹ�����é즲�ƹ��@X: " + a.getX() + ", Y: " + a.getY());
  }
  
  public void mouseMoved(MouseEvent a) {
    System.out.println("�b����W���ʷƹ��@X: " + a.getX() + ", Y: " + a.getY() + ", ID: " + a.getID());
  }
  
  public void textValueChanged(TextEvent d) {
    System.out.println("��r��줺�e����"); 
  }
}