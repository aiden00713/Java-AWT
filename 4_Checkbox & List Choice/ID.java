import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class ID extends java.awt.Frame implements ActionListener,MouseListener{
  
  Label label0;  //顯示提示
  Label label1;  //地區
  Label label2;  //性別
  Label label3;  //產生字號
  Choice choice;  //地區選擇
  Checkbox[] checkbox = new Checkbox[2];  //性別選擇男/女
  CheckboxGroup group;
  Panel panel1;
  Panel panel2;
  Button button; //產生按鈕
  static int[] A1 = new int[] {  //開頭各縣市英文轉換數字
      10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 
	  21, 22, 35, 23, 24, 27, 28, 29, 32, 30, 33 };
	  
  static char[] A2 = new char[] { //開頭各縣市英文
      'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 
	  'M', 'N', 'O', 'P', 'Q', 'T', 'U', 'V', 'W', 'X', 'Z' };
  
  
  public static void main(String args[]){
    new ID();
  }
  
  public ID(){
	  super("身分證字號產生器");
	  //註冊MouseListener
	  this.addMouseListener(this);
	  
	  //定義 Layout Manager 為 GridLayout
      setLayout(new GridLayout(7,1));
	  
	  label0 = new Label("") ;//提示文字
	  label0.setAlignment(label0.CENTER); //位置至中
	  label0.setFont(new Font("",Font.BOLD,20)); //設定字體與字型
	  label0.setForeground(new Color(255,0,0)); //紅色
	  add(label0);
	  
	  label1 = new Label("地區") ;
	  label1.setAlignment(label1.CENTER); //位置至中
	  label1.setFont(new Font("",Font.BOLD,15)); //設定字體
	  label1.setForeground(new Color(255,0,0)); //紅色
	  add(label1);
	  label1.addMouseListener((MouseListener)this);
	  
	  panel1 = new Panel();
	  choice = new Choice();
	  choice.add("　　　臺北市　　　");  //10
	  choice.add("　　　臺中市　　　");  //11
	  choice.add("　　　基隆市　　　");  //12
	  choice.add("　　　臺南市　　　");  //13
	  choice.add("　　　高雄市　　　");  //14
	  choice.add("　　　新北市　　　");  //15
	  choice.add("　　　宜蘭縣　　　");  //16
	  choice.add("　　　桃園市　　　");  //17
	  choice.add("　　　嘉義市　　　");  //34
	  choice.add("　　　新竹縣　　　");  //18
	  choice.add("　　　苗栗縣　　　");  //19
	  choice.add("　　　南投縣　　　");  //21
	  choice.add("　　　彰化縣　　　");  //22
	  choice.add("　　　新竹市　　　");  //35
	  choice.add("　　　雲林縣　　　");  //23
	  choice.add("　　　嘉義縣　　　");  //24
	  choice.add("　　　屏東縣　　　");  //27
	  choice.add("　　　花蓮縣　　　");  //28
	  choice.add("　　　臺東縣　　　");  //29
	  choice.add("　　　金門縣　　　");  //32
	  choice.add("　　　澎湖縣　　　");  //30
	  choice.add("　　　連江縣　　  ");  //33
	  
	  choice.addMouseListener((MouseListener)this);
	  panel1.add(choice);
	  add(panel1);
	  panel1.addMouseListener((MouseListener)this);
	  
	  
	  label2 = new Label("性別") ;
	  label2.setAlignment(label2.CENTER); //位置至中
	  label2.setFont(new Font("",Font.BOLD,15)); //設定字體
	  label2.setForeground(new Color(255,0,0)); //紅色
	  add(label2);
	  label2.addMouseListener((MouseListener)this);
	  
	  panel2 = new Panel();
	  group = new CheckboxGroup();
	  checkbox[0] = new Checkbox();
	  checkbox[0].setLabel("男");
      checkbox[0].setFont(new Font("",Font.BOLD, 15));
      checkbox[0].setCheckboxGroup(this.group);
      checkbox[0].addMouseListener((MouseListener)this);
      panel2.add(checkbox[0]);
      checkbox[1] = new Checkbox();
      checkbox[1].setLabel("女");
      checkbox[1].setFont(new Font("",Font.BOLD, 15));
      checkbox[1].setCheckboxGroup(this.group);
	  checkbox[1].addMouseListener((MouseListener)this);
	  panel2.add(checkbox[1]);
	  group.setSelectedCheckbox(checkbox[0]);
	  add(panel2);
	  panel2.addMouseListener((MouseListener)this);
	  
	  
	  button = new Button("產生");
	  button.addMouseListener((MouseListener)this);
	  button.addActionListener(this);
	  add(button);
	  
	  label3 = new Label();
	  label3.setAlignment(label3.CENTER); //位置至中
	  label3.setFont(new Font("",Font.BOLD,30)); //設定字體
	  label3.setForeground(new Color(255,0,0)); //紅色
	  add(label3);
	
	// 設定視窗的大小
    this.setSize(500,500);
    // Center the frame
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = this.getSize();

    if (frameSize.height > screenSize.height)
      frameSize.height = screenSize.height;

    if (frameSize.width > screenSize.width)
      frameSize.width = screenSize.width;

    this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

    // 顯示視窗
    this.setVisible(true);

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
  
  //字號產生計算
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
  
  //按鈕動作事件
  public void actionPerformed(ActionEvent paramActionEvent) {
    Show();
  }
  
  //滑鼠動作事件
  public void mouseClicked(MouseEvent e) {}

  public void mouseEntered(MouseEvent e) {
    if (e.getSource().equals(label1) || e.getSource().equals(panel1) || e.getSource().equals(choice) ) {
      ID.this.label0.setText("請選擇地區！");
    } else if (e.getSource().equals(label2) || e.getSource().equals(panel2) || e.getSource().equals(checkbox[0]) || e.getSource().equals(checkbox[1])) {
      ID.this.label0.setText("請選擇性別！");
    } else if (e.getSource().equals(button)) {
      ID.this.label0.setText("選好後再按產生！");
    } 
  }

  public void mouseExited(MouseEvent e) {
    ID.this.label0.setText(" ");
  }

  public void mousePressed(MouseEvent e) {}
  public void mouseReleased(MouseEvent e) {}
}