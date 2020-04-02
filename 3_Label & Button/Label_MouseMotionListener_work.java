import java.awt.*;
import java.awt.event.*;

public class Label_MouseMotionListener_work extends java.awt.Frame implements MouseListener,MouseMotionListener{

  public static void main(String args[]){
    new Label_MouseMotionListener_work();
  }

  // �غc�禡
  public Label_MouseMotionListener_work() {
    super("Label Mouse Motion Listener Work");
	
	//���UMouseListener
	this.addMouseListener(this);
	this.addMouseMotionListener(this);
	
    final int row = 2;    // �C
    final int column = 3; // ��

    // �w�q Layout Manager �� GridLayout
    setLayout(new GridLayout(row, column));
    java.awt.Label label;
 
    label = new Label("�V�����");
    label.setAlignment(Label.LEFT); //�V�����
    add(label);

    label = new Label("�V�����������");
	label.addMouseListener((MouseListener)this);
    label.addMouseMotionListener((MouseMotionListener)this);
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
  
  public void mouseClicked(MouseEvent e){
	  if(e.getButton() == MouseEvent.BUTTON1){
		  System.out.println("�ƹ������I�� X�G"+ e.getX() +"  Y�G" + e.getY());
	  }
	  else if(e.getButton() == MouseEvent.BUTTON2){
		  System.out.println("�ƹ������I�� X�G"+ e.getX() +"  Y�G" + e.getY());
	  }
	  else if(e.getButton() == MouseEvent.BUTTON3){
		  System.out.println("�ƹ��k���I�� X�G"+ e.getX() +"  Y�G" + e.getY());
	  }
  }
  
  public void mouseEntered(MouseEvent e){
	System.out.println("�ƹ��i�J���� X�G"+ e.getX() +"  Y�G" + e.getY());
  }
  
  public void mouseExited(MouseEvent e){
	System.out.println("�ƹ����}���� X�G"+ e.getX() +"  Y�G" + e.getY());
  }
  
  public void mousePressed(MouseEvent e){
	  if(e.getButton() == MouseEvent.BUTTON1){
		  System.out.println("�ƹ�������U X�G"+ e.getX() +"  Y�G" + e.getY());
	  }
	  else if(e.getButton() == MouseEvent.BUTTON2){
		  System.out.println("�ƹ�������U X�G"+ e.getX() +"  Y�G" + e.getY());
	  }
	  else if(e.getButton() == MouseEvent.BUTTON3){
		  System.out.println("�ƹ��k����U X�G"+ e.getX() +"  Y�G" + e.getY());
	  }
  }
  
  public void mouseReleased(MouseEvent e){
	  if(e.getButton() == MouseEvent.BUTTON1){
		  System.out.println("�ƹ��������� X�G"+ e.getX() +"  Y�G" + e.getY());
	  }
	  else if(e.getButton() == MouseEvent.BUTTON2){
		  System.out.println("�ƹ��������� X�G"+ e.getX() +"  Y�G" + e.getY());
	  }
	  else if(e.getButton() == MouseEvent.BUTTON3){
		  System.out.println("�ƹ��k������ X�G"+ e.getX() +"  Y�G" + e.getY());
	  }
  }
  
  public void mouseDragged(MouseEvent e){
	System.out.println("�ƹ��즲 X�G"+ e.getX() +"  Y�G" + e.getY());
  }
  
  public void mouseMoved(MouseEvent e){
	System.out.println("�ƹ����� X�G" + e.getX() +"  Y�G" + e.getY());
  }
}