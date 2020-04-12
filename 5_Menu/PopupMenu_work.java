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
  
  // �غc�禡
  public PopupMenu_work() {
    super("PopupMenu Work");

    // Demo only
    label = new Label();
    add(label, BorderLayout.SOUTH);

    // �إ߬��㦡���
    popupmenu = new PopupMenu("popup menu");

    for(int i=0; i<menuitemlabel.length; i++){
      if (i==3) { // �l���
        // �إߤl���
        Menu submenu = new Menu(menuitemlabel[i]);
        submenu.setFont(new Font("Consolas", Font.PLAIN, 12));
        
        // �إ߮֨������涵��
        for (int j=0; j<cbmenuitemlabel.length; j++){
          submenuitem[j] = new MenuItem(cbmenuitemlabel[j]);
          
          // �]�w�֨������涵�ؤ�������A
          if (j==0)           
          submenuitem[j].setFont(new Font("Consolas", Font.PLAIN, 12));

          // ���U ItemListener
          submenuitem[j].addActionListener(this);
    
          // �s�W�֨������涵�ئܤl���
          submenu.add(submenuitem[j]);
        }
    
        // �s�W�l���ܬ��㦡��椤
        popupmenu.add(submenu);
      }
      else if (menuitemlabel[i].equals("-")) {
        // �s�W���j�u
        popupmenu.addSeparator();
      }
      else {
        // �إ߿�涵��
        menuitem[i] = new MenuItem(menuitemlabel[i]);

        menuitem[i].setFont(new Font("Consolas", Font.PLAIN, 12));

        // ���U ActionListener
        menuitem[i].addActionListener(this);

        // �s�W��涵�ئܬ��㦡��椤
        popupmenu.add(menuitem[i]);
      }          
    }

    // �w�q���㦡���
    add(popupmenu);

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
    // ����U�ƹ������
    if (e.getButton() == MouseEvent.BUTTON3) 
      // ��ܬ��㦡���
      popupmenu.show(this, e.getX(), e.getY());
  }

  // ��@ActionListener��������k
  public void actionPerformed(ActionEvent e) {
    // ���o���Ͱʧ@�ƥ󪺿�涵��
    MenuItem menuitem = (MenuItem)e.getSource();

    if (menuitem.getLabel().equals("Exit")) { // Exit
      System.exit(0);
    }
    else {
      label.setText("Select "  + menuitem.getLabel() + " Menu Item.");
    }
  }
}