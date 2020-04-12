import java.awt.*;
import java.awt.event.*;

public class Menu_work extends java.awt.Frame implements ActionListener{

  String menulabel[]={"File","Edit","Draw","Help"};

  String menuitemlabel[][]={
    {"New","-","Open","Save","Save As...","-","Exit"},
    {"Copy","Cut","Paste"},
    {"Shape","Line","Pot"},
    {"Help"}
  };
  String submenuitemlabel[]={"Circle","Rectangle",};
  
  int menuShortCut[][]={
    {KeyEvent.VK_N, 0, KeyEvent.VK_O, KeyEvent.VK_S, KeyEvent.VK_A, 0, KeyEvent.VK_E},
    {KeyEvent.VK_C, KeyEvent.VK_X, 0, KeyEvent.VK_V},
	{ 0, KeyEvent.VK_L, 0, KeyEvent.VK_P},
	{KeyEvent.VK_H}
  };

  int submenuShortCut[]={KeyEvent.VK_R, KeyEvent.VK_T};

  Menu menu[] = new Menu[4];
  MenuItem menuitem[][] = new MenuItem[4][7];
  MenuItem submenuitem[] = new MenuItem[2];
  // Demo only
  Label label;

  public static void main(String args[]){
    new Menu_work();
  }

  // �غc�禡
  public Menu_work() {
    super("Menu Work");

    // �w�q Layout Manager �� BorderLayout
    setLayout(new BorderLayout());
    
    // Demo only
    label = new Label();
    add(label, BorderLayout.SOUTH);

    // �إ߿��C
    MenuBar menuBar = createMenuBar();

    // �w�q�����ϥΪ̤��������C
    setMenuBar(menuBar);

    // �]�w�������j�p
    this.setSize(250, 250);

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

  private MenuBar createMenuBar() {
    // �إ߿��C
    MenuBar menuBar = new MenuBar();

    // �إ߿��
    for (int i=0; i<menulabel.length; i++){
      // �إ߿��
      menu[i] = new Menu(menulabel[i]);
      menu[i].setFont(new Font("Consolas", Font.PLAIN, 10));

      // �s�W���ܿ��C
      menuBar.add(menu[i]);
    }

    for(int i=0; i<menulabel.length; i++){  //0-1-2-3
      for(int j=0; j<menuitemlabel[i].length; j++){ 
        if (i==2 && j==0) { // �l���
          // �إߤl���
          Menu submenu = new Menu(menuitemlabel[i][j]);
          submenu.setFont(new Font("Consolas", Font.PLAIN, 12));
          
          // �إ߮֨������涵��
          for (int k=0; k<submenuitemlabel.length; k++){
            submenuitem[k] = new MenuItem(submenuitemlabel[k]);
            
            // �]�w��涵�ت����ֳt��
            submenuitem[k].setShortcut(new MenuShortcut(submenuShortCut[k], false));
            submenuitem[k].setFont(new Font("Consolas", Font.PLAIN, 12));
			
			// ���U ActionListener
			submenuitem[k].addActionListener(this);
            // �s�W�֨������涵�ئܤl���
            submenu.add(submenuitem[k]);
          }

          menu[i].add(submenu);
        }else {
          // �إ߿�涵�بèϥο��ֳt��
          if (menuShortCut[i][j] != 0) 
            menuitem[i][j] = new MenuItem(menuitemlabel[i][j], new MenuShortcut(menuShortCut[i][j], false));
          else
            menuitem[i][j] = new MenuItem(menuitemlabel[i][j]);


          menuitem[i][j].setFont(new Font("Consolas", Font.PLAIN, 12));

          // ���U ActionListener
          menuitem[i][j].addActionListener(this);
          // �s�W��涵��
          menu[i].add(menuitem[i][j]);
        }          
      }
    }

    return menuBar;
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