import java.awt.*;
import java.awt.event.*;

public class List_work extends java.awt.Frame implements ItemListener{
  List list;
  public static void main(String args[]){
    new List_work();
  }
  
  // �غc�禡
  public List_work() {
    super("List work");

    // �w�q Layout Manager �� GridLayout
    setLayout(new GridLayout(1,2));
	
	// �غc�禡 1
	list = new List();
    // �]�wList�������
    for (int i=0; i < 5; i++)    
      list.add("List " + i);
      
    // �]�w�O�_���\���سQ�h�����  
    list.setMultipleMode(false);

    // ����w�]�ﶵ����
    list.select(3);

    java.awt.Panel panel1 = new Panel();
    panel1.add(list);
    add(panel1);
	
	// ���U ItemListener
	list.addItemListener(this);

    // �غc�禡 2
    // �i��ܪ����ئC�Ƭ�6
    // �]�w���\���سQ�h�����  
    list = new List(6, true);
    
    // �]�wList������ء]Item�^
    for (int i=0; i < 10; i++)    
      list.add("List " + i);
      
    // ����ﶵ����
    list.select(2);
    list.select(4);
	list.select(6);
	
    java.awt.Panel panel2 = new Panel();
    panel2.add(list);
    add(panel2);

	// ���U ItemListener
	list.addItemListener(this);
	
    // �]�w�������j�p
    this.setSize(420, 150);

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
  
  public void itemStateChanged(ItemEvent e) {
    String source = null;
	List check = (List)(e.getItemSelectable());
	
	if(check.isMultipleMode()==true){
		source = "Total Items�G" + check.getItemCount() + "�@Select Item�G";
		int[] select = check.getSelectedIndexes();
		String[] list_st = check.getSelectedItems();
		
		for(int i=0; i<select.length;i++){
			if(i+1<select.length)
				source += list_st[i] + "," ;
			else
				source += list_st[i];
		}
	}else{
		source = "Total Items�G" + check.getItemCount() + "�@Select Item�G" +check.getSelectedItem();
	}
	System.out.println(source);
  }
}