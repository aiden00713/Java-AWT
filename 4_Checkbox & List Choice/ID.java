import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class ID extends java.awt.Frame implements ActionListener,MouseListener{
  
  Label label0;  //��ܴ���
  Label label1;  //�a��
  Label label2;  //�ʧO
  Label label3;  //���ͦr��
  Choice choice;  //�a�Ͽ��
  Checkbox[] checkbox = new Checkbox[2];  //�ʧO��ܨk/�k
  CheckboxGroup group;
  Panel panel1;
  Panel panel2;
  Button button; //���ͫ��s
  static int[] A1 = new int[] {  //�}�Y�U�����^���ഫ�Ʀr
      10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 
	  21, 22, 35, 23, 24, 27, 28, 29, 32, 30, 33 };
	  
  static char[] A2 = new char[] { //�}�Y�U�����^��
      'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 
	  'M', 'N', 'O', 'P', 'Q', 'T', 'U', 'V', 'W', 'X', 'Z' };
  
  
  public static void main(String args[]){
    new ID();
  }
  
  public ID(){
	  super("�����Ҧr�����;�");
	  //���UMouseListener
	  this.addMouseListener(this);
	  
	  //�w�q Layout Manager �� GridLayout
      setLayout(new GridLayout(7,1));
	  
	  label0 = new Label("") ;//���ܤ�r
	  label0.setAlignment(label0.CENTER); //��m�ܤ�
	  label0.setFont(new Font("",Font.BOLD,20)); //�]�w�r��P�r��
	  label0.setForeground(new Color(255,0,0)); //����
	  add(label0);
	  
	  label1 = new Label("�a��") ;
	  label1.setAlignment(label1.CENTER); //��m�ܤ�
	  label1.setFont(new Font("",Font.BOLD,15)); //�]�w�r��
	  label1.setForeground(new Color(255,0,0)); //����
	  add(label1);
	  label1.addMouseListener((MouseListener)this);
	  
	  panel1 = new Panel();
	  choice = new Choice();
	  choice.add("�@�@�@�O�_���@�@�@");  //10
	  choice.add("�@�@�@�O�����@�@�@");  //11
	  choice.add("�@�@�@�򶩥��@�@�@");  //12
	  choice.add("�@�@�@�O�n���@�@�@");  //13
	  choice.add("�@�@�@�������@�@�@");  //14
	  choice.add("�@�@�@�s�_���@�@�@");  //15
	  choice.add("�@�@�@�y�����@�@�@");  //16
	  choice.add("�@�@�@��饫�@�@�@");  //17
	  choice.add("�@�@�@�Ÿq���@�@�@");  //34
	  choice.add("�@�@�@�s�˿��@�@�@");  //18
	  choice.add("�@�@�@�]�߿��@�@�@");  //19
	  choice.add("�@�@�@�n�뿤�@�@�@");  //21
	  choice.add("�@�@�@���ƿ��@�@�@");  //22
	  choice.add("�@�@�@�s�˥��@�@�@");  //35
	  choice.add("�@�@�@���L���@�@�@");  //23
	  choice.add("�@�@�@�Ÿq���@�@�@");  //24
	  choice.add("�@�@�@�̪F���@�@�@");  //27
	  choice.add("�@�@�@�Ὤ���@�@�@");  //28
	  choice.add("�@�@�@�O�F���@�@�@");  //29
	  choice.add("�@�@�@�������@�@�@");  //32
	  choice.add("�@�@�@��򿤡@�@�@");  //30
	  choice.add("�@�@�@�s�����@�@  ");  //33
	  
	  choice.addMouseListener((MouseListener)this);
	  panel1.add(choice);
	  add(panel1);
	  panel1.addMouseListener((MouseListener)this);
	  
	  
	  label2 = new Label("�ʧO") ;
	  label2.setAlignment(label2.CENTER); //��m�ܤ�
	  label2.setFont(new Font("",Font.BOLD,15)); //�]�w�r��
	  label2.setForeground(new Color(255,0,0)); //����
	  add(label2);
	  label2.addMouseListener((MouseListener)this);
	  
	  panel2 = new Panel();
	  group = new CheckboxGroup();
	  checkbox[0] = new Checkbox();
	  checkbox[0].setLabel("�k");
      checkbox[0].setFont(new Font("",Font.BOLD, 15));
      checkbox[0].setCheckboxGroup(this.group);
      checkbox[0].addMouseListener((MouseListener)this);
      panel2.add(checkbox[0]);
      checkbox[1] = new Checkbox();
      checkbox[1].setLabel("�k");
      checkbox[1].setFont(new Font("",Font.BOLD, 15));
      checkbox[1].setCheckboxGroup(this.group);
	  checkbox[1].addMouseListener((MouseListener)this);
	  panel2.add(checkbox[1]);
	  group.setSelectedCheckbox(checkbox[0]);
	  add(panel2);
	  panel2.addMouseListener((MouseListener)this);
	  
	  
	  button = new Button("����");
	  button.addMouseListener((MouseListener)this);
	  button.addActionListener(this);
	  add(button);
	  
	  label3 = new Label();
	  label3.setAlignment(label3.CENTER); //��m�ܤ�
	  label3.setFont(new Font("",Font.BOLD,30)); //�]�w�r��
	  label3.setForeground(new Color(255,0,0)); //����
	  add(label3);
	
	// �]�w�������j�p
    this.setSize(500,500);
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
  
  //�r�����ͭp��
  public void Show() {
    int[] arrayOfInt = new int[11];
    arrayOfInt[0] = A1[this.choice.getSelectedIndex()] / 10;
    arrayOfInt[1] = A1[this.choice.getSelectedIndex()] % 10;
    if (this.checkbox[0].getState()) {
      arrayOfInt[2] = 1;
    } else if (this.checkbox[1].getState()) {
      arrayOfInt[2] = 2;
    } 

    for (int i=3;i<=10;i++){
	  arrayOfInt[i] = (int)(Math.random() * 10.0D);
	}
      
    int no = arrayOfInt[9] * 1 + arrayOfInt[8] * 2 + arrayOfInt[7] * 3 + arrayOfInt[6] * 4 + arrayOfInt[5] * 5 + arrayOfInt[4] * 6 + arrayOfInt[3] * 7 + arrayOfInt[2] * 8 + arrayOfInt[1] * 9 + arrayOfInt[0] * 1;
    if (no % 10 == 0) {
      arrayOfInt[10] = 0;
    } else {
      arrayOfInt[10] = 10 - no % 10;
    } 
    String str = Character.toString(A2[this.choice.getSelectedIndex()]);
    for (byte b = 2; b <= 10; b++)
      str = str + Integer.toString(arrayOfInt[b]); 
    this.label3.setText(str);
  }
  
  //���s�ʧ@�ƥ�
  public void actionPerformed(ActionEvent paramActionEvent) {
    Show();
  }
  
  //�ƹ��ʧ@�ƥ�
  public void mouseClicked(MouseEvent e) {}

  public void mouseEntered(MouseEvent e) {
    if (e.getSource().equals(label1) || e.getSource().equals(panel1) || e.getSource().equals(choice) ) {
      ID.this.label0.setText("�п�ܦa�ϡI");
    } else if (e.getSource().equals(label2) || e.getSource().equals(panel2) || e.getSource().equals(checkbox[0]) || e.getSource().equals(checkbox[1])) {
      ID.this.label0.setText("�п�ܩʧO�I");
    } else if (e.getSource().equals(button)) {
      ID.this.label0.setText("��n��A�����͡I");
    } 
  }

  public void mouseExited(MouseEvent e) {
    ID.this.label0.setText(" ");
  }

  public void mousePressed(MouseEvent e) {}
  public void mouseReleased(MouseEvent e) {}
}