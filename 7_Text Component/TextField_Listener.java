import java.awt.*;
import java.awt.event.*;

public class TextField_Listener extends java.awt.Frame implements KeyListener, MouseListener, MouseMotionListener, TextListener{

  public static void main(String args[]){
    new TextField_Listener();
  }
  TextField textfield = new TextField();

  public TextField_Listener() {
    super("TextField Listener");

    // �w�q Layout Manager �� FlowLayout
    setLayout(new FlowLayout());

    // �]�w��r��쪺��ܤ�r
    textfield.setText("TextField 1");
    // �]�w�I���C��
    textfield.setBackground(Color.BLUE);
    // �]�w�e���C��
    textfield.setForeground(Color.MAGENTA);
    // ����Ҧ�����r���e
    textfield.selectAll();
	
    textfield.addKeyListener(this);
    textfield.addMouseListener(this);
    textfield.addMouseMotionListener(this);
    textfield.addTextListener(this);
	
    add(textfield);
	
    // �]�w�������j�p
    this.setSize(200,100);

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