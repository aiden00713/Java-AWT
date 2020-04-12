import java.awt.*;
import java.awt.event.*;

public class List_work extends java.awt.Frame implements ItemListener{
  List list;
  public static void main(String args[]){
    new List_work();
  }
  
  // 建構函式
  public List_work() {
    super("List work");

    // 定義 Layout Manager 為 GridLayout
    setLayout(new GridLayout(1,2));
	
	// 建構函式 1
	list = new List();
    // 設定List選取項目
    for (int i=0; i < 5; i++)    
      list.add("List " + i);
      
    // 設定是否允許項目被多重選擇  
    list.setMultipleMode(false);

    // 選取預設選項項目
    list.select(3);

    java.awt.Panel panel1 = new Panel();
    panel1.add(list);
    add(panel1);
	
	// 註冊 ItemListener
	list.addItemListener(this);

    // 建構函式 2
    // 可顯示的項目列數為6
    // 設定允許項目被多重選擇  
    list = new List(6, true);
    
    // 設定List選取項目（Item）
    for (int i=0; i < 10; i++)    
      list.add("List " + i);
      
    // 選取選項項目
    list.select(2);
    list.select(4);
	list.select(6);
	
    java.awt.Panel panel2 = new Panel();
    panel2.add(list);
    add(panel2);

	// 註冊 ItemListener
	list.addItemListener(this);
	
    // 設定視窗的大小
    this.setSize(420, 150);

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
  
  public void itemStateChanged(ItemEvent e) {
    String source = null;
	List check = (List)(e.getItemSelectable());
	
	if(check.isMultipleMode()==true){
		source = "Total Items：" + check.getItemCount() + "　Select Item：";
		int[] select = check.getSelectedIndexes();
		String[] list_st = check.getSelectedItems();
		
		for(int i=0; i<select.length;i++){
			if(i+1<select.length)
				source += list_st[i] + "," ;
			else
				source += list_st[i];
		}
	}else{
		source = "Total Items：" + check.getItemCount() + "　Select Item：" +check.getSelectedItem();
	}
	System.out.println(source);
  }
}