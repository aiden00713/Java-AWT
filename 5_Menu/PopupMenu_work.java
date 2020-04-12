import java.awt.*;
import java.awt.event.*;

public class PopupMenu_work extends java.awt.Frame implements ActionListener{

  PopupMenu popupmenu ;

  String menuitemlabel[]={"A", "B", "-", "C"};
  
  String cbmenuitemlabel[]={"D", "E", "F"};
  
  MenuItem menuitem[] = new MenuItem[7];
  MenuItem submenuitem[] = new MenuItem[3];
  
  //CheckboxMenuItem checkboxmenuitem[] = new CheckboxMenuItem[3];

  // Demo only
  Label label;
  
  public static void main(String args[]){
    new PopupMenu_work();
  }
  
  // 建構函式
  public PopupMenu_work() {
    super("PopupMenu Work");

    // Demo only
    label = new Label();
    add(label, BorderLayout.SOUTH);

    // 建立突顯式選單
    popupmenu = new PopupMenu("popup menu");

    for(int i=0; i<menuitemlabel.length; i++){
      if (i==3) { // 子選單
        // 建立子選單
        Menu submenu = new Menu(menuitemlabel[i]);
        submenu.setFont(new Font("Consolas", Font.PLAIN, 12));
        
        // 建立核取方塊選單項目
        for (int j=0; j<cbmenuitemlabel.length; j++){
          submenuitem[j] = new MenuItem(cbmenuitemlabel[j]);
          
          // 設定核取方塊選單項目之選取狀態
          if (j==0)           
          submenuitem[j].setFont(new Font("Consolas", Font.PLAIN, 12));

          // 註冊 ItemListener
          submenuitem[j].addActionListener(this);
    
          // 新增核取方塊選單項目至子選單
          submenu.add(submenuitem[j]);
        }
    
        // 新增子選單至突顯式選單中
        popupmenu.add(submenu);
      }
      else if (menuitemlabel[i].equals("-")) {
        // 新增分隔線
        popupmenu.addSeparator();
      }
      else {
        // 建立選單項目
        menuitem[i] = new MenuItem(menuitemlabel[i]);

        menuitem[i].setFont(new Font("Consolas", Font.PLAIN, 12));

        // 註冊 ActionListener
        menuitem[i].addActionListener(this);

        // 新增選單項目至突顯式選單中
        popupmenu.add(menuitem[i]);
      }          
    }

    // 定義突顯式選單
    add(popupmenu);

    // 設定視窗的大小
    this.setSize(300,300);

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

    this.addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        showPopmenu(e);
      }
    });
    
    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
  
  public void showPopmenu(MouseEvent e) {
    // 當按下滑鼠按鍵時
    if (e.getButton() == MouseEvent.BUTTON3) 
      // 顯示突顯式選單
      popupmenu.show(this, e.getX(), e.getY());
  }

  // 實作ActionListener介面之方法
  public void actionPerformed(ActionEvent e) {
    // 取得產生動作事件的選單項目
    MenuItem menuitem = (MenuItem)e.getSource();

    if (menuitem.getLabel().equals("Exit")) { // Exit
      System.exit(0);
    }
    else {
      label.setText("Select "  + menuitem.getLabel() + " Menu Item.");
    }
  }
}